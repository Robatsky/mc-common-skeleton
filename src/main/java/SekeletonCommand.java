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
