package com.rs.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

public class ObjectSpawning {

	/**
	 * Contains the custom npc spawning
	 */

	public static void spawnNPCS() {
		World.spawnObject(new WorldObject(87309, 10, 0, 3120, 3224, 0), true); // divination rift pale wisps in draynor
		World.spawnObject(new WorldObject(87306, 10, 0, 3121, 3225, 0), true);
		World.spawnObject(new WorldObject(87308, 10, 0, 2988, 3406, 0), true); // divination by fally
		World.spawnObject(new WorldObject(87306, 10, 0, 2990, 3408, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2990, 3407, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2989, 3408, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2989, 3407, 0), true);
		World.spawnObject(new WorldObject(87307, 10, 0, 3302, 3410, 0), true); // varrok bright wisps
		World.spawnObject(new WorldObject(87306, 10, 0, 3303, 3411, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3303, 3412, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3304, 3412, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3304, 3411, 0), true);
		World.spawnObject(new WorldObject(87308, 10, 0, 2736, 3404, 0), true); // div seers village glowing wisps
		World.spawnObject(new WorldObject(87306, 10, 0, 2738, 3406, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2737, 3406, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2737, 3405, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2738, 3405, 0), true);
		World.spawnObject(new WorldObject(87307, 10, 0, 2765, 3599, 0), true);  // div sparkling wisps frienick 
		World.spawnObject(new WorldObject(87306, 10, 0, 2766, 3600, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2767, 3600, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2767, 3601, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2766, 3601, 0), true);
		World.spawnObject(new WorldObject(87309, 10, 0, 2882, 3058, 0), true); // gleaming wisps  Karamja
		World.spawnObject(new WorldObject(87306, 10, 0, 2883, 3060, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2884, 3060, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2884, 3059, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2883, 3059, 0), true);
		World.spawnObject(new WorldObject(87309, 10, 0, 2420, 2861, 0), true); // vibrant wisps
		World.spawnObject(new WorldObject(87306, 10, 0, 2421, 2863, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2421, 2862, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2421, 2862, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2422, 2863, 0), true);
		World.spawnObject(new WorldObject(87307, 10, 0, 3476, 3531, 0), true); // canifis 
		World.spawnObject(new WorldObject(87306, 10, 0, 3478, 3532, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3477, 3532, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3477, 3533, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3478, 3533, 0), true);
		World.spawnObject(new WorldObject(87307, 10, 0, 3547, 3269, 0), true);  // brilliant
		World.spawnObject(new WorldObject(87306, 10, 0, 3548, 3270, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3548, 3271, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3547, 3271, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3547, 3270, 0), true);
		World.spawnObject(new WorldObject(87309, 10, 0, 3800, 3550, 0), true);  // RADIANT
		World.spawnObject(new WorldObject(87306, 10, 0, 3802, 3552, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3801, 3552, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3802, 3551, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3801, 3551, 0), true);
		World.spawnObject(new WorldObject(87310, 10, 0, 3341, 2906, 0), true);  // Luminous
		World.spawnObject(new WorldObject(87306, 10, 0, 3342, 2907, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3342, 2908, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3343, 2908, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 3343, 2907, 0), true);
		World.spawnObject(new WorldObject(87309, 10, 0, 2286, 3053, 0), true);  // INCANDESCENT
		World.spawnObject(new WorldObject(87306, 10, 0, 2288, 3054, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2287, 3054, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2287, 3055, 0), true);
		World.spawnObject(new WorldObject(87306, 10, 0, 2288, 3055, 0), true);
		//Rodiks Zone
		World.spawnObject(new WorldObject(782, 10, 0, 4700, 4704, 1), true);//Bank Booth
		World.spawnObject(new WorldObject(782, 10, 0, 4708, 4704, 1), true);//Bank Booth
		World.spawnObject(new WorldObject(409, 10, 2, 4703, 4716, 1), true);//Alter
	//Bank booths @ home

		//Ladder
		World.spawnObject(new WorldObject(45784, 10, 0, 3680, 4940, 0), true);//staircase
		
		World.spawnObject(new WorldObject(23585, 10, 0, 2826, 2998, 0), true);//staircase
		
		World.spawnObject(new WorldObject(4500, 10, 3, 3077, 4234, 0), true);//tunnel
		
		
		
		World.spawnObject(new WorldObject(1, 10, 0, 2502, 3496, 0), true);//le crate
		
		
		//World.spawnObject(new WorldObject(2473, 10, 0, 4625, 5454, 3), true);//Portal
		
		World.spawnObject(new WorldObject(2620, 10, 0, 2805, 3444, 0), true);//le crate
		//lever
		World.spawnObject(new WorldObject(3241, 10, 0, 2448, 9717, 0), true);//lever
//pass
	
		World.spawnObject(new WorldObject(1, 10, 0, 2495, 9713, 0), true);//Crate
		//boat in morytania
		World.spawnObject(new WorldObject(17955, 10, 0, 3523, 3169, 0), true);//boat
		World.spawnObject(new WorldObject(17955, 10, 3, 3593, 3178, 0), true);//boat
		World.spawnObject(new WorldObject(12798, 10, 3, 3494, 3211, 0), true);//Bank booth
		
		//Zogre training grounds
		
		World.spawnObject(new WorldObject(6881, 10, 0, 2456, 3047, 0), true);//barricade
		
		//ladder in morytania
		World.spawnObject(new WorldObject(12907, 10, 1, 3589, 3173, 0), true);//ladder
		//key statue
		World.spawnObject(new WorldObject(18046, 10, 2, 3641, 3304, 0), true);//statue with key
		
		
		/**End of Home**/
		/**Mining area**/
		World.spawnObject(new WorldObject(2213, 10, 1, 3298, 3307, 0), true);//bank booth
		/**End of Mining area**/
		/**Farming Area**/
		World.spawnObject(new WorldObject(8135, 10, 0, 2203, 3294, 0), true);//Herb Patch
		//Crates
		World.spawnObject(new WorldObject(2790, 10, 1, 2508, 3084, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3292, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3293, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3294, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3295, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3296, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2200, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2201, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2202, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2203, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2204, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2205, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2206, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3297, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3296, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3295, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3294, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3293, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3292, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2207, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2206, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2205, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2204, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2203, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2202, 3291, 0), true);
		World.spawnObject(new WorldObject(78090, 10, 0, 2201, 3291, 0), true);
		World.spawnObject(new WorldObject(2012, 10, 3, 2830, 3868, 0), true);//New Bank
		World.spawnObject(new WorldObject(2019, 10, 3, 2831, 3868, 0), true);//New Bank
		World.spawnObject(new WorldObject(2019, 10, 3, 2832, 3868, 0), true);//New Bank
		World.spawnObject(new WorldObject(2019, 10, 3, 2833, 3868, 0), true);//New Bank
		World.spawnObject(new WorldObject(2019, 10, 3, 2834, 3868, 0), true);//New Bank
		World.spawnObject(new WorldObject(2015, 10, 3, 2835, 3868, 0), true);//New Bank
		World.spawnObject(new WorldObject(61769, 10, 0, 2837, 3866, 0), true);//Torch
		World.spawnObject(new WorldObject(61769, 10, 0, 2828, 3866, 0), true);//Torch
		World.spawnObject(new WorldObject(11339, 10, 2, 2832, 3871, 0), true);//Bank chest
		World.spawnObject(new WorldObject(11339, 10, 2, 2833, 3871, 0), true);//Bank chest
		World.spawnObject(new WorldObject(44112, 10, 3, 2844, 3851, 0), true);//Skulls
		World.spawnObject(new WorldObject(44112, 10, 3, 2844, 3849, 0), true);//Skulls
		World.spawnObject(new WorldObject(74830, 10, 3, 2837, 3852, 0), true);//Obelisk
		World.spawnObject(new WorldObject(17010, 10, 0, 2842, 3852, 0), true);//Lunar Altar
		World.spawnObject(new WorldObject(47120, 10, 0, 2843, 3846, 0), true);//Zaros Altar 17010
		World.spawnObject(new WorldObject(13190, 10, 4, 2837, 3847, 0), true);//Altar
		World.spawnObject(new WorldObject(6552, 10, 1, 2836, 3848, 0), true);//Ancient Altar
		World.spawnObject(new WorldObject(2563, 10, 3, 2827, 3865, 0), true);//Comp stand
		World.spawnObject(new WorldObject(782, 10, 2, 2332, 3687, 0), true);//bank booth
		World.spawnObject(new WorldObject(782, 10, 2, 2331, 3687, 0), true);//bank booth
		World.spawnObject(new WorldObject(782, 10, 2, 2330, 3687, 0), true);//bank booth
		World.spawnObject(new WorldObject(782, 10, 2, 2329, 3687, 0), true);//bank booth
		World.spawnObject(new WorldObject(782, 10, 2, 2328, 3687, 0), true);//bank booth
		World.spawnObject(new WorldObject(782, 10, 2, 2327, 3687, 0), true);//bank booth

		/**NEW HOME FUCKERS**/
		World.spawnObject(new WorldObject(26972, 10, 2, 2851, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 2857, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 2856, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 2855, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 2854, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 2853, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 2852, 3531, 3), true);//bank booth
		World.spawnObject(new WorldObject(24401, 0, 1, 2858, 3531, 3), true);//Fence
		World.spawnObject(new WorldObject(24401, 0, 1, 2859, 3531, 3), true);//Fence
		World.spawnObject(new WorldObject(24401, 0, 1, 2850, 3531, 3), true);//Fence
		World.spawnObject(new WorldObject(24401, 0, 1, 2849, 3531, 3), true);//Fence
		World.spawnObject(new WorldObject(11339, 10, 0, 2859, 3530, 3), true);//Chest
		World.spawnObject(new WorldObject(11339, 10, 0, 2858, 3530, 3), true);//Chest
		World.spawnObject(new WorldObject(11339, 10, 0, 2850, 3530, 3), true);//Chest
		World.spawnObject(new WorldObject(11339, 10, 0, 2849, 3530, 3), true);//Chest
		World.spawnObject(new WorldObject(47173, 10, 2, 2857, 3542, 3), true);//G.E
		World.spawnObject(new WorldObject(170, 10, 0, 2840, 3532, 3), true);//C Chest
		World.spawnObject(new WorldObject(47120, 10, 0, 2837, 3532, 3), true);//Zaros altar
		World.spawnObject(new WorldObject(6552, 10, 1, 2838, 3535, 3), true);//Ancient altar
		World.spawnObject(new WorldObject(409, 10, 1, 2838, 3538, 3), true);//Reg altar
		World.spawnObject(new WorldObject(4874, 10, 1, 2864, 3533, 3), true);//Stall
		World.spawnObject(new WorldObject(4875, 10, 1, 2865, 3533, 3), true);//Stall
		World.spawnObject(new WorldObject(4876, 10, 1, 2866, 3532, 3), true);//Stall
		World.spawnObject(new WorldObject(4877, 10, 1, 2867, 3533, 3), true);//Stall
		World.spawnObject(new WorldObject(4878, 10, 1, 2868, 3533, 3), true);//Stall
		World.spawnObject(new WorldObject(6189, 10, 3, 2874, 3533, 3), true);//Furnace
		World.spawnObject(new WorldObject(2732, 10, 1, 2872, 3532, 3), true);//Fire
		World.spawnObject(new WorldObject(15482, 10, 0, 2841, 3532, 3), true);//House portal
		World.spawnObject(new WorldObject(27896, 10, 0, 2854, 3552, 3), true);//Death clock
		World.spawnObject(new WorldObject(123, 10, 0, 2876, 3542, 3), true);//Removeobject
		World.spawnObject(new WorldObject(123, 10, 0, 2876, 3536, 3), true);//Removeobject
		World.spawnObject(new WorldObject(123, 10, 0, 2866, 3552, 3), true);//Removeobject
		World.spawnObject(new WorldObject(4046, 10, 0, 2873, 3533, 3), true);//Anvil
		World.spawnObject(new WorldObject(13715, 10, 1, 2876, 3535, 3), true);//Armour repair
		World.spawnObject(new WorldObject(380, 10, 0, 2838, 3547, 3), true);//Animation swap
		World.spawnObject(new WorldObject(66541, 10, 1, 2847, 3532, 3), true);//Icon
		
		
		
		
		//Chillzone
		World.spawnObject(new WorldObject(26972, 10, 2, 3970, 4817, 1), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 3969, 4817, 1), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 3968, 4817, 1), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 3967, 4817, 1), true);//bank booth
		World.spawnObject(new WorldObject(26972, 10, 2, 3966, 4817, 1), true);//bank booth
		World.spawnObject(new WorldObject(82940, 10, 2, 3965, 4818, 1), true);//Torch
		World.spawnObject(new WorldObject(82940, 10, 2, 3971, 4818, 1), true);//Torch
		World.spawnObject(new WorldObject(36815, 10, 1, 3967, 4828, 1), true);//Fireplace
		World.spawnObject(new WorldObject(36779, 10, 0, 3966, 4828, 1), true);//Suit of armour
		World.spawnObject(new WorldObject(36779, 10, 0, 3970, 4828, 1), true);//Suit of armour
		World.spawnObject(new WorldObject(47173, 10, 4, 3956, 4819, 1), true);//G.E
		
		
		
		
		//Raxor
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4565, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4564, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4435, 4565, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4435, 4587, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4587, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4588, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4588, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4587, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4461, 4587, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4461, 4565, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4565, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4564, 2), true);//Box
		//Sunfreet
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4693, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4694, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4435, 4694, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4716, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4436, 4715, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4435, 4715, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4461, 4715, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4715, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4716, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4693, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4460, 4694, 2), true);//Box
		World.spawnObject(new WorldObject(1, 10, 1, 4461, 4694, 2), true);//Box
		
		
		
		
		
		/**End of Farming Area**/
		
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