package findr.today.afk;

public class AFKManager {
	private static AFKManager me;
	public static AFKManager get() {
		if(me == null) {
			me = new AFKManager();
		}
		return me;
	}
	
	public AFKManager() {
		// Do some shit
	}
}
