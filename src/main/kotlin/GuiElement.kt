import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.inventory.meta.ItemMeta

class GuiElement(val type: Material, val meta: ItemMeta) {
    var amount = 1

    fun name(value: String): GuiElement {
        meta.displayName(Component.text(value))
        return this
    }

    fun name(value: Component): GuiElement {
        meta.displayName(value)
        return this
    }

    fun lore(value: Component): GuiElement {
        meta.lore(listOf(value))
        return this
    }

    fun amount(value: Int): GuiElement {
        amount = value
        return this
    }
}
