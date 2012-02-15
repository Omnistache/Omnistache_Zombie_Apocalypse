package com.github.omnistache.ZombieApocalypse;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class ZombieApocalypse extends JavaPlugin {
	
	private static OZACommandExecutor commandExecutor;
	
	public void onEnable(){
		
		init_CommandExecutor();
		
		
		
		OZALog.log.info("Omnistache's Zombie Apocalypse Mod has been enabled :)");
	}
	
	private void init_CommandExecutor() {
		commandExecutor = new OZACommandExecutor();
		getCommand("oza").setExecutor(commandExecutor);		
	}

	public void onDisable(){
		OZALog.log.info("Omnistache's Zombie Apocalypse Mod has been disabled :/");
	}

}
