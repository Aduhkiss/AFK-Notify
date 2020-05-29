package findr.today.afk;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import findr.today.afk.cmd.AFKNCommand;
import findr.today.afk.listener.MessageListener;
import findr.today.moddev.AtticusMod;
import findr.today.moddev.util.LoginUtil;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

@Mod(modid = "afknotify", version = "1.0", acceptedMinecraftVersions = "[1.8.9]",
clientSideOnly = true, name = "AFK Notify")
public class AFK extends AtticusMod {
	public AFK() {
		super("AFK Notify", new String[] {"Atticus (Fluuuf)"});
	}

	@Override
	public void onEnable() {
	}
	
	@EventHandler
	public void onInit(FMLPostInitializationEvent event) {
		
		// Debug Logging into Minecraft
		// TESTING! REMOVE THIS BEFORE UPLOAD!
		Field sessionField = ReflectionHelper.findField(Minecraft.class, "session", "field_71449_j");
		ReflectionHelper.setPrivateValue(Field.class, sessionField, sessionField.getModifiers() & ~Modifier.FINAL, "modifiers");
		ReflectionHelper.setPrivateValue(Minecraft.class, Minecraft.getMinecraft(), LoginUtil.makeSession("[mc email address]", "[mc password lol]"), "session", "field_71449_j");
		
		// Commands
		ClientCommandHandler.instance.registerCommand(new AFKNCommand());
		
		// Listeners
		MinecraftForge.EVENT_BUS.register(MessageListener.class);
	}
	
	
}
