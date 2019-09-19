package methoden;

/*
 * Wenn eine Methode es nicht kann selbst die Daten zu ermitteln, die für ihre Arbeit nötig sind,
 * kann die Methode die Daten als Parameter deklarieren. 
 * 
 * - Parameter sind auch lokale Variablen der Methode, die aber beim Aufruf der Methode initialisiert werden
 */
public class B04_Parameter {
	
	static void addAndPrint(int a, int b) {
		// int a = 2, b = 3;
		
		int sum = a + b;
		
		System.out.println(a + " + " + b + " = " + sum);
	}

	
	public static void main(String[] args) {

		addAndPrint(6, 7);
		
		addAndPrint(-6, 6);
		
		addAndPrint(8, -8); 
		
		System.out.println("end of main");
	}

	
	/*
	 * kleine Aufgabe:
	 * 
	 * Verbessern Sie bitte die Methode addAndPrint so, dass sie keine Summe berechnet, sondern eine Fehlermeldung
	 * ausgibt, falls das Addieren der Parameter int-Bereich sprengt.
	 */
	
}
