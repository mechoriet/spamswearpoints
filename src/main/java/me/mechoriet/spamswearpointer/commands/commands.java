package me.mechoriet.spamswearpointer.commands;

import me.mechoriet.spamswearpointer.main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            if(cmd.getName().equalsIgnoreCase("pointsadd")){

                Player target = Bukkit.getPlayer(args[0]);
                if(args[1] != "spam"){
                    main.getplayerdata(target).addspampoint();
                }
                if(args[2] != "swear"){
                    main.getplayerdata(target).addswearpoint();
                }
            }
        }
        return false;
    }
}
