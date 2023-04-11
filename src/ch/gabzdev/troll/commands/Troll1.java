package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.listeners.Effets;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Troll1 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("troll1")) {
            Effets.Speed255();
            Effets.Jump255();
            sender.sendMessage("§b§l[§e!§b§l] §fEffet de vitesse appliqué à tous les joueurs en ligne.");
            return true;
        }
        return false;
    }
}
