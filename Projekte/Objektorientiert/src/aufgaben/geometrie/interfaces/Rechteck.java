package aufgaben.geometrie.interfaces;

public class Rechteck implements Figur {
	private int breite, hoehe;

	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	@Override
	public String toString() {
		return "Rechteck " + breite + " X " + hoehe;
	}
	
	@Override
	public double getFlaeche() {
		return breite * hoehe;
	}
}
