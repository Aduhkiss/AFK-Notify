package findr.today.moddev;

public abstract class AtticusMod {
	
	private String displayName;
	private String[] developers;
	
	public AtticusMod(String displayName, String[] developers) {
		this.displayName = displayName;
		this.developers = developers;
		onEnable();
	}
	
	public AtticusMod(String displayName) {
		this.displayName = displayName;
		this.developers = null;
	}
	
	public abstract void onEnable();
	//public abstract void onDisable();
	
	public String getName() {
		return displayName;
	}
	
	public String getDevelopers() {
		StringBuilder builder = new StringBuilder();
		int size = developers.length;
		for(int i = 0; i < size - 1; i++) {
			String dev = developers[i];
			builder.append(dev + ", ");
		}
		return builder.toString();
	}
	
	public String[] getDevelopersArray() {
		return developers;
	}
}
