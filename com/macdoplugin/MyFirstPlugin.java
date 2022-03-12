package com.macdoplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Plugin is enabled!");

        Bukkit.getPluginManager().registerEvents(new HelloWorld(), this);
    }

    @Override
    public void  onDisable() {
        System.out.println("Shutting down...");
    }
}
