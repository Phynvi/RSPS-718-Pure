package com.rs.game.player.actions.objects;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.utils.Utils;
import com.rs.cache.loaders.ItemDefinitions;


public class CrystalChest {
	
	public static void Chest(Player player, final WorldObject object) {
        int random[][] = {{995, 10000}, {995, 20000}, {995, 25000},
        		{995, 10000}, {995, 20000}, {995, 25000}, {995, 10000},
        		{995, 20000}, {995, 25000}, {995, 10000}, {995, 20000},
        		{995, 25000}, {995, 50000}, {995, 50000}, {995, 10000},
        		{2615, 1}, {2617, 1}, {2619, 1},
        		{2621, 1}, {15441, 1}, {15442, 1}, {15443, 1}, {15444, 1},
        		{26198, 1}, {26124, 1}, {26126, 1}, {26128, 1}, {26130, 1},
        		{26132, 1}, {26134, 1}, {26136, 1}, {26138, 1}, {26140, 1},
        		{1615, 1}, {1615, 1}, {1615, 1}, {1615, 1}, {1615, 1}, {1615, 1},
        		{1615, 1}, {1615, 1}, {1615, 1}, {21773, 5000}, {21773, 5000},
        		{21773, 5000}, {21773, 5000}, {21773, 5000}, {563, 1000},
        		{563, 100}, {563, 100}, {563, 100}, {563, 100}, {563, 100},
        		{563, 100}, {563, 100}, {563, 100}, {563, 100}, {565, 100},
        		{565, 100}, {565, 100}, {565, 100}, {565, 100}, {565, 100},
        		{565, 100}, {565, 100}, {565, 100}, {565, 100}, {565, 100},
        		{565, 100}, {561, 100}, {561, 100}, {561, 100}, {561, 100},
        		{561, 100}, {561, 100}, {561, 100}, {561, 100}, {560, 100},
        		{560, 100}, {560, 100}, {560, 100}, {560, 100}, {560, 100},
        		{563, 100}, {563, 100}, {563, 100}, {563, 100}, {563, 100},
        		{563, 100}, {563, 100}, {563, 100}, {563, 100}, {565, 100},
        		{565, 100}, {565, 100}, {565, 100}, {565, 100}, {565, 100},
        		{565, 100}, {565, 100}, {565, 100}, {565, 100}, {565, 100},
        		{565, 100}, {561, 100}, {561, 100}, {561, 100}, {561, 100},
        		{561, 100}, {561, 100}, {561, 100}, {561, 100}, {560, 100},
        		{560, 100}, {560, 100}, {560, 100}, {560, 100}, {560, 100},
        		{560, 100}, {560, 100}, {560, 100}, {22358, 1}, {22359, 1},
        		{22360, 1}, {22361, 1}, {22366, 1}, {22367, 1}, {22368, 1}, {22369, 1},
        		{22362, 1}, {22363, 1}, {22364, 1}, {22365, 1}, {7671, 1},
        		{7672, 1}, {6914, 1}, {6889, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1},
        		{1079, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1},
        		{1079, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1}, {1079, 1},
        		{1079, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1},
        		{1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1},
        		{1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1}, {1093, 1},
        		{1093, 1}, {1127, 1}, {1127, 1}, {1127, 1}, {1127, 1}, {1127, 1},
        		{1127, 1}, {1127, 1}, {1127, 1}, {1127, 1}, {1127, 1}, {1127, 1},
        		{1127, 1}, {1127, 1}, {1127, 1}, {1127, 1}, {1127, 1}, {1127, 1},
        		{1127, 1}, {1127, 1}, {4131, 1}, {4131, 1}, {4131, 1}, {4131, 1},
        		{4131, 1}, {4131, 1}, {4131, 1}, {4131, 1}, {4131, 1}, {4131, 1},
        		{4131, 1}, {4131, 1}, {1111, 1}, {1111, 1}, {1111, 1}, {1111, 1},
        		{1111, 1}, {1111, 1}, {1111, 1}, {4561, 5}, {4561, 5}, {4561, 5},
        		{4561, 5}, {4561, 5}, {4561, 5}, {4561, 5}, {4561, 5}, {1434, 1},
        		{1434, 1}, {1434, 1}, {1434, 1}, {1434, 1}, {1434, 1}, {3202, 1},
        		{3202, 1}, {3202, 1}, {3202, 1}, {3202, 1}, {3202, 1}, {3202, 1}, 
        		{3202, 1}, {3202, 1}, {3202, 1}, {5696, 1}, {5696, 1}, {5696, 1},
        		{5696, 1}, {5696, 1}, {5696, 1}, {5696, 1}, {5696, 1}, {5696, 1},
        		{23531, 5}, {23531, 5}, {23531, 5}, {23531, 5}, {23531, 5}, {4278, 25000},
        		{4278, 25000}, {4278, 25000}, {4278, 25000}, {4278, 25000}, {4278, 25000}};
        int rand = Utils.random(random.length);
        int itemID = random[rand][0];
        player.getInventory().addItem(random[rand][0],
                random[rand][1]);
        ItemDefinitions def = ItemDefinitions
				.getItemDefinitions(itemID);
        player.sendMessage("You get a reward of: "+def.getName()+ " X"+random[rand][1]+".");
        player.crystalChest++;
  
	}
    
	public static void HandleObject(Player player, final WorldObject object) {
		final int id = object.getId();
		if (id == 170) {
			CrystalChest.Chest(player, object);
		}
	}

}