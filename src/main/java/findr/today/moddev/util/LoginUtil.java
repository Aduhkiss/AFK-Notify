package findr.today.moddev.util;

import java.net.Proxy;

import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;

import net.minecraft.util.Session;

public class LoginUtil {
	public static Session makeSession(String email, String password) {
        YggdrasilAuthenticationService service = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
        YggdrasilUserAuthentication auth = (YggdrasilUserAuthentication)service.createUserAuthentication(Agent.MINECRAFT);
        auth.setUsername(email);
        auth.setPassword(password);
        try {
            auth.logIn();
            return new Session(auth.getSelectedProfile().getName(), auth.getSelectedProfile().getId().toString(), auth.getAuthenticatedToken(), "mojang");
        }
        catch (AuthenticationException localAuthenticationException) {
            localAuthenticationException.printStackTrace();
            return null;
        }
	}
	
	// Here is the code in order to set the session into Minecraft through Reflection
	
//	Field sessionField = ReflectionHelper.findField(Minecraft.class, "session", "field_71449_j");
//	ReflectionHelper.setPrivateValue(Field.class, sessionField, sessionField.getModifiers() & ~Modifier.FINAL, "modifiers");
//	ReflectionHelper.setPrivateValue(Minecraft.class, Minecraft.getMinecraft(), YOUR_SESSION_INSTANCE, "session", "field_71449_j");
}
