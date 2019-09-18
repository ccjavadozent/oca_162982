package kontrollstrukturen;

public class Schleifen01_ForSchleife {
	
	
	public static void main(String[] args) {
//		 endloseSchleife();
		
//		 schleifeMitZehnWiedrholungen();
//		 kleineAufgabe01();
		
		schleifeWeiterUntersuchen();
		
	} // end of main
	
	static void schleifeWeiterUntersuchen() {
		System.out.println("----- Test 1 ----------------------");
		for( int i=0, j=1, k=2;  i<10 && j<1000 && k!=9 ; i+=2, j--, k*=3 ) {
			System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		}
		
		// System.out.println("i = " + i); // i ist nur in der Schleife gültig
		
		System.out.println("----- Test 2 ----------------------");
		
		int x = 22;
		
		for(; x < 25 ; x++) {
			System.out.println("x = " + x);
		}
		
		System.out.println("Nach der Schleife. x = " + x); // 25
		
		System.out.println("----- Test 3 -----------------------");
		
		for(int i=0; i<4;) {
			System.out.println(i++); 
		}
		/*
		 * 1. i = 0
		 * 2. i(0) < 4 -> true
		 * 		Ausgabe: 0
		 *      i = 1 (Postinkrement)
		 * 3. -
		 * 4. i(1) < 4 -> true
		 * 		Ausgabe: 1
		 * 		i = 2 (Postinkrement)
		 * 
		 * 3. -
		 * 4. i(2) < 4 -> true
		 * 		Ausgabe: 2
		 * 		i = 3 (Postinkrement)
		 * 
		 * 3. -
		 * 4. i(3) < 4 -> true
		 * 		Ausgabe: 3
		 * 		i = 4 (Postinkrement)
		 * 
		 * 3. -
		 * 4. i(4) < 4 -> false
		 * 
		 */
		
		System.out.println("----- Test 4 -----------------------");
		
		for(int i=0; i++<4;) {
			System.out.println(++i); 
		}
		// i = 0 
		// i = 1
		// i = 2 -> Ausgabe
		// i = 3
		// i = 4 -> Ausgabe
		
		System.out.println("end of method 'schleifeWeiterUntersuchen'");
	}

	
	static void schleifeMitZehnWiedrholungen() {
	
		/*
		 * 1. Initialisierungsbereich wird ausgewertet
		 * 2. Bedingung auswerten (bei false: Schleife beenden, bei true: Schleifendurchlauf starten)
		 * 
		 * 3. Inkrementierungsbereich auswerten
		 * 4. Bedingung auswerten (bei false: Schleife beenden, bei true: Schleifendurchlauf starten)
		 * 
		 * Schritte 3 und 4 werden wiederholt bis die Schleife im Schritt 4 beendet wird
		 */
		
		for(int i=0 ; i < 10 ; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("end of method 'schleifeMitZehnWiedrholungen'");
	}
	

	static void endloseSchleife() {

		/*
		 * Endlose Schleife
		 */
		for( ; ; ) {
			System.out.println("laufe...");
		}

		// System.out.println("end of method");  // Compilerfehler: Unreachable code
	}
	

	/*
	 * definieren Sie bitte die Methode 'kleineAufgabe01' so,
	 * dass sie in einer Schleife die Zahlen von 5, 4, 3, 2, und 1 ausgibt 
	 * 
	 */
	static void kleineAufgabe01() {
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
	}
	
}




