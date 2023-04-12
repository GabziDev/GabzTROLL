package ch.gabzdev.troll.commands;

import ch.gabzdev.troll.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.scheduler.BukkitRunnable;

public class Troll5 implements CommandExecutor {

    private static final double MAX_JUMP_HEIGHT = 0.5;
    private static final int AIR_TICKS = 20;
    private final Main main;

    public Troll5(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("troll5")) {
            if (args.length > 0) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    toggleJumping(target);
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

    private void toggleJumping(Player player) {
        if (player.hasMetadata("jumping")) {
            player.removeMetadata("jumping", main);
            if (player.isInsideVehicle()) {
                player.getVehicle().eject();
            }
            player.setFallDistance(0.0F);
            player.setVelocity(player.getLocation().getDirection().multiply(0).setY(-1));
            player.sendMessage("§b§l[§e!§b§l] §fLe troll (JumpInfini) a été désactivé pour " + player.getName() + " !");
        } else {
            player.setMetadata("jumping", new FixedMetadataValue(main, true));
            BukkitRunnable task = new BukkitRunnable() {
                @Override
                public void run() {
                    if (!player.isOnline()) {
                        cancel();
                        return;
                    }
                    if (!player.hasMetadata("jumping")) {
                        cancel();
                        return;
                    }
                    player.setNoDamageTicks(Integer.MAX_VALUE);
                    player.setVelocity(player.getVelocity().setY(MAX_JUMP_HEIGHT));
                }
            };
            task.runTaskTimer(main, 0L, AIR_TICKS);
            player.sendMessage("§b§l[§e!§b§l] §fLe troll (JumpInfini) a été activé pour " + player.getName() + " !");
        }
    }
}
