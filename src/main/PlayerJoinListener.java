package main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener{
	
	private String error = "§4Es gab ein Fehler mit deiner UUID §l(null)";

	
	
	
	@EventHandler
	public void onSpielerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		if (p.getUniqueId() == null) {
			
			p.kickPlayer(error);
			
		} else {
			e.setJoinMessage("§6§l" + p.getName() + " §6hat den Server betreten");
			for (int i = 0; i < 50; i++) p.sendMessage("");
			for (int i = 0; i < 50; i++) p.sendMessage(""); 
			p.sendMessage("§3§l•‡System §7| §6§lWillkommen §5§l" + p.getName());
			p.sendMessage("§3§l•‡System §7| §6auf §l" + p.getServer() +"§6!");
			p.sendMessage("§3§l•‡System §7| §6wir wünschen dir §3§lviel Spaß");
			p.sendMessage("§3§l•‡System §7| §6§lauf unserem Netzwerk");
			p.sendMessage("§3§l•‡System §7| §2§lTeamSpeak: 37.114.45.0:9569");
			for (int i = 0; i < 5; i++) p.sendMessage("");
			p.sendMessage("§3§l•‡System §7| Wir wünschen dir noch viel Spaß beim zocken!");
			p.sendMessage("");
			p.setCanPickupItems(true);
			p.setMaxHealth(20);
			
			p.setFoodLevel(9999999);
			p.sendMessage("§3§l•‡System §7| §7Deine UUID: §1§l" + p.getUniqueId());
			
			p.setDisplayName("§3" + p.getName());			
		}	
	}
}