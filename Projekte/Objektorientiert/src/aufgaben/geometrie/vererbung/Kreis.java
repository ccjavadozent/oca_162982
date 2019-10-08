package aufgaben.geometrie.vererbung;

public class Kreis extends Figur {
	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. R = " + radius + ". Koordinaten: " + getDisplayKoordinaten();
	}
}
