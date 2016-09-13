package org.greensky.greenprotect.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.greensky.greenprotect.GreenProtect;

public class EnvironmentListener implements Listener {
	private final GreenProtect plugin;

	public EnvironmentListener(GreenProtect plugin) {
		// TODO Auto-generated constructor stub
		this.plugin = plugin;
	}

	@EventHandler
	public void onItemSpawnEvent(ItemSpawnEvent e) {
		e.setCancelled(true);

	}

	@EventHandler
	public void onPotionSplashEvent(PotionSplashEvent e) {
		for (PotionEffect effect : e.getPotion().getEffects()) {
			if (effect.getType() == PotionEffectType.INVISIBILITY) {
				e.setCancelled(true);
				return;
			}
		}
	}
}
