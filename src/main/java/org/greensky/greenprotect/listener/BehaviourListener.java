/**
 * 
 */
package org.greensky.greenprotect.listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.greensky.greenprotect.GreenProtect;

/**
 * @author Henry Hu
 *
 */
public class BehaviourListener implements Listener {
	private final GreenProtect plugin;

	/**
	 * 
	 */
	public BehaviourListener(GreenProtect plugin) {
		// TODO Auto-generated constructor stub
		this.plugin = plugin;
	}

	@EventHandler
	public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent e) {
		if (e.getItem().getType() == Material.POTION)
			e.setCancelled(true);

	}

}
