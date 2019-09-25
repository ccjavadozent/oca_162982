package aufgaben.geometrie.klassen;

public class Rechteck {

	static void changeRechteck(Rechteck r, int breite, int hoehe) {
		r.breite = breite;
		r.hoehe = hoehe;
	}
	
	int breite, hoehe;

	/*
	 * default-Constructor wird nicht generiert!!!!!!!!!!!!!!!!!! (es gibt expliziten Constructor),
	 *  würde aber so aussehen:
	 * 
	 * public Rechteck() {
	 * 		super();
	 * 		this.breite = 0;
	 * 		this.hoehe = 0;
	 * }
	 * 
	 */
	
	Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public String toString() {
		return "Rechteck (" + breite + " X " + this.hoehe + ")";
	}

	void setDimensionen(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
}
