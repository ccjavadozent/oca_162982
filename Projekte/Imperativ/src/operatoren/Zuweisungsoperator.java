package operatoren;


/*
 * Achtung!!!
 * 
 * *** Der Compiler kennt (fast) nie den Wert einer Variable *** 
 * 
 * *** Bei der Zuweisung vergliecht der Compiler die Typen der Operanden *** 
 * *** (Es gibt bei int-Literalen eine Ausnahme.)
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
						// Compiler generiert (impizit) das Casting
		
		byte var5 = (byte) 1; // Explizites Casting
	
		
		long var6 = -1;
		
		int var7 = (int) var6; 
		
		System.out.println("var7: " + var7); // -1
		
		
		var6 = Long.MAX_VALUE;
		
		var7 = (int) var6; // Daten gehen verloren
		
		System.out.println("var7: " + var7); // ???
		
		
		/*
		 * Nochmal:
		 * 
		 * Eigentlich wird der Compiler bei der Zuweisung die Typen links und rechts abgleichen:
		 * Typ rechts muss 'enger' oder gleich sein wie der Typ links.
		 */
		
		/*
		 * Für die ganzzahligen Typen gibt es eine Ausnahme in dem Fall, dass rechts ein int-Literal steht
		 */
		short s1 = 22;
		// short s2 = 1234567; // Compilerfehler: Wert ist zu groß (nicht in der Prüfung)
		short s2 = (short)1234567;
		
		
		// int i1 = 1200L; // Compilerfehler: keine Ausnahme (kein int-Literal)
		
		
		float f1 = 12; // float <= int. passt immer!
		double d1 = f1;
		
		/*
		 * Achtung! Exam:
		 */
		
//		float f2 = 2e3; // Compilerfehler! float <= double
		
		
	}

}








