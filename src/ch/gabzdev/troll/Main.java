package ch.gabzdev.troll;

import ch.gabzdev.troll.commands.version;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
    System.out.print("Plugin start !\n Version : " + getDescription().getVersion());
    this.getCommand("tversion").setExecutor(new version(this));
    }

    @Override
    public void onDisable() {

    }
}
