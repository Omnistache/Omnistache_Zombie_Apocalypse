package com.github.omnistache.zombie_apocalypse;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Zombie_Apocalypse extends JavaPlugin {
	
	private Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		log.info("Omnistache's Zombie Apocalypse Mod has been enabled :)");
	}
	
	public void onDisable(){
		log.info("Omnistache's Zombie Apocalypse Mod has been disabled :/");
	}

}
