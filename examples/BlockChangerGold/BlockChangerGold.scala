package jcdc.pluginfactory.examples

import jcdc.pluginfactory.Listeners._
import jcdc.pluginfactory.Listeners.ListeningFor
import jcdc.pluginfactory.{CommandPlugin, ListenerPlugin}
import org.bukkit.entity.Player
import org.bukkit.Material
import Material.GOLD_BLOCK

/**
 * A plugin that changes blocks to gold whenever they are punched.
 */
class BlockChangerGold extends ListeningFor(OnLeftClickBlock{(p, e) =>
  e.block changeTo GOLD_BLOCK; e.cancel
})
