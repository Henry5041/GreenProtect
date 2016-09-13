package org.greensky.greenprotect;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import org.greensky.greenprotect.listener.BehaviourListener;
import org.greensky.greenprotect.listener.EnvironmentListener;
import org.greensky.greenprotect.task.EffectCheckTask;

public class GreenProtect extends JavaPlugin {
	@Override
	public void onDisable() {
		// TODO Insert logic to be performed when the plugin is disabled
	}

	@Override
	public void onEnable() {
		// TODO Insert logic to be performed when the plugin is enabled
		// this.getCommand("greenprotect").setExecutor(new Handler(this));
		// getLogger().info("Handler registered");
		getServer().getPluginManager().registerEvents(new BehaviourListener(this), this);
		getServer().getPluginManager().registerEvents(new EnvironmentListener(this), this);
		getLogger().info("Events registered");
		BukkitTask task = new EffectCheckTask(this).runTaskTimer(this, 20L, 20L);
	}

}
