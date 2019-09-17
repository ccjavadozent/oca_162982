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
		
		
		System.out.println("------------------------------");
		System.out.println("--- % - Operator");
		System.out.println("------------------------------");
		
		System.out.println( "1. 10%2 = " + ( 10%2 ) ); // 0
		System.out.println( "2. 3%2 = " + ( 3%2 ) ); // 1
		System.out.println( "3. 1%2 = " + ( 1%2 ) ); // 1
		// System.out.println( "4. 1%0 = " + ( 1%0 ) ); // java.lang.ArithmeticException: / by zero
		
		System.out.println("------------------------------");
		System.out.println("--- Dividieren");
		System.out.println("------------------------------");
		
		int x = 0;
		// System.out.println( "5. (5 / x) = " + (5 / x) ); // java.lang.ArithmeticException: / by zero
		
		 System.out.println( "6. (5. / x) = " + (5. / x) ); // Infinity
		
		 double d = Double.POSITIVE_INFINITY; // nicht in der Prüfung
		 System.out.println( 1 + d ); // nicht in der Prüfung
		
	}

}
