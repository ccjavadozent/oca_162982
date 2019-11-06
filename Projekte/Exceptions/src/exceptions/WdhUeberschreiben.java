package exceptions;

/*
 * Regeln beim Überschreiben:
 * 
 * 1. Sichtbarkeit nicht verschärfen
 * 2. Rückgabetyp nicht ändern
 * 3. Keine zusätzlichen (breiteren, Geschwister) checked Exceptions deklarieren
 */

interface Fahrzeug {
	void fahren();
}

class Rennwagen implements Fahrzeug {
	private int fahren(int x) { return 3; } // Überladen
	public void fahren() {  System.out.println("Rennwagen fährt..."); }
}



public class WdhUeberschreiben {
	
	static void rennen(Fahrzeug f1, Fahrzeug f2) {
		f1.fahren();
		f2.fahren();
	}

	
	public static void main(String[] args) {

		Fahrzeug f1 = new Rennwagen();
		Fahrzeug f2 = new Rennwagen();
		
		rennen(f1, f2);
		
	}
	
	

}
