package aufgaben.geometrie.polymorphie;

public class Kreis extends Figur {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. R = " + radius + ", Koord.: " + getDisplayKoordinaten();
	}
}
