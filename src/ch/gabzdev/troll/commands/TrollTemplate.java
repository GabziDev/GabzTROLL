package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.listeners.Effets;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TrollTemplate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("NOM-COMMANDE")) { //Ajouter le nom de la commande
            if (args.length > 0) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    //Ajouter des effets de la class Effects, des messages ou d'autre chose....
                    sender.sendMessage("§b§l[§e!§b§l] §fLe joueur " + target.getName() + " a été trollé !");
                } else {
                    sender.sendMessage("§c[!] Ce joueur n'est pas en ligne !");
                }
            } else {
                //Ajouter des effets de la class Effects, des messages ou d'autre chose....
                sender.sendMessage("§b§l[§e!§b§l] §fTous les joueurs en ligne ont été trollés !");
            }
            return true;
        }
        return false;
    }
}
