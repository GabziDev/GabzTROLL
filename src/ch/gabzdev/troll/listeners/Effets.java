package ch.gabzdev.troll.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.xml.bind.Marshaller;
import java.util.List;

public class Effets implements Listener {

    public static void Speed255() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80, 255));
        }
    }

    public static void Jump255() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80, 255));
        }
    }
}
