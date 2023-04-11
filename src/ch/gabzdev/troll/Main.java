package ch.gabzdev.troll;

import ch.gabzdev.troll.commands.Troll1;
import ch.gabzdev.troll.commands.version;
import ch.gabzdev.troll.listeners.Effets;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.print("Plugin start !\n Version : " + getDescription().getVersion());
        this.getCommand("tversion").setExecutor(new version(this));
        this.getCommand("troll1").setExecutor(new Troll1());
        Bukkit.getPluginManager().registerEvents(new Effets(), this);
    }

    @Override
    public void onDisable() {
    }
}
