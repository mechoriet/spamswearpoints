package me.mechoriet.spamswearpointer.objects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class pointer {
    UUID uuid;
    int spam;
    int swear;
    public pointer(UUID uuid){
        this.uuid = uuid;
    }
    public Player getplayer(){
        return Bukkit.getPlayer(this.uuid);
    }
    public void addspampoint(){
        this.spam = this.spam + 1;
    }
    public void addswearpoint(){
        this.swear = this.swear + 1;
    }
}
