package methoden;

/*
 * Wenn eine Methode es nicht kann selbst die Daten zu ermitteln, die für ihre Arbeit nötig sind,
 * kann die Methode die Daten als Parameter deklarieren. 
 * 
 * - Parameter sind auch lokale Variablen der Methode, die aber beim Aufruf der Methode initialisiert werden
 */
public class B04_Parameter {
	
	/*
	 * kleine Aufgabe:
	 * 
	 * Verbessern Sie bitte die Methode addAndPrint so, dass sie keine Summe berechnet, sondern eine Fehlermeldung
	 * ausgibt, falls das Addieren der Parameter int-Bereich sprengt.
	 */
	static void addAndPrint(int a, int b) {
		// int a = 2, b = 3;

		long summe = (long)a + b;
		
		if( summe > Integer.MAX_VALUE || summe < Integer.MIN_VALUE) {
			System.out.println("Fehler: " + a + " + " + b + " sprengt int-Bereich");
			
		} else {
			
			System.out.println(a + " + " + b + " = " + summe);
		}
	}

	
	public static void main(String[] args) {

		// addAndPrint(); // Argumente fehlen
		
		addAndPrint(6, 7);
		
		addAndPrint(1, Integer.MAX_VALUE); 
		
		System.out.println("end of main");
	}
	
}
