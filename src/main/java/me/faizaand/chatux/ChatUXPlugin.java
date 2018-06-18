package me.faizaand.chatux;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatUXPlugin extends JavaPlugin {

    // this doesn't actually do anything as a plugin,
    // but we want to make sure Spigot loads it in case other plugins
    // depend on it as a third party library.

    @Override
    public void onEnable() {
        getLogger().info("Loaded " + getDescription().getFullName() + ", a developer user interface API. Created by Faizaan Datoo.");
    }

    @Override
    public void onDisable() {
    }

}
