package com.rs.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;

public class NPCSpawning {

	/**
	 * Contains the custom npc spawning
	 */

	public static void spawnNPCS() {
		
		//Start Of Deleting Objects At Home
		//Delete Objects at home// new home is Oo'glog
		// More To Come! Once We Get More Players Ill Make The Home Bigger :D
		for(int i = 0; i < 10; i++){
		World.deleteObject(new WorldTile(2553, 2852 + i, 0));
		}	
		for(int i = 0; i < 10; i++){
		World.deleteObject(new WorldTile(2556, 2853 + i, 0));
		}
		World.deleteObject(new WorldTile(2554, 2855, 0));
		for(int i = 0; i < 8; i++){
		World.deleteObject(new WorldTile(2554, 2857 + i, 0));
		}
		for(int i = 0; i < 10; i++){
		World.deleteObject(new WorldTile(2558, 2856 + i, 0));
		}
		for(int i = 0; i < 10; i++){
		World.deleteObject(new WorldTile(2558, 2851 + i, 0));
		}
		for(int i = 0; i < 10; i++){
		World.deleteObject(new WorldTile(2559, 2850 + i, 0));
		}		
		for(int i = 0; i < 10; i++){
		World.deleteObject(new WorldTile(2549, 2855 + i, 0));
		}
		World.deleteObject(new WorldTile(2536, 2851, 0));
		World.deleteObject(new WorldTile(2534, 2850, 0));	
		World.deleteObject(new WorldTile(2579, 2851, 0));
		World.deleteObject(new WorldTile(2553, 2833, 0));
		World.deleteObject(new WorldTile(2551, 2834, 0));
		World.deleteObject(new WorldTile(2550, 2834, 0));
		World.deleteObject(new WorldTile(2549, 2834, 0));		
		World.deleteObject(new WorldTile(2548, 2856, 0));
		World.deleteObject(new WorldTile(2551, 2856, 0));
		World.deleteObject(new WorldTile(2545, 2853, 0));
		World.deleteObject(new WorldTile(2545, 2851, 0));
		World.deleteObject(new WorldTile(2545, 2856, 0));
		World.deleteObject(new WorldTile(2546, 2857, 0));
		World.deleteObject(new WorldTile(2543, 2850, 0));
		World.deleteObject(new WorldTile(2544, 2849, 0));
		World.deleteObject(new WorldTile(2545, 2849, 0));
		World.deleteObject(new WorldTile(2545, 2848, 0));
		World.deleteObject(new WorldTile(2539, 2835, 0));
		World.deleteObject(new WorldTile(2538, 2835, 0));
		World.deleteObject(new WorldTile(2540, 2840, 0));
		World.deleteObject(new WorldTile(2538, 2840, 0));
		World.deleteObject(new WorldTile(2540, 2841, 0));
		World.deleteObject(new WorldTile(2537, 2842, 0));
		World.deleteObject(new WorldTile(2540, 2842, 0));
		World.deleteObject(new WorldTile(2536, 2841, 0));
		World.deleteObject(new WorldTile(2533, 2835, 0));
		World.deleteObject(new WorldTile(2534, 2836, 0));
		World.deleteObject(new WorldTile(2534, 2838, 0));
		World.deleteObject(new WorldTile(2530, 2834, 0));
		World.deleteObject(new WorldTile(2529, 2833, 0));
		World.deleteObject(new WorldTile(2567, 2842, 0));
		World.deleteObject(new WorldTile(2566, 2840, 0));
		World.deleteObject(new WorldTile(2564, 2841, 0));
		World.deleteObject(new WorldTile(2562, 2840, 0));
		World.deleteObject(new WorldTile(2561, 2839, 0));
		World.deleteObject(new WorldTile(2561, 2841, 0));
		World.deleteObject(new WorldTile(2602, 2844, 0));
		World.deleteObject(new WorldTile(2601, 2845, 0));
		World.deleteObject(new WorldTile(2602, 2845, 0));
		World.deleteObject(new WorldTile(2603, 2846, 0));
		World.deleteObject(new WorldTile(2565, 2855, 0));
		World.deleteObject(new WorldTile(2565, 2856, 0));
		World.deleteObject(new WorldTile(2562, 2853, 0));
		World.deleteObject(new WorldTile(2571, 2854, 0));
		World.deleteObject(new WorldTile(2571, 2852, 0));
		World.deleteObject(new WorldTile(2573, 2853, 0));
		World.deleteObject(new WorldTile(2570, 2858, 0));
		World.deleteObject(new WorldTile(2571, 2859, 0));
		World.deleteObject(new WorldTile(2572, 2859, 0));
		World.deleteObject(new WorldTile(2573, 2859, 0));
		World.deleteObject(new WorldTile(2573, 2855, 0));
		World.deleteObject(new WorldTile(2573, 2856, 0));
		World.deleteObject(new WorldTile(2552, 2852, 0));	
		World.deleteObject(new WorldTile(2552, 2855, 0));
		World.deleteObject(new WorldTile(2594, 2844, 0));
		World.deleteObject(new WorldTile(2592, 2844, 0));
		World.deleteObject(new WorldTile(2599, 2847, 0));
		World.deleteObject(new WorldTile(2600, 2847, 0));
		World.deleteObject(new WorldTile(2599, 2840, 0));
		World.deleteObject(new WorldTile(2599, 2844, 0));
		World.deleteObject(new WorldTile(2599, 2847, 0));
		World.deleteObject(new WorldTile(2599, 2845, 0));
		World.deleteObject(new WorldTile(2573, 2840, 0));
		World.deleteObject(new WorldTile(2576, 2840, 0));
		World.deleteObject(new WorldTile(2579, 2838, 0));
		World.deleteObject(new WorldTile(2582, 2838, 0));
		//lamps
		World.deleteObject(new WorldTile(2568, 2854, 0));
	    World.deleteObject(new WorldTile(2568, 2857, 0));
		
		// More Deletes To Come! Once We Get More Players Ill Make The Home Bigger :D
	
		/*Barbarian Fishing*/ //fix this.
		World.spawnNPC(8647, new WorldTile(2500, 3509, 0), -1, true);
		World.spawnNPC(8647, new WorldTile(2502, 3515, 0), -1, true);
		
		World.spawnNPC(3019, new WorldTile(2500, 3507, 0), -1, true);
		World.spawnNPC(3019, new WorldTile(2504, 3497, 0), -1, true);
		
		World.spawnNPC(317, new WorldTile(2506, 3493, 0), -1, true);
		World.spawnNPC(317, new WorldTile(2500, 3509, 0), -1, true);
		
		//Darkmeyer Boss Vanstrom Klause
		World.spawnNPC(14176, new WorldTile(3620, 3342, 0), -1, true);
		
		/**NEW HOME NPCS FUCKERS**/
		World.spawnNPC(44, new WorldTile(3231, 3215, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2857, 3530, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2856, 3530, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2855, 3530, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2854, 3530, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2853, 3530, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2852, 3530, 3), 1, false);
		World.spawnNPC(495, new WorldTile(2851, 3530, 3), 1, false);
		World.spawnNPC(2593, new WorldTile(2858, 3542, 3), 1, false);
		World.spawnNPC(2593, new WorldTile(2859, 3542, 3), 1, false);
		World.spawnNPC(3416, new WorldTile(2860, 3543, 3), 1, false);
		World.spawnNPC(3416, new WorldTile(2860, 3544, 3), 1, false);
		World.spawnNPC(2593, new WorldTile(2859, 3545, 3), 1, false);
		World.spawnNPC(2593, new WorldTile(2858, 3545, 3), 1, false);
		World.spawnNPC(3416, new WorldTile(2857, 3544, 3), 1, false);
		World.spawnNPC(3416, new WorldTile(2857, 3543, 3), 1, false);
		World.spawnNPC(4247, new WorldTile(2847, 3532, 3), 1, false);
		World.spawnNPC(528, new WorldTile(2860, 3533, 3), 1, false);
		World.spawnNPC(580, new WorldTile(2853, 3551, 3), 1, false);
		World.spawnNPC(13633, new WorldTile(2838, 3551, 3), 1, false);
		World.spawnNPC(5915, new WorldTile(2839, 3551, 3), 1, false);
		World.spawnNPC(3547, new WorldTile(2859, 3531, 3), 1, false);
		World.spawnNPC(2824, new WorldTile(2875, 3544, 3), 1, false);
		World.spawnNPC(3709, new WorldTile(2840, 3551, 3), 1, false);
		World.spawnNPC(8031, new WorldTile(2847, 3550, 3), 1, false);
		World.spawnNPC(2253, new WorldTile(2876, 3542, 3), 1, false);
		World.spawnNPC(28, new WorldTile(2841, 3551, 3), 1, false);
		World.spawnNPC(8480, new WorldTile(2856, 3551, 3), 1, false);
		World.spawnNPC(8481, new WorldTile(2857, 3551, 3), 1, false);
		World.spawnNPC(8465, new WorldTile(2858, 3551, 3), 1, false);
		World.spawnNPC(1597, new WorldTile(2859, 3551, 3), 1, false);
		World.spawnNPC(1598, new WorldTile(2860, 3551, 3), 1, false);
		World.spawnNPC(7780, new WorldTile(2861, 3551, 3), 1, false);
		World.spawnNPC(8466, new WorldTile(2862, 3551, 3), 1, false);
		World.spawnNPC(8467, new WorldTile(2863, 3551, 3), 1, false);
		World.spawnNPC(9085, new WorldTile(2864, 3551, 3), 1, false);
		World.spawnNPC(5913, new WorldTile(2868, 3551, 3), 1, false);//Runes Shop
		World.spawnNPC(546, new WorldTile(2869, 3551, 3), 1, false);//Magic Shop
		World.spawnNPC(549, new WorldTile(2870, 3551, 3), 1, false);//Armour Shop
		World.spawnNPC(544, new WorldTile(2871, 3551, 3), 1, false);//Weapon Shop
		World.spawnNPC(20210, new WorldTile(2872, 3551, 3), 1, false);//Pure Shop
		World.spawnNPC(550, new WorldTile(2873, 3551, 3), 1, false);//Range Shop
		World.spawnNPC(638, new WorldTile(2874, 3551, 3), 1, false);
		World.spawnNPC(7909, new WorldTile(2875, 3550, 3), 1, false);//Skilling supplies
		World.spawnNPC(2732, new WorldTile(2875, 3549, 3), 1, false);
		World.spawnNPC(1847, new WorldTile(2875, 3548, 3), 1, false);
		World.spawnNPC(228, new WorldTile(2875, 3547, 3), 1, false);//Fishing Shop
		World.spawnNPC(14854, new WorldTile(2875, 3546, 3), 1, false);//Herb shop
		World.spawnNPC(12189, new WorldTile(2875, 3545, 3), 1, false);
		World.spawnNPC(6137, new WorldTile(2849, 3531, 3), 1, false);
		World.spawnNPC(14722, new WorldTile(2847, 3541, 3), 1, false);
		World.spawnNPC(2262, new WorldTile(2842, 3551, 3), 1, false);
		World.spawnNPC(577, new WorldTile(2843, 3551, 3), 1, false);
		
		
		
		//Chillzone
		World.spawnNPC(2593, new WorldTile(3959, 4820, 1), 1, false);
		World.spawnNPC(2593, new WorldTile(3959, 4821, 1), 1, false);
		World.spawnNPC(3416, new WorldTile(3958, 4822, 1), 1, false);
		World.spawnNPC(3416, new WorldTile(3957, 4822, 1), 1, false);
		
		
		
		/**object at home**/
		World.deleteObject(new WorldTile(2327, 3803, 0));
		World.deleteObject(new WorldTile(2327, 3806, 0));
		World.deleteObject(new WorldTile(2329, 3804, 0));
		World.deleteObject(new WorldTile(2329, 3805, 0));
		World.deleteObject(new WorldTile(2323, 3810, 0));
		World.deleteObject(new WorldTile(2334, 3799, 0));
		World.deleteObject(new WorldTile(2342, 3807, 0));
		World.deleteObject(new WorldTile(2344, 3809, 0));
		World.deleteObject(new WorldTile(2318, 3805, 0));
		
		
		World.deleteObject(new WorldTile(86, 367, 0));
		//Donator Zone Objects (Crates)
		World.deleteObject(new WorldTile(2831, 3867, 0));
		World.deleteObject(new WorldTile(2831, 3868, 0));
		World.deleteObject(new WorldTile(2832, 3868, 0));
		World.deleteObject(new WorldTile(2832, 3868, 0));
		World.deleteObject(new WorldTile(2834, 3867, 0));
		World.deleteObject(new WorldTile(2834, 3866, 0));
		World.deleteObject(new WorldTile(2835, 3861, 0));
		World.deleteObject(new WorldTile(2836, 3863, 0));
		World.deleteObject(new WorldTile(2837, 3864, 0));
		World.deleteObject(new WorldTile(2835, 3854, 0));
		World.deleteObject(new WorldTile(2831, 3854, 0));
		World.deleteObject(new WorldTile(2830, 3853, 0));
		World.deleteObject(new WorldTile(2829, 3854, 0));
		World.deleteObject(new WorldTile(2829, 3863, 0));
		World.deleteObject(new WorldTile(2828, 3865, 0));
		World.deleteObject(new WorldTile(2827, 3869, 0));
		World.deleteObject(new WorldTile(2826, 3870, 0));
		World.deleteObject(new WorldTile(2822, 3870, 0));
		World.deleteObject(new WorldTile(2821, 3869, 0));
		World.deleteObject(new WorldTile(2843, 3861, 0));
		World.deleteObject(new WorldTile(2839, 3860, 0));
		World.deleteObject(new WorldTile(2839, 3863, 0));
		World.deleteObject(new WorldTile(2838, 3863, 0));
		World.deleteObject(new WorldTile(2838, 3862, 0));
		World.deleteObject(new WorldTile(2837, 3862, 0));
		World.deleteObject(new WorldTile(2830, 3855, 0));
		World.deleteObject(new WorldTile(2833, 3868, 0));
		World.deleteObject(new WorldTile(2842, 3869, 0));
		World.deleteObject(new WorldTile(2836, 3855, 0));
		World.deleteObject(new WorldTile(2841, 3869, 1));
		World.deleteObject(new WorldTile(2841, 3868, 1));
		World.deleteObject(new WorldTile(2842, 3868, 1));
		World.deleteObject(new WorldTile(2843, 3868, 1));
		World.deleteObject(new WorldTile(2843, 3867, 1));
		World.deleteObject(new WorldTile(2842, 3850, 1));
		World.deleteObject(new WorldTile(2843, 3849, 1));
		World.deleteObject(new WorldTile(2822, 3850, 1));
		World.deleteObject(new WorldTile(2822, 3849, 1));
		World.deleteObject(new WorldTile(2822, 3848, 1));
		World.deleteObject(new WorldTile(2824, 3848, 1));
		World.deleteObject(new WorldTile(2825, 3848, 1));
		World.deleteObject(new WorldTile(2826, 3848, 1));
		World.deleteObject(new WorldTile(2827, 3848, 1));
		World.deleteObject(new WorldTile(2827, 3849, 1));
		World.deleteObject(new WorldTile(2822, 3854, 1));
		World.deleteObject(new WorldTile(2823, 3855, 1));
		World.deleteObject(new WorldTile(2823, 3865, 1));
		World.deleteObject(new WorldTile(2822, 3866, 1));
		World.deleteObject(new WorldTile(2823, 3867, 1));
		World.deleteObject(new WorldTile(2822, 3868, 1));
		World.deleteObject(new WorldTile(2823, 3869, 1));
		World.deleteObject(new WorldTile(2824, 3869, 1));
		World.deleteObject(new WorldTile(2825, 3869, 1));
		World.deleteObject(new WorldTile(3158, 9640, 0));
		World.deleteObject(new WorldTile(3107, 3162, 0));
		
		
		/*
		 *Item Spawning below
		 *
		 */
		
		//World.addGroundItem(new Item(995, 500), new WorldTile(2965, 3380, 0), null, true, 180,true);
	}

	/**
	 * The NPC classes.
	 */
	private static final Map<Integer, Class<?>> CUSTOM_NPCS = new HashMap<Integer, Class<?>>();

	public static void npcSpawn() {
		int size = 0;
		boolean ignore = false;
		try {
			for (String string : FileUtilities
					.readFile("data/npcs/spawns.txt")) {
				if (string.startsWith("//") || string.equals("")) {
					continue;
				}
				if (string.contains("/*")) {
					ignore = true;
					continue;
				}
				if (ignore) {
					if (string.contains("*/")) {
						ignore = false;
					}
					continue;
				}
				String[] spawn = string.split(" ");
				@SuppressWarnings("unused")
				int id = Integer.parseInt(spawn[0]), x = Integer
						.parseInt(spawn[1]), y = Integer.parseInt(spawn[2]), z = Integer
						.parseInt(spawn[3]), faceDir = Integer
						.parseInt(spawn[4]);
				NPC npc = null;
				Class<?> npcHandler = CUSTOM_NPCS.get(id);
				if (npcHandler == null) {
					npc = new NPC(id, new WorldTile(x, y, z), -1, true, false);
				} else {
					npc = (NPC) npcHandler.getConstructor(int.class)
							.newInstance(id);
				}
				if (npc != null) {
					WorldTile spawnLoc = new WorldTile(x, y, z);
					npc.setLocation(spawnLoc);
					World.spawnNPC(npc.getId(), spawnLoc, -1, true, false);
					size++;
				}
			}
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		}
		System.err.println("Loaded " + size + " custom npc spawns!");
	}

}