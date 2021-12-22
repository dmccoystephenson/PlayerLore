package dansplugins.playerlore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import preponderous.ponder.misc.AbstractCommand;

import java.util.ArrayList;
import java.util.Collections;

public class HelpCommand extends AbstractCommand {
    private ArrayList<String> names = new ArrayList<>(Collections.singletonList("help"));
    private ArrayList<String> permissions = new ArrayList<>(Collections.singletonList("pl.help"));

    @Override
    public ArrayList<String> getNames() {
        return names;
    }

    @Override
    public ArrayList<String> getPermissions() {
        return permissions;
    }

    @Override
    public boolean execute(CommandSender commandSender) {
        commandSender.sendMessage(ChatColor.AQUA + "/pl help - View a list of commands.");
        commandSender.sendMessage(ChatColor.AQUA + "/pl add \"line of lore\" - Add a line of lore to an item.");
        commandSender.sendMessage(ChatColor.RED + "/pl edit (lineNumber) \"new line of lore\" - Edit a line of lore of an item.");
        commandSender.sendMessage(ChatColor.RED + "/pl remove (lineNumber) - Remove a line of lore from an item.");
        return true;
    }

    @Override
    public boolean execute(CommandSender commandSender, String[] strings) {
        return execute(commandSender);
    }
}
