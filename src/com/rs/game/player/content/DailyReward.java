package com.rs.game.player.content;

import java.util.Calendar;

import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.ChatColors;

public class DailyReward {

private transient Player player;
	
	public DailyReward(Player player) {
		this.player = player;
	}
	
	  public static int dayOfWeek() {
	      Calendar cal = Calendar.getInstance();
	      return cal.get(Calendar.DAY_OF_WEEK);
	   }
	  
	  public int getRewardByDay() {
		  switch (dayOfWeek()) {
		  case 1:
			  return 24154;//spin ticket
		  case 2:
			  return 24154;//spin ticket
		  case 3:
			  return 24154;//spin ticket
		  case 4:
			  return 24154;//spin ticket
		  case 5:
			  return 24154;//spin ticket
		  case 6:
			  return 24154;//spin ticket
		  case 7:
			  return 24155;//double spin ticket
		  }
		return 0;
	  }
	  
	  public int getAmount() {
		  switch (dayOfWeek()) {
		  case 1:
			  return 1;
		  case 2:
			  return 1;
		  case 3:
			  return 1;
		  case 4:
			  return 2;
		  case 5:
			  return 1;
		  case 6:
			  return 1;
		  case 7:
			  return 1;
		  }
		return 0;
	  }
	  
	  public void startCountdown() {
		  WorldTasksManager.schedule(new WorldTask() {
				
				int timer;
				
				@Override
				public void run() {
					if (timer == 0) {
						player.sendMessage("<col="+ChatColors.LIGHT_RED+">Daily Check-in:</col>You will receive your reward in 1 minute, make sure you have atleast one free inventory space.");
					} else if (timer == 60) {
						player.sendMessage("<col="+ChatColors.LIGHT_RED+">Daily Check-in:</col>Completed [<col="+ChatColors.LIGHT_RED+">"+dayOfWeek()+"</col>/<col="+ChatColors.LIGHT_RED+">7</col>].");
						player.getInventory().addItem(getRewardByDay(), getAmount());
					}
						timer++;
						}
					}, 0, 1);
				}
				
		
	  
	  public void dailyCheckIn() {
			startCountdown();
			}
		}