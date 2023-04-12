package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.listeners.Effets;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Troll4 implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("troll4")) {
            boolean trollAll = args.length == 0;
            if (!trollAll) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    Effets.Invisibility(target, 80, 255);
                    Effets.Blindness(target, 60, 255);
                    target.setVelocity(target.getLocation().getDirection().multiply(0).setY(50));
                    target.sendTitle("§e§l§nVers l'infini et au delà !", "");
                    sender.sendMessage("§b§l[§e!§b§l] §fLe joueur " + target.getName() + " a été trollé !");
                } else {
                    sender.sendMessage("§c[!] Ce joueur n'est pas en ligne !");
                }
            }
            if (trollAll) {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Effets.Invisibility(player, 80, 255);
                    Effets.Blindness(player, 60, 255);
                }
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.setVelocity(player.getLocation().getDirection().multiply(0).setY(3));
                    player.sendTitle("§e§l§nVers l'infini et au delà !", "");
                }
                sender.sendMessage("§b§l[§e!§b§l] §fTous les joueurs en ligne ont été trollés !");
            }
            return true;
        }
        return false;
    }
}
