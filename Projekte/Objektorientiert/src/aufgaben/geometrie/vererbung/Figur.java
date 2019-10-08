package aufgaben.geometrie.vererbung;

public class Figur {
	private int x, y;

	public void bewegen(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	public String getDisplayKoordinaten() {
		return "[" + x + ", " + y + "]";
	}
	
}
