package findr.today.moddev.util;

public enum AtticusColor {
	
	BLACK("0"),
	DARK_GREEN("2"),
	DARK_RED("4"),
	GOLD("6"),
	DARK_GRAY("8"),
	GREEN("a"),
	RED("c"),
	YELLOW("e"),
	DARK_BLUE("1"),
	DARK_AQUA("3"),
	DARK_PURPLE("5"),
	GRAY("7"),
	BLUE("9"),
	AQUA("b"),
	LIGHT_PURPLE("d"),
	WHITE("f"),
	
	OBFUSICATE("k"),
	STRIKETHROUGH("m"),
	ITALIC("o"),
	BOLD("l"),
	UNDERLINE("n"),
	RESET("r");
	
	private String color;
	
	AtticusColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "§" + color + "";
	}
}
