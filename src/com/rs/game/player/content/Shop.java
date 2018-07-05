package com.rs.game.player.content;

import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.Settings;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemSetsKeyGenerator;

public class Shop {

    private static final int MAIN_STOCK_ITEMS_KEY = ItemSetsKeyGenerator.generateKey();

    private static final int MAX_SHOP_ITEMS = 40;
    public static final int COINS = 995, TOKKUL = 6529;

    private String name;
    private Item[] mainStock;
    private int[] defaultQuantity;
    private Item[] generalStock;
    private int money;
    private CopyOnWriteArrayList<Player> viewingPlayers;

    public Shop(String name, int money, Item[] mainStock, boolean isGeneralStore) {
	viewingPlayers = new CopyOnWriteArrayList<Player>();
	this.name = name;
	this.money = money;
	this.mainStock = mainStock;
	defaultQuantity = new int[mainStock.length];
	for (int i = 0; i < defaultQuantity.length; i++)
	    defaultQuantity[i] = mainStock[i].getAmount();
	if (isGeneralStore && mainStock.length < MAX_SHOP_ITEMS)
	    generalStock = new Item[MAX_SHOP_ITEMS - mainStock.length];
    }

    public boolean isGeneralStore() {
	return generalStock != null;
    }

    public void addPlayer(final Player player) {
	viewingPlayers.add(player);
	player.getTemporaryAttributtes().put("Shop", this);
	player.setCloseInterfacesEvent(new Runnable() {
	    @Override
	    public void run() {
		viewingPlayers.remove(player);
		player.getTemporaryAttributtes().remove("Shop");
		player.getTemporaryAttributtes().remove("shop_transaction");
		player.getTemporaryAttributtes().remove("isShopBuying");
		player.getTemporaryAttributtes().remove("ShopSelectedSlot");
		player.getTemporaryAttributtes().remove("ShopSelectedInventory");
	    }
	});
	player.refreshVerboseShopDisplayMode();
	player.getVarsManager().sendVar(118, generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY); 
	player.getVarsManager().sendVar(1496, -1); // sample items container id (TODO: add support for it)
	player.getVarsManager().sendVar(532, money);
	resetSelected(player);
	sendStore(player);
	player.getInterfaceManager().sendInterface(1265); // opens shop
	resetTransaction(player);
	setBuying(player, true);
	if (generalStock != null)
	    player.getPackets().sendHideIComponent(1265, 19, false); // unlocks general store icon
	player.getPackets().sendIComponentSettings(1265, 20, 0, getStoreSize(), 1150); // unlocks stock slots
	sendInventory(player);
	player.getPackets().sendIComponentText(1265, 85, name);
    }

    public void resetTransaction(Player player) {
	setTransaction(player, 1);
    }

    public void increaseTransaction(Player player, int amount) {
	setTransaction(player, getTransaction(player) + amount);
    }

    public int getTransaction(Player player) {
	Integer transaction = (Integer) player.getTemporaryAttributtes().get("shop_transaction");
	return transaction == null ? 1 : transaction;
    }

    public void pay(Player player) {
	Integer selectedSlot = (Integer) player.getTemporaryAttributtes().get("ShopSelectedSlot");
	Boolean inventory = (Boolean) player.getTemporaryAttributtes().get("ShopSelectedInventory");
	if (selectedSlot == null || inventory == null)
	    return;
	int amount = getTransaction(player);
	if (inventory)
	    sell(player, selectedSlot, amount);
	else
	    buy(player, selectedSlot, amount);
    }

    public int getSelectedMaxAmount(Player player) {
	Integer selectedSlot = (Integer) player.getTemporaryAttributtes().get("ShopSelectedSlot");
	Boolean inventory = (Boolean) player.getTemporaryAttributtes().get("ShopSelectedInventory");
	if (selectedSlot == null || inventory == null)
	    return 1;
	if (inventory) {
	    Item item = player.getInventory().getItem(selectedSlot);
	    if (item == null)
		return 1;
	    return player.getInventory().getAmountOf(item.getId());
	} else {
	    if (selectedSlot >= getStoreSize())
		return 1;
	    Item item = selectedSlot >= mainStock.length ? generalStock[selectedSlot - mainStock.length] : mainStock[selectedSlot];
	    if (item == null)
		return 1;
	    return item.getAmount();
	}
    }

    public void setTransaction(Player player, int amount) {
	int max = getSelectedMaxAmount(player);
	if (amount > max)
	    amount = max;
	else if (amount < 1)
	    amount = 1;
	player.getTemporaryAttributtes().put("shop_transaction", amount);
	player.getVarsManager().sendVar(2564, amount);
    }

    public static void setBuying(Player player, boolean buying) {
	player.getTemporaryAttributtes().put("isShopBuying", buying);
	player.getVarsManager().sendVar(2565, buying ? 0 : 1);
    }

    public static boolean isBuying(Player player) {
	Boolean isBuying = (Boolean) player.getTemporaryAttributtes().get("isShopBuying");
	return isBuying != null && isBuying;
    }

    public void sendInventory(Player player) {
	player.getInterfaceManager().sendInventoryInterface(1266);
	player.getPackets().sendItems(93, player.getInventory().getItems());
	player.getPackets().sendUnlockIComponentOptionSlots(1266, 0, 0, 27, 0, 1, 2, 3, 4, 5);
	player.getPackets().sendInterSetItemsOptionsScript(1266, 0, 93, 4, 7, "Value", "Sell 1", "Sell 5", "Sell 10", "Sell 50", "Examine");
    }

    public void buyAll(Player player, int slotId) {
	if (slotId >= getStoreSize())
	    return;
	Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
	buy(player, slotId, item.getAmount());
    }

    public void buy(Player player, int slotId, int quantity) {
	if (slotId >= getStoreSize())
	    return;
	Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
	if (item == null)
	    return;
	if (item.getAmount() == 0) {
	    player.getPackets().sendGameMessage("There is no stock of that item at the moment.");
	    return;
	}
	int dq = slotId >= mainStock.length ? 0 : defaultQuantity[slotId];
	int price = getBuyPrice(player, item, dq);
	if (price <= 0)
		return;
	int amountCoins = money == COINS ? player.getInventory().getCoinsAmount() : player.getInventory().getItems().getNumberOf(money);
	int maxQuantity = amountCoins / price;
	int buyQ = item.getAmount() > quantity ? quantity : item.getAmount();

	boolean enoughCoins = maxQuantity >= buyQ;
	if (player.isPker && isGeneralStore()) {
		player.sm("Pkers are not allowed to use the general store.");
		return;
	}
	if (!enoughCoins) {
	    player.getPackets().sendGameMessage("You don't have enough " + ItemDefinitions.getItemDefinitions(money).getName().toLowerCase() + ".");
	    buyQ = maxQuantity;
	} else if (quantity > buyQ)
	    player.getPackets().sendGameMessage("The shop has run out of stock.");
	if (item.getDefinitions().isStackable()) {
	    if (player.getInventory().getFreeSlots() < 1) {
		player.getPackets().sendGameMessage("Not enough space in your inventory.");
		return;
	    }
	} else {
	    int freeSlots = player.getInventory().getFreeSlots();
	    if (buyQ > freeSlots) {
		buyQ = freeSlots;
		player.getPackets().sendGameMessage("Not enough space in your inventory.");
	    }
	}
	if (buyQ != 0) {
	    int totalPrice = price * buyQ;
	    if (player.getInventory().removeItemMoneyPouch(new Item(money, totalPrice))) {
	    	player.shopLog(player, item.getId(), item.getAmount(), false);
		player.getInventory().addItem(item.getId(), buyQ);
		item.setAmount(item.getAmount() - buyQ);
		if (item.getAmount() <= 0 && slotId >= mainStock.length)
		    generalStock[slotId - mainStock.length] = null;
		refreshShop();
		resetSelected(player);
	    }
	}
    }

    public void restoreItems() {
	boolean needRefresh = false;
	for (int i = 0; i < mainStock.length; i++) {
	    if (mainStock[i].getAmount() < defaultQuantity[i]) {
		mainStock[i].setAmount(mainStock[i].getAmount() + 1);
		needRefresh = true;
	    } else if (mainStock[i].getAmount() > defaultQuantity[i]) {
		mainStock[i].setAmount(mainStock[i].getAmount() + -1);
		needRefresh = true;
	    }
	}
	if (generalStock != null) {
	    for (int i = 0; i < generalStock.length; i++) {
		Item item = generalStock[i];
		if (item == null)
		    continue;
		item.setAmount(item.getAmount() - 1);
		if (item.getAmount() <= 0)
		    generalStock[i] = null;
		needRefresh = true;
	    }
	}
	if (needRefresh)
	    refreshShop();
    }

    private boolean addItem(int itemId, int quantity) {
	for (Item item : mainStock) {
	    if (item.getId() == itemId) {
		item.setAmount(item.getAmount() + quantity);
		refreshShop();
		return true;
	    }
	}
	if (generalStock != null) {
	    for (Item item : generalStock) {
		if (item == null)
		    continue;
		if (item.getId() == itemId) {
		    item.setAmount(item.getAmount() + quantity);
		    refreshShop();
		    return true;
		}
	    }
	    for (int i = 0; i < generalStock.length; i++) {
		if (generalStock[i] == null) {
		    generalStock[i] = new Item(itemId, quantity);
		    refreshShop();
		    return true;
		}
	    }
	}
	return false;
    }

    public void sell(Player player, int slotId, int quantity) {
	if (player.getInventory().getItemsContainerSize() < slotId)
	    return;
	Item item = player.getInventory().getItem(slotId);
	if (item == null)
	    return;
	int originalId = item.getId();
	if (item.getDefinitions().isNoted() && item.getDefinitions().getCertId() != -1)
	    item = new Item(item.getDefinitions().getCertId(), item.getAmount());
	if (!ItemConstants.isTradeable(item) || item.getId() == money) {
	    player.getPackets().sendGameMessage("You can't sell this item.");
	    return;
	}
	int dq = getDefaultQuantity(item.getId());
	if (dq == -1 && generalStock == null) {
	    player.getPackets().sendGameMessage("You can't sell this item to this shop.");
	    return;
	}
	int price = getSellPrice(item, dq);
	if (price <= 0)
		return;
	int numberOff = player.getInventory().getItems().getNumberOf(originalId);
	if (quantity > numberOff)
	    quantity = numberOff;
	if (!addItem(item.getId(), quantity) && !isGeneralStore()) {
		player.getPackets().sendGameMessage("Shop is currently full.");
		return;
	}
	if (player.isPker && isGeneralStore()) {
		player.sm("Pkers are not allowed to use the general store.");
		return;
	}
	player.shopLog(player, item.getId(), item.getAmount(), true);
	player.getInventory().deleteItem(originalId, quantity);
	refreshShop();
	resetSelected(player);
	if (price == 0)
	    return;
	player.getInventory().addItemMoneyPouch(new Item(995, price * quantity));
    }

    public void sendValue(Player player, int slotId) {
	if (player.getInventory().getItemsContainerSize() < slotId)
	    return;
	Item item = player.getInventory().getItem(slotId);
	if (item == null)
	    return;
	if (item.getDefinitions().isNoted())
	    item = new Item(item.getDefinitions().getCertId(), item.getAmount());
	if (!ItemConstants.isTradeable(item) || item.getId() == money) {
	    player.getPackets().sendGameMessage("You can't sell this item.");
	    return;
	}
	int dq = getDefaultQuantity(item.getId());
	if (dq == -1 && generalStock == null) {
	    player.getPackets().sendGameMessage("You can't sell this item to this shop.");
	    return;
	}
	int price = getSellPrice(item, dq);
	if (price <= 0)
		return;
	player.getPackets().sendGameMessage(item.getDefinitions().getName() + ": shop will buy for: " + price + " " + ItemDefinitions.getItemDefinitions(money).getName().toLowerCase() + ". Right-click the item to sell.");
    }

    public int getDefaultQuantity(int itemId) {
	for (int i = 0; i < mainStock.length; i++)
	    if (mainStock[i].getId() == itemId)
		return defaultQuantity[i];
	return -1;
    }

    public void resetSelected(Player player) {
	player.getTemporaryAttributtes().remove("ShopSelectedSlot");
	player.getVarsManager().sendVar(2563, -1);
    }

    public void sendInfo(Player player, int slotId, boolean inventory) {
	if (!inventory && slotId >= getStoreSize())
	    return;
	Item item = inventory ? player.getInventory().getItem(slotId) : slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
	if (item == null)
	    return;
	if (item.getDefinitions().isNoted())
	    item = new Item(item.getDefinitions().getCertId(), item.getAmount());
	if (inventory && (!ItemConstants.isTradeable(item) || item.getId() == money)) {
	    player.getPackets().sendGameMessage("You can't sell this item.");
	    resetSelected(player);
	    return;
	}
	resetTransaction(player);
	player.getTemporaryAttributtes().put("ShopSelectedSlot", slotId);
	player.getTemporaryAttributtes().put("ShopSelectedInventory", inventory);
	player.getVarsManager().sendVar(2561, inventory ? 93 : generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY); // inv key
	player.getVarsManager().sendVar(2562, item.getId());
	player.getVarsManager().sendVar(2563, slotId);
	player.getPackets().sendGlobalString(362, ItemExamines.getExamine(item));
	player.getPackets().sendGlobalConfig(1876, item.getDefinitions().isWearItem() ? 0 : -1); // TODO item  pos or usage if has one, setting 0 to allow see stats
	int price = inventory ? getSellPrice(item, getDefaultQuantity(item.getId())) : getBuyPrice(player, item, slotId >= mainStock.length ? 0 : defaultQuantity[slotId]);
	player.getPackets().sendGameMessage(item.getDefinitions().getName() + ": shop will " + (inventory ? "buy" : "sell") + " for: " + price + " " + ItemDefinitions.getItemDefinitions(money).getName().toLowerCase());
    }
    

    
    /* [clientscript]
     * int get_buy_price(int arg0) { 
	int ivar1; 
	if (arg0 == -1) { 
		return 0; 
	} 
	arg0 = getRealItem(arg0); 
	ivar1 = getDataByKey('o', 'i', 731, arg0); 
	if (standart_config_532 == 6529 && ivar1 != -1 && ivar1 > 0) { 
		return ivar1; 
	} 
	ivar1 = getDataByKey('o', 'i', 733, arg0); 
	if (ivar1 != -1 && ivar1 > 0) { 
		return ivar1; 
	} 
	if (getItemAttribute(arg0, 258) == 1 || getItemAttribute(arg0, 259) == 1) { 
		return 99000; 
	} 
	ivar1 = getItemValue(arg0); 
	if (standart_config_532 == 6529) { 
		ivar1 = multiplyDivide(3, 2, ivar1); 
	} 
	return max(ivar1, 1); 
      }
     */

	public int getBuyPrice(Player player, Item item, int dq) {
		if (player.isPker) {
			switch (item.getId()) {
			//chaotic rapier
			case 18349:
				return 2000;

			//chaotic longsword
			case 18351:
				return 2000;

			//chaotic maul
			case 18353:
				return 2000;

			//chaotic crossbow
			case 18357:
				return 3000;


			//third-age range top
			case 10330:
				return 2000;

			//dragonbone upgrade kit
			case 24352:
				return 2000;

			//torva full helm
			case 20135:
				return 500;

			//torva platebody
			case 20139:
				return 500;

			//torva platelegs
			case 20143:
				return 500;

			//torva gloves
			case 24977:
				return 500;

			//Primal battleaxe
			case 15773:
				return 2500;

			//Primal maul
			case 16425:
				return 2500;

			//Primal rapier
			case 16955:
				return 2500;

			//Primal 2h
			case 16909:
				return 2500;

			//Tetsu Helm
			case 26322:
				return 750;

			//Tetsu body
			case 26323:
				return 750;

			//Tetsu legs
			case 26324:
				return 750;

			//Death lotus hood
			case 26352:
				return 750;

			//Death lotus chestplate
			case 26353:
				return 750;

			//Death lotus chaps
			case 26354:
				return 750;

			//Sea Singers head
			case 26334:
				return 750;

			//Sea Singers robe top
			case 26335:
				return 750;

			//Sea singers robe bottom
			case 26336:
				return 750;

			//Vanguard Helm
			case 21472:
				return 500;

			//Vanguard Body
			case 21473:
				return 500;



			//Vanguard Legs
			case 21474:
				return 500;

			//Vanguard gloves
			case 21475:
				return 500;

			//Vanguard boots
			case 21476:
				return 500;

			//Trickster helm
			case 21467:
				return 500;

			//Trickster robe
			case 21468:
				return 500;

			//Trickster robe legs
			case 21469:
				return 500;

			//Trickster gloves
			case 21470:
				return 500;

			//Trickster boots
			case 21471:
				return 500; 

			//Bandos tassets
			case 11726:
				return 25;

			//Bandos chestplate
			case 11724:
				return 25;

			//Armadyl helmet
			case 11718:
				return 25;

			//Armadyl chestplate
			case 11720:
				return 25;

			//Armadyl platelegs
			case 11722:
				return 25;

			//Bandos Godsword
			case 11696:
				return 100;

			//Zamorak Godsword
			case 11700:
				return 100;

			//saradomin Godsword
			case 11698:
				return 100;

			//armadyl Godsword
			case 11694:
				return 100;

			//Dragonfire shield
			case 11283:
				return 125;

			//Dragon Claws
			case 14484:
				return 150;

			//arcane spirit shield
			case 13738:
				return 175;

			//spectral spirit shield
			case 13744:
				return 175;



			//korasi’s sword
			case 18786:
				return 200;

			//vesta’s longsword
			case 13899:
				return 200;

			//spirit cape
			case 19893:
				return 225;

			//ardougne cloak 4
			case 19748:
				return 225;

			//ring of vigour
			case 19669:
				return 250;

			//divine spirit shield
			case 13740:
				return 400;

			//elysian spirit shield
			case 13742:
				return 400;

			//battle-mage hood
			case 21462:
				return 500;

			//battle-mage robe top
			case 21463:
				return 500;

			//battle-mage robe legs
			case 21464:
			            return 500;

			//battle-mage gloves
			case 21465:
				return 500;

			//battle-mage boots
			case 21466:
				return 500;

			//Third-age melee top
			case 10348:
				return 2000;

			//Third-age melee full helm
			case 10350:
				return 2000;

			//Third-age melee legs
			case 10346:
				return 2000;

			//Third-age kiteshield
			case 10352:
				return 2000;

			//Third-age range coif
			case 10334:
				return  2000;
			}
		}
		int price = item.getDefinitions().getTipitPrice();
		return price;
	}
    

    /*
     * [clientscript]
     * int get_sell_price(int arg0) { 
    	int ivar1; 
    	if (arg0 == -1) { 
    		return 0;
    	} 
    	arg0 = getRealItem(arg0); 
    	ivar1 = getDataByKey('o', 'i', 732, arg0); 
    	if (standart_config_532 == 6529 && ivar1 != -1) { 
    		return ivar1; 
    	}
    	ivar1 = getDataByKey('o', 'i', 1441, arg0); 
    	if (ivar1 != -1 && ivar1 > 0) { 
    		return ivar1; 
    	} 
    	ivar1 = max(1, multiplyDivide(getItemValue(arg0), 100, 30)); 
    	return ivar1; 
      }
     */

    public int getSellPrice(Item item, int dq) {
		int price = item.getDefinitions().getTipitPrice();
		return price;
	
    }

    public void sendExamine(Player player, int slotId) {
	if (slotId >= getStoreSize())
	    return;
	Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
	if (item == null)
	    return;
	player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
    }

    public void refreshShop() {
	for (Player player : viewingPlayers) {
	    sendStore(player);
	    player.getPackets().sendIComponentSettings(620, 25, 0, getStoreSize() * 6, 1150);
	}
    }

    public int getStoreSize() {
	return mainStock.length + (generalStock != null ? generalStock.length : 0);
    }

    public void sendStore(Player player) {
	Item[] stock = new Item[mainStock.length + (generalStock != null ? generalStock.length : 0)];
	System.arraycopy(mainStock, 0, stock, 0, mainStock.length);
	if (generalStock != null)
	    System.arraycopy(generalStock, 0, stock, mainStock.length, generalStock.length);
	player.getPackets().sendItems(generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY, stock);
    }

}