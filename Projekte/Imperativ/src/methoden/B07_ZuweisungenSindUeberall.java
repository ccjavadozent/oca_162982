package methoden;

/*
 * - Der Compiler kennt nie den Wert einer Variable
 * 
 *  - Der Compiler vergleicht bei der Zuweisung die Typen (!!!)
 * 
 * 		Ausnahme: explizite Zuweisung mit einem int-Literal:
 * 
 * 			byte b = 2; // implizites Casting
 * 			short s = 2; // implizites Casting
 * 			char c = 2; // implizites Casting
 * 
 * 		Ausnahme: return mit int-Literal
 * 
 */

public class B07_ZuweisungenSindUeberall {

	/*
	 * Definition der Methode. 
	 * Aufpassen dass der deklarierte Methoden Typ (Rückgabetyp)
	 * für den return-Wert breit genug ist. 
	 */
	static short getShort() {
//		 return 12L;  // Compilerfehler: short <= long
		
//		int var = 12;
//		return var;   // Compilerfehler: short <= int
		
		return 12; // Ausnahme: implizites Casting zu byte mit einem int-Literal 
	}
	
	/*
	 * Definition der Methode. 
	 * 
	 */
	static void setByte(byte b) {
	}

	
	
	public static void main(String[] args) {

		/*
		 * Methode verwenden
		 */
		
//		byte res1 = getShort(); // byte <= short
		
//		setByte(12); // Compilerfehler. Keine int-Literal-Ausnahme hier!!! byte b <= int
	}

}
