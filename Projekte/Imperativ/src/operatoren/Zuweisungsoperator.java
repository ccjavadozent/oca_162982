package operatoren;


/*
 * Achtung!
 * 
 * *** Der Compiler kennt (fast) nie den Wert einer Variable *** 
 * 
 * *** Bei der Zuweisung vergliecht der Compiler die Typen der Operanden *** 
 * *** (Es gibt bei einigen Literalen Ausnahmen.)
 * 
 */
public class Zuweisungsoperator {

	public static void main(String[] args) {

		int x = 1;
		
		int var1 = x; // int <= int
		
		long var2 = x; // long <= int
		
//		byte var3 = x; // byte <= int  // Compilerfehler
		
		byte var3 = (byte)x; // byte <= (byte)int
		
		byte var4 = 1; // Ausnahme: beim int-Literal wird nicht nur der Typ, sondern auch der Wert analysiert,
						// Compiiler generiert (impizit) das Casting
		
		byte var5 = (byte) 1; // Explizites Casting
	
		
		long var6 = -1;
		
		int var7 = (int) var6; 
		
		System.out.println("var7: " + var7); // -1
		
		
		var6 = Long.MAX_VALUE;
		
		var7 = (int) var6; // Daten gehen verloren
		
		System.out.println("var7: " + var7); // ???
		
	}

}
