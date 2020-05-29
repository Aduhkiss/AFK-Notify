package findr.today.afk.cmd;

import findr.today.moddev.util.AtticusColor;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class AFKNCommand extends CommandBase {

	@Override
	public String getCommandName() {
		return "afkn";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "f";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		// Do the thing
		sender.addChatMessage(new ChatComponentText(AtticusColor.RED + "" + AtticusColor.STRIKETHROUGH + "                                                   "));
		sender.addChatMessage(new ChatComponentText(AtticusColor.YELLOW + "AFK Mode: " + AtticusColor.AQUA + ""));
		sender.addChatMessage(new ChatComponentText(AtticusColor.YELLOW + "Time Until AFK: " + AtticusColor.AQUA + ""));
		sender.addChatMessage(new ChatComponentText(AtticusColor.YELLOW + "AFK Message: " + AtticusColor.AQUA + "Hello there"));
		sender.addChatMessage(new ChatComponentText(AtticusColor.RED + "" + AtticusColor.STRIKETHROUGH + "                                                   "));
	}
	
	@Override
    public boolean canCommandSenderUseCommand(ICommandSender sender)
    {
        return true;
    }

}
