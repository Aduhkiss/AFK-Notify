package findr.today.afk.listener;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MessageListener {
	@SubscribeEvent
	public static void onAFKMessage(ClientChatReceivedEvent event) {
		if(Minecraft.getMinecraft().getNetHandler().getNetworkManager().getRemoteAddress().toString().indexOf(("hypixel.net"))>= 0) {
			// This means we must be on hypixel
		}
	}
	
	// While these are the same things, I wanted to separate the code, simply to make it easier for people to read and write.
	
	@SubscribeEvent
	public static void onHypixelMessageEvent(ClientChatReceivedEvent event) {
		
	}
}
