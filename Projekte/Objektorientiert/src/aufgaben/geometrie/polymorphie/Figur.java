package aufgaben.geometrie.polymorphie;

public abstract class Figur {
	private int x, y;
	
	public Figur() {
	}
	
	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void bewegen(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	/*
	 * Schwäche: keine sinnvolle Realisierung der Methode in dieser Klasse möglich
	 * 
	 *  public double getFlaeche() {
	 * 	 return -1;
	 *	}
	 */
//	 public double getFlaeche() {
//		 return -1;
//	 }
	
	public abstract double getFlaeche();
	
	public String getDisplayKoordinaten() {
		return "[" + x + ", " + y + "]";
	}
}
