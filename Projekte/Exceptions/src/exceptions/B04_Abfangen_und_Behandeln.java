package exceptions;

public class B04_Abfangen_und_Behandeln {
	
	static void m1() {
		System.out.println("a");			// 3. Ausgabe
		
		System.out.println(5/0); // ArithmeticException
		
		System.out.println("b");
	}
	
	static void m2() {
		System.out.println("c");			// 2. Ausgabe
		
		m1(); // hier erscheint ArithmeticException, weiter propagiert zu der main
		
		System.out.println("d");
	}

	public static void main(String[] args) {

		System.out.println("m1");			// 1. Ausgabe
		
		try {
			m2(); // hier erscheint ArithmeticException, try-Block wird kritisch beendet, catch-Block wird aktiviert
			
			System.out.println("m2");
			
		} catch (Exception e) {
			System.out.println("m3");		// 4. Ausgabe
			
		} 
		
		System.out.println("m4");			// 5. Ausgabe
	}
}
