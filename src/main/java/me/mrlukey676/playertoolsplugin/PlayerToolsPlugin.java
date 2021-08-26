package me.mrlukey676.playertoolsplugin;

import me.mrlukey676.playertoolsplugin.commands.lvl;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerToolsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[PlayerTools] Successfully loaded!");

        //Commands
        getCommand("lvl").setExecutor(new lvl());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[PlayerTools] Shutting down!");
    }
}
