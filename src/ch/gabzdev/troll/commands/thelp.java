package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class thelp implements CommandExecutor {
    private Main main;

    public thelp(Main main) {
        this.main = main;
    }

    String Version = "\n§8§l> §etversion §7: Affiche la version du plugin";
    String Troll1 = "\n§8§l> §etroll1 §7: Effet de speed 3 secondes";
    String Troll2 = "\n§8§l> §etroll2 §7: Effet de jump boost 3 secondes";
    String Troll3 = "\n§8§l> §etroll3 §7: Effet de blindness 3 secondes";
    String Troll4 = "\n§8§l> §etroll4 §7: Vers l'infini et au delà !";
    String Troll5 = "\n§8§l> §etroll5 §7: Saut infini";

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage("§b§lTrolls disponibles " + "§7(" + main.getDescription().getVersion() + ") §b§l:" + Version + Troll1 + Troll2 + Troll3 + Troll4 + Troll5);
        return true;
    }
}