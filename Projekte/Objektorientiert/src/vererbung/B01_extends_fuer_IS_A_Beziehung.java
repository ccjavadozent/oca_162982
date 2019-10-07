package vererbung;

/*
 * PKW
 */
class PKW {
	private String hersteller, modell;
	
	public PKW(String hersteller, String modell) {
		this.hersteller = hersteller;
		this.modell = modell;
	}

	public String getModell() {
		return modell;
	}
	
	public void automatischEinparken() {
		System.out.println("Parkassistent wird aktiviert...");
	}
	
	@Override
	public String toString() {
		return hersteller + " " + modell;
	}
}

/*
 * LKW
 */
class LKW {
	private String hersteller, modell;
	
	private int last; 
	
	public LKW(String hersteller, String modell) {
		this.hersteller = hersteller;
		this.modell = modell;
	}

	public String getModell() {
		return modell;
	}
	
	@Override
	public String toString() {
		return hersteller + " " + modell;
	}
	
	public void beladen(int last) {
		this.last = last;
	}
}

/*
 * Aufgabe 1. In einem neuen Klassendiagramm 'Fahrzeuge_Version1.uxf' aktuelle PKW und LKW darstellen
 */
public class B01_extends_fuer_IS_A_Beziehung {

	
	
}
