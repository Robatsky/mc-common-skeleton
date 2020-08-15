package main.java;

import de.schmidimc.mc.common.annotation.Plugin;
import main.java.PluginInitializer;
import org.bukkit.plugin.java.JavaPlugin;

@Plugin(name = "Skeleton-Project", author="Schmidi", main="main.java.Start")
public class Start extends JavaPlugin {
    @Override
    public void onEnable() {

        PluginInitializer.init(this);
    }
}
