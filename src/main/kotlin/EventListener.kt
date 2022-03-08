import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent

class EventListener : Listener {
    @EventHandler
    fun onUseItem(event: PlayerInteractEvent) {
        val item = event.item ?: return

        if(item.type === Material.DRIED_KELP) {

        }
    }
}
