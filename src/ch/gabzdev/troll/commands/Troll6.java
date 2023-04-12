package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Troll6 implements CommandExecutor {

    private final Main main;

    public Troll6(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("troll6")) {
            if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    target.sendMessage(String.format("§7§o[Server : " + target.getName() + " promu opérateur]", target.getName()));
                    sender.sendMessage("§b§l[§e!§b§l] §fLe message de (FakeOp) a été envoyé à " + target.getName() + " !");
                } else {
                    sender.sendMessage("§c[!] Ce joueur n'est pas en ligne !");
                }
            } else {
                sender.sendMessage("§c[!] Vous devez spécifier un joueur !");
            }
            return true;
        }
        return false;
    }
}
