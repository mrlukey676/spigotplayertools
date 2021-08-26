package me.mrlukey676.playertoolsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class lvl implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        player.sendMessage(ChatColor.GREEN + "Your current level is " + player.getLevel() + " which equals " + player.getExp() + " XP!");

        return false;
    }
}
