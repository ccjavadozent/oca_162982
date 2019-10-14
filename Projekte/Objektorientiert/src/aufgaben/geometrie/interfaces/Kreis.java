package aufgaben.geometrie.interfaces;

public class Kreis implements Figur {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis. R = " + radius;
	}
	
	@Override
	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
}
