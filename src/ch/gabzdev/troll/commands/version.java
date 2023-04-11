package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class version implements CommandExecutor {
    private Main main;

    public version(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage("§b§lVersion: §e" + main.getDescription().getVersion());
        return true;
    }
}
