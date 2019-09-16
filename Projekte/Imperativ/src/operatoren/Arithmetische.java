package operatoren;

public class Arithmetische {

	public static void main(String[] args) {
		
		/*
		 * Arithmetische Operatoren
		 * 
		 * + 	- 	* 	/ 	% 
		 * 
		 */
		
		
		/*
		 * Achtung!!!
		 * 
		 * - Das Ergebnis einer arithmetischen Operation ist mindestens vom Typ int.
		 * - Das Ergebnis einer arithmetischen Operation hat den Typ des 'breitesten' Operanden
		 * 
		 *   int -> long -> float -> double
		 */
		
		
		int a = 12;
		int b = 13;
		
		int c = a + b; // int <= int
		
		byte var1 = 1;
		byte var2 = 2;
		 
		// byte var3 = var1 + var2; // byte <= int ( Das Ergebnis einer Addition ist mindestens int)

		
		long var4 = 13;
		
//		int var5 = a + var4; // int <= long ( Das Ergebnis der Addition hier ist long )
		
//		int var6 = (int) a + var4; // int <= long
		
		int var7 = (int) (a + var4); // int <= (int)long
		System.out.println( "var7: " + var7 );
		
		int var8 = (int)var4 + a; // int <= int + int
		System.out.println("var8: " + var8);
		
		
	}

}
