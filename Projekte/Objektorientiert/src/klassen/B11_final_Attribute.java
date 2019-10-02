package klassen;

import java.util.Random;

/*
 * Regeln für Konstanten
 * 
 * - statische Konstanten müssen manuell (explizit) spätestens in einem statischen init-Block initialisiert werden
 * - Objekt-Konstanten (final Attribute) müssen manuell (explizit) spätestens in jedem Konstruktor initialisiert werden
 */

class Fahrzeug {
	
	/*
	 *  statische Attribute
	 */
	
	static int var;					// <- statische Variable, bekommt implizit den Wert 0
	
	// static final int K1;		// <- statische Konstante: Compilerfehler! Muss manuell initialisiert werden
	
	static final int K2 = 2;
	
	static final int K3;
	
	static {
		K3 = new Random().nextInt();
		// K3 = 3;
	}
	
	static {
		// K3 = 3;
	}
	
	
//	static final int K4;				// Compilerfehler
//	static void init() { K4 = 4; }		// Compilerfehler
//	static { init(); } 					// Reicht nicht

	
	/*
	 * Objekt-Attribute
	 */
	
	
	int x; // Variable, bekommt implizit den Wert 0
	
	// final int objKonstante1;		// <-  Konstante: Compilerfehler! Muss manuell initialisiert werden
	
	final int objKonstante2 = 2;

	final int objKonstante3;
	
	{
		objKonstante3 = 3;
	}

	final int objKonstante4;
	
	Fahrzeug() {
		//init-Block auch integriert
		this.objKonstante4 = 2;
	}
	
	Fahrzeug(int x) {
		//init-Block auch integriert
		this.objKonstante4 = x;
	}

	// Compilerfehler (objKonstante4 nicht initialisiert):
//	Fahrzeug(byte b) {
//		//init-Block auch integriert
//	}
	
	
} // end of Fahrzeug





public class B11_final_Attribute {

	public static void main(String[] args) {
		
		final int x = 12; // lokale Konstante 

	}

}
