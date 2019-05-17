package ml.bmlzootown;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TestingTravisCI extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("TestingTravisCI enabled");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("TestingTravisCI disabled");
    }

    @Override
    public boolean onCommand (CommandSender sender, Command cmd, String commandLabel, String[] args) {
        return false;
    }

}
