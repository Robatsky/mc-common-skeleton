# mc-common-skeleton

<!-- ABOUT THE PROJECT -->
## About The Project

This repos serves as a skeleton basic setup in order to use the mc-common library. It comes with a default setup including
- a basic start class
```java
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
```
- a basic command
```java
package main.java;

import de.schmidimc.mc.common.annotation.Command;
import de.schmidimc.mc.common.commands.AbstractCommand;
import de.schmidimc.mc.common.commands.error.CommandExecutionEvent;
import org.bukkit.command.CommandSender;

@Command(name="skeletonCommand", description = "Example command", usage="/skeletonCommand", aliases = {"sc"})
public class SekeletonCommand extends AbstractCommand {

    public SekeletonCommand(final Start start) {
        super(0);
    }

    @Override
    protected boolean execute(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        return false;
    }

    @Override
    protected void onCommandError(CommandExecutionEvent event) {

    }
}
```
- and a basic event listener
```java
package main.java;

import org.bukkit.event.Listener;

@de.schmidimc.mc.common.annotation.Listener
public class SkeletonListener implements Listener {
    public SkeletonListener(final Start start) {

    }
}
```

## Getting Started

In order to use this you simply need to clone the project onto your local machine and change the upstream urls
```
git remote remove origin
git remote add origin <url-to-your-own-repos>
```
Make sure to override the custom property `mcCommonOutputDir` in order to specify the custom location of your generated jar file.
This is done by adding `-DmcCommonOutputDir=location-to-jar` to your mvn command