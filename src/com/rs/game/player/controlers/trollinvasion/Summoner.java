package com.rs.game.player.controlers.trollinvasion;

import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;

public class Summoner extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { "Summoner" };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		int hit = 0;
		hit = getRandomMaxHit(npc, 250, NPCCombatDefinitions.MAGE, target);

		delayHit(npc, 2, target, getRangeHit(npc, hit));

		return defs.getAttackDelay();
	}

}
