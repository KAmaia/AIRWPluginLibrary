package com.amaiaindustries.rw.plugin;

import com.amaiaindustries.rw.plugin.events.*;
import net.risingworld.api.*;
import net.risingworld.api.events.*;
import net.risingworld.api.events.player.*;
import net.risingworld.api.objects.*;

import java.util.*;


/**
 * @author Krystal Amaia
 * This project is free to use for any non-commercial purpose.  For commercial use please contact the author to
 * negotiate further licensing terms.
 */


public class AIRWPluginLibrary extends Plugin implements Listener {
	private ArrayList<Plugin> plugins;
	@java.lang.Override
	public void onEnable() {
		registerEventListener(this);
		System.out.print("Hello from Amaia Industries:  AIRWLibrary v0.1." +
			                      "\nThis software is free for all non-commercial use." +
			                      "\nFor commercial use please contact software author for negotiation of licensing" +
			                    " terms.");
	}

	public void onPlayerCommandEvent(PlayerCommandEvent e){
		Player p = e.getPlayer();
		String[] command = e.getCommand().split(" ");
		if(command[0].equalsIgnoreCase("/ai")){
			handleCommand(command);
		}
	}
	public void onRegisterPluginEvent(RegisterPluginEvent e){

	}
	private void handleCommand(String[] command) {
		for(String s : command){
			int i=0;
			if(i == 0){
				i+=1;
				break;
			}

		}

	}

	@java.lang.Override
	public void onDisable() {

	}
}
