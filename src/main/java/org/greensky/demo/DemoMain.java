package org.greensky.demo;

import org.bukkit.plugin.java.JavaPlugin;
import org.greensky.demo.command.Handler;

public class DemoMain extends JavaPlugin {
	@Override
	public void onEnable() {
		// TODO Insert logic to be performed when the plugin is enabled
		this.getCommand("demo").setExecutor(new Handler(this));
	}

	@Override
	public void onDisable() {
		// TODO Insert logic to be performed when the plugin is disabled
	}


}
