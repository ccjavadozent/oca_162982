package operatoren;

public class Logische {

	public static void main(String[] args) {
		
		
		/*
		 * Logische Operatoren (gehen NUR mit boolean-Operanden)
		 * 
		 * 		!			- NOT
		 * 
		 * 		&, &&		- AND	(short circuit && überspringt das Auswerten rechts, wenn links false steht)
		 * 
		 * 		|, ||		- OR	(short circuit || überspringt das Auswerten rechts, wenn links true steht)
		 * 
		 * 		^			- XOR
		 * 
		 */
		
		
		boolean b1 = true;
		System.out.println( "!b1 = " + !b1 ); // false
		

		System.out.println("***************************************");
		System.out.println( "*** & vs. && operator. Logik testen: " );
		System.out.println("***************************************");
		
		System.out.println( "true & true: " + (b1 & true) );   // true
		System.out.println( "true && true: " + (b1 && true) ); // true
		
		System.out.println( "true & false: " + (b1 & false) );
		System.out.println( "true && false: " + (b1 && false) );
		
		System.out.println( "false & true: " + (false & b1) );
		System.out.println( "false && true: " + (false && b1) );
		
		System.out.println( "false & false: " + (false & !b1) );
		System.out.println( "false && false: " + (false && !b1) );
		

		System.out.println("***************************************");
		System.out.println( "*** & vs. short circuit && operator  " );
		System.out.println("***************************************");
		
		int x = 0;
		int y = 0;
		
		boolean result = x==1 & ++y==1;
		
		System.out.println("A. result = " + result); // false
		System.out.println("A. y = " + y); // y = 1
		
		System.out.println("*** y auf 0 zurückgesetzt");
		y = 0;
		
		result = x==1 && ++y==1; // hier: Kurzschluß-Operator (short circuit):
									// Falls der &&-Operator bei der Auswertung seines linken Operandes
									// false findet ist das Gesamtergebnis des Operators bereits klar (false).
									// In diesem Fall wird der rechte Operand NICHT ausgewertet.
		
		System.out.println("B. result = " + result); // false
		System.out.println("B. y = " + y); // y = 0
		
//		z.B.:
//		
//		args = null;
//		if(args!=null && args.length==2) {
//			System.out.println("args verwenden");
//		} else {
//			System.out.println("args ignoriert");
//		}
		
		
		System.out.println("*************************************");
		System.out.println("*** XOR (^) - Tabelle");
		System.out.println("*************************************");
		System.out.println(" false ^ false = false " );
		System.out.println(" true ^ true = " + (true ^ true) ); // false
		System.out.println(" true ^ false = " + (true ^ false)); // true
		System.out.println(" false ^ true = true " );
		
		
	}

}













