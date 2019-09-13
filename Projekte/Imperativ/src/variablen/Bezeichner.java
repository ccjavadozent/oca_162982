package variablen;

/*
 * englisch: Identifier
 * 
 * Das sind Namen für Variablen, Methoden, Klassen
 */
public class Bezeichner {

	public static void main(String[] args) {
		
		/*
		 * Regeln:
		 * 
		 * - Es dürfen keine Schlüßelwörter sein
		 * 
		 * - Identifier dürfen bestehen aus:
		 * 		- Buchstaben
		 * 		- Unterstrich
		 * 		- Ziffern (nicht vorne)
		 * 		- Währungssymbolen
		 * 
		 */

//		 int int;		// Compilerfehler!
		 int intVar;	
		 int INT; 		// Grossbuchstaben für Variablen nicht empfohlen	

		int x12;
		
//		int 12x;		// Compilerfehler
		
		int variableMitEinemKomplexenNamen;
		variableMitEinemKomplexenNamen = 3;
		
//		int _ ;  // Compilerfehler seit Java 8
		
		int _12 ;	// Seltsam. Kompiliert aber. (nicht empfohlen)
		
		int $;		// Seltsam. Kompiliert aber. (nicht empfohlen)
		int € = 33; // Seltsam. Kompiliert aber. (nicht empfohlen)
		
		
		
		
	}

	
}
