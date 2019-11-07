package exceptions;

/*
 * finally-Block sollte eingesetzt werden um 'Ressourcen' zu schliessen.
 * 
 * 
 * - finally wird IMMER ausgeführt, wenn sein try-Block aktiv wurde (gestartet wurde)
 * 		Ausnahme: System.exit im try
 * 
 */

public class B10_finally {

	public static void main(String[] args) {

		test01();
		
		try {
			test02();
			
		} catch (ArithmeticException e) {
			System.out.println("2. ArithmeticException abgefangen");
		}
		
		try {
			test03();
			
		} catch (ArithmeticException e) {
			System.out.println("3. ArithmeticException abgefangen");
		}

		test04();
		
	} // end of main

	
	static void test01() {
		System.out.println("*** finally nach dem try ohne exception");
		
		try {
			System.out.println("1. try");
			
		} finally {
			
			System.out.println("1. finally");
		}
	}

	
	static void test02() {
		System.out.println("*** finally nach dem try mit exception");
		
		try {
			System.out.println("2. try");
			System.out.println(5/0);// Exception hier
			
		} finally {
			System.out.println("2. finally");
		}
		
		System.out.println("2. Zu der Ausgabe kommt es nicht, da im try eine Exception geworfen wurde");
	}
	
	
	static void test03() {
		System.out.println("*** finally läuft NICHT, wen sein try-Block nicht aktiviert wurde (nicht startete)");
		
		System.out.println(5/0); // Exception hier
		
		try {
			System.out.println("3. try");
		} finally {
			System.out.println("3. finally");
		}
	}
	
	
	static void test04() {
		System.out.println("*** finally lässt sich mit catch kombinieren (soll ganz am Ende stehen):");
		
		try {
			System.out.println("4. try");
		} catch (Exception e) {
			System.out.println("4. catch");
		} finally { // kein catch danach erlaubt!!!
			System.out.println("4. finally");
		} 
		
	}
	
}
