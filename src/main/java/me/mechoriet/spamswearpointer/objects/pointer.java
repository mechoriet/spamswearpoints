package me.mechoriet.spamswearpointer.objects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class pointer {
    UUID uuid;
    int spam;
    int swear;
    
    public pointer(UUID uuid) {
        this.uuid = uuid;
    }
    public pointer(UUID uuid,int spam,int swear) {
        this.uuid = uuid;
        this.spam = spam;
        this.swear = swear;
    }
    public Player getplayer() {
        return Bukkit.getPlayer(this.uuid);
    }

    public int getspampoint() {
        return this.spam;
    }
    public void addspampoint() {
        this.spam = this.spam + 1;
    }
    
    public void resetspampoints() {
        this.spam = 0;
    }
    public int getswearpoint() {
        return this.spam;
    }
    
    public void addswearpoint() {
        this.swear = this.swear + 1;
    }
    
    public void resetswearpoints() {
        this.swear = 0;
    }
    
}
