package de.limacity.pepe44.elevator;

import de.limacity.pepe44.elevator.events.Teleport;
import org.bukkit.plugin.java.JavaPlugin;

public class Elevator extends JavaPlugin {

    public static final String Name  = "SnapeElevator";
    public static String Version = "1.0";


    public void onEnable() {
            //Commands

            //Events
            getServer().getPluginManager().registerEvents(new Teleport(), this);

            System.out.println(Name + Version + "Wird Geladen");

    }
}
