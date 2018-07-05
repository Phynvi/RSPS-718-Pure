package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.magic.Magic;

public class MTHighLevelBosses extends Dialogue {
	
	

	@Override
	public void start() {
		sendOptionsDialogue("High Level Bosses",
				"Queen Black Dragon",
				"Corporeal Beast",
				"Nex",
				"Wildy Wyrm",
				"More");
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			if (componentId == OPTION_1 ) {
				if (player.getSkills().getLevelForXp(Skills.SUMMONING) < 60) {
					player.getPackets().sendGameMessage("You need a summoning level of 60 to go to this monster.");
					player.getControlerManager().removeControlerWithoutCheck();
				} else {
				player.lock();
				player.getControlerManager().startControler("QueenBlackDragonControler");
				}
			} else if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2969, 4383, 2));
			} else if (componentId == OPTION_3) {
				teleportPlayer(2904, 5203, 0);
				player.getInterfaceManager().closeChatBoxInterface();
			} else if (componentId == OPTION_4) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3171, 3871, 0));
			} else if (componentId == OPTION_5) {
				sendOptionsDialogue("High Level Bosses  - Pg 2",
						"Yk'Lagor The Thunderous",
						"Blink",
						"Sunfreet",
						"Araxxor",
						"More");
				stage = 1;
			}
		} else if (stage == 1) {
			if (componentId == OPTION_1 ) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2523, 5232, 0));
			} else if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1370, 6621, 0));
			} else if (componentId == OPTION_3) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4440, 4697, 2));
			} else if (componentId == OPTION_4) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4438, 4569, 2));
			} else if (componentId == OPTION_5) {
				sendOptionsDialogue("High Level Bosses - Pg 3",
						"Vorago",
						"Lucien",
						"Coming soon..",
						"Coming soon..",
						"More");
				stage = 2;
			}
		} else if (stage == 2) {
			if (componentId == OPTION_1 ) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3552, 9498, 0));
			} else if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4714, 4697, 2));
			} else if (componentId == OPTION_3) {
				end();
			} else if (componentId == OPTION_4) {
				end();
			} else if (componentId == OPTION_5) {
				sendOptionsDialogue("High Level Bosses - Pg 4",
						"Coming soon..",
						"Coming soon..",
						"Coming soon..",
						"Coming soon..",
						"More");
				stage = 3;
			}
		} else if (stage == 3) {
			if (componentId == OPTION_1 ) {
				end();
			} else if (componentId == OPTION_2) {
				end();
			} else if (componentId == OPTION_3) {
				end();
			} else if (componentId == OPTION_4) {
				end();
			} else if (componentId == OPTION_5) {
				sendOptionsDialogue("High Level Bosses - Pg 5",
						"Coming soon..",
						"Coming soon..",
						"None");
				stage = 4;
			}
		} else if (stage == 4) {
			if (componentId == OPTION_1 ) {
				end();
			} else if (componentId == OPTION_2) {
				end();
			} else if (componentId == OPTION_3) {
				end();
			}
		}
		 
	}

	@Override
	public void finish() {

	}
	
	private void teleportPlayer(int x, int y, int z) {
		player.setNextWorldTile(new WorldTile(x, y, z));
		player.stopAll();
		player.getControlerManager().startControler("GodWars");
	}
}
