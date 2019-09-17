package operatoren;

/*
 * Bedingungsoperator wird auch als ternärer Operator bezeichnet
 */
public class Bedingungsoperator {

	public static void main(String[] args) {
		

		/*
		 * 2. und 3. Operand haben denselben Typ
		 */
		int x = true ? 22 : 0 ;
		System.out.println("x = " + x); // 22

		int y = x > 0 ? 1 : -1; 
		System.out.println("y = " + y); // 1
		
		// int z = x ? 1 : 2;  // Compilerfehler: 1. Operand muss boolean sein
		
		
		boolean result = x==1000 ? true : false; // Sinnlos, geht aber
		System.out.println( "result: " + result ); // false
		
		result = x==1000;
		System.out.println( "result: " + result ); // false
		
		
		/*
		 * Typen für den 2. und 3. Operanden unterscheiden sich
		 */
		
		// int var = x > 0 ? 77 : 3.5; // Compilerfehler
		double var = x > 0 ? 77 : 3.5;
		System.out.println("var1 = " + var); // 77.0
		
	}

}
