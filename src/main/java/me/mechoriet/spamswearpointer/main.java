package me.mechoriet.spamswearpointer;

import me.mechoriet.spamswearpointer.commands.commands;
import me.mechoriet.spamswearpointer.objects.pointer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class main extends JavaPlugin{
    public static ArrayList<pointer> points = new ArrayList<pointer>();

    public void onEnable(){
    getCommand("pointadd").setExecutor(new commands());
    }
    public static pointer getplayerdata(Player p){
        pointer returndata = null;
        for(pointer data : main.points){
            if(data.getplayer().equals(p)){
                returndata = data;
            }
        }
        return returndata;
    }
}
