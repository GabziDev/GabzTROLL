package ch.gabzdev.troll.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Effets implements Listener {

    public static void Speed(Player target, int duration, int amplifier) {
        if (target != null) {
            target.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, duration, amplifier, true));
        }
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, duration, amplifier, true));
        }
    }

    public static void Jump(Player target, int duration, int amplifier) {
        if (target != null) {
            target.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, duration, amplifier, true));
        }
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, duration, amplifier, true));
        }
    }

    public static void Blindness(Player target, int duration, int amplifier) {
        if (target != null) {
            target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration, amplifier, true));
        }
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration, amplifier, true));
        }
    }

    public static void InstantDamange(Player target, int duration, int amplifier) {
        if (target != null) {
            target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration, amplifier, true));
        } else {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration, amplifier, true));
            }
        }
    }

    public static void Invisibility(Player target, int duration, int amplifier) {
        if (target != null) {
            target.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, duration, amplifier, true));
        } else {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, duration, amplifier, true));
            }
        }
    }
}
