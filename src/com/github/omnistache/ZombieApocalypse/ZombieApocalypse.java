package com.github.omnistache.ZombieApocalypse;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class ZombieApocalypse extends JavaPlugin {
	
	private OZACommandExecutor commandExecutor;
	private OZAListener listener;
	
	public void onEnable(){
		
		initialize_CommandExecutor();
		
		initialize_Listener();
		
		OZALog.log.info("Omnistache's Zombie Apocalypse Mod has been enabled :)");
	}
	
	private void initialize_Listener() {
		listener = new OZAListener(this);
	}

	private void initialize_CommandExecutor() {
		commandExecutor = new OZACommandExecutor();
		getCommand("oza").setExecutor(commandExecutor);		
	}

	public void onDisable(){
		OZALog.log.info("Omnistache's Zombie Apocalypse Mod has been disabled :/");
	}

}
