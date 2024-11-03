package winlyps.noWardenSpawning

import org.bukkit.plugin.java.JavaPlugin

class NoWardenSpawning : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doWardenSpawning", "false")
        }
        logger.info("NoWardenSpawning plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doWardenSpawning", "true")
            logger.info("NoWardenSpawning plugin has been disabled.")
        }
    }
}