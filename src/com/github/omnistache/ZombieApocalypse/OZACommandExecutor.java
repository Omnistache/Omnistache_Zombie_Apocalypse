package com.github.omnistache.ZombieApocalypse;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OZACommandExecutor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		
		if(!command.getName().equalsIgnoreCase("oza")){
		}
		
		if(sender instanceof Player){
			playerCommand(sender, command, label, args);
		}
		else{
			consoleCommand(sender, command, label, args);
		}		
		return false;
	}

	private void consoleCommand(CommandSender sender, Command command,
			String label, String[] args) {
			
	}

	private void playerCommand(CommandSender sender, Command command,
			String label, String[] args) {
		// TODO Auto-generated method stub
		
	}

}
