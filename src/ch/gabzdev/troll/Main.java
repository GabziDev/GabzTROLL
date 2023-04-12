package ch.gabzdev.troll;

import ch.gabzdev.troll.commands.*;
import ch.gabzdev.troll.listeners.Effets;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.print("Plugin start !\n Version : " + getDescription().getVersion());
        this.getCommand("thelp").setExecutor(new thelp(this));
        this.getCommand("tversion").setExecutor(new version(this));
        this.getCommand("troll1").setExecutor(new Troll1());
        this.getCommand("troll2").setExecutor(new Troll2());
        this.getCommand("troll3").setExecutor(new Troll3());
        this.getCommand("troll4").setExecutor(new Troll4());
        this.getCommand("troll5").setExecutor(new Troll5(this));
        this.getCommand("Troll6").setExecutor(new Troll6(this));
        Bukkit.getPluginManager().registerEvents(new Effets(), this);
    }

    @Override
    public void onDisable() {
    }
}
