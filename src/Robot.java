
public class Robot {
	private String name;
	private String game;
	private String team;
	private int height;
	private int width;

	public Robot(String theName, String theGame, String theTeam, int theHeight, int theWidth) {
		name = theName;
		game = theGame;
		team = theTeam;
		height = theHeight;
		width = theWidth;
	}

	public String getName() {
		return (name);
	}

	public String getGame() {
		return (game);
	}

	public String getTeam() {
		return (team);
	}

	public int getHeight() {
		return (height);
	}

	public int getWidth() {
		return (height);
	}
}