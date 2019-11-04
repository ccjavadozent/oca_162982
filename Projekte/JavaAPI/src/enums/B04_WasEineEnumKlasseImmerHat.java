package enums;


enum Size {
	BIG, SMALL
}

class Groesse {
	static final Groesse GROSS = new Groesse();
	static final Groesse KLEIN = new Groesse();
	
	private Groesse() {}
}

public class B04_WasEineEnumKlasseImmerHat {

	public static void main(String[] args) {

		/*
		 * Referenzen anlegen
		 */
		Size s1 = null;
		Groesse g1 = null;
		
		/*
		 * Objekte bilden
		 */
		// s1 = new Size(); 		// Compilerfehler: keine neue Objekte von enum-Typ
		// g1 = new Groesse();		// Compilerfehler: Konstruktor ist private
		
		/*
		 * Zugriff auf statische Konstanten
		 */
		s1 = Size.BIG;
		g1 = Groesse.GROSS;
		
		/*
		 * toString:
		 */
		System.out.println(s1); // BIG
		
		// Aufgabe: folgende Zeilen müssen die Ausgaben GROSS und KLEIN erzeugen
		System.out.println(g1); // GROSS
		System.out.println(Groesse.KLEIN); // KLEIN
		
	}

}
