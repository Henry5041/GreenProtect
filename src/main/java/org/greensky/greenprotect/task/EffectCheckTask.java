/**
 * 
 */
package org.greensky.greenprotect.task;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.greensky.greenprotect.GreenProtect;

/**
 * @author Henry Hu
 *
 */
public class EffectCheckTask extends BukkitRunnable {
	private final GreenProtect plugin;

	/**
	 * 
	 */
	public EffectCheckTask(GreenProtect plugin) {
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (Player player : plugin.getServer().getOnlinePlayers()) {
			if (player.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
				player.sendMessage("You're invisible");
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 1));
			}
		}
	}

}
