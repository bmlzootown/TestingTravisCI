package ml.bmlzootown;

import org.bukkit.plugin.java.JavaPlugin;

public class TestingTravisCI extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("TestingTravisCI enabled");
        this.getLogger().info("idek");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("TestingTravisCI disabled");
    }

}
