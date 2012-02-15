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
			OZALog.log.info("OZACommandExecutor received a command that was not 'oza'");
			return false;
		}
		
		if(sender instanceof Player){
			return playerCommand(sender, command, label, args);
		}
		else{
			return consoleCommand(sender, command, label, args);
		}
	}

	private boolean consoleCommand(CommandSender sender, Command command,
			String label, String[] args) {
		OZALog.log.info("received console command: " + command.getName());
		for (String arg : args){
			OZALog.log.info(arg);
		}
		return true;
	}

	private boolean playerCommand(CommandSender sender, Command command,
			String label, String[] args) {
		OZALog.log.info("received player command from: " + sender.getName() + command.getName());
		for (String arg : args){
			OZALog.log.info(arg);
		}
		return true;	
	}

}
