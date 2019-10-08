package aufgaben.geometrie.vererbung;

public class Rechteck extends Figur {
	private int breite, hoehe;
	
	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	@Override
	public String toString() {
		return "Rechteck " + breite + " X " + hoehe + ". Koordinaten: " + getDisplayKoordinaten();
	}
}
