package com.github.omnistache.ZombieApocalypse;

import org.bukkit.event.Listener;

public class OZAListener implements Listener {

	public OZAListener(ZombieApocalypse zombieApocalypse) {
		zombieApocalypse.getServer().getPluginManager().registerEvents(this, zombieApocalypse);
	}
}
