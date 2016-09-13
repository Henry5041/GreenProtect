package org.greensky.greenprotect.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.greensky.greenprotect.GreenProtect;

public class Handler implements CommandExecutor {
	private final GreenProtect plugin;

	public Handler(GreenProtect plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need
								// it.
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
