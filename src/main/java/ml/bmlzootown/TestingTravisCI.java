package ml.bmlzootown;

import org.bukkit.plugin.java.JavaPlugin;

public class TestingTravisCI extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("TestingTravisCI enabled");
        this.getLogger().info("This SHOULD be a release... ?");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("TestingTravisCI disabled");
    }

}
