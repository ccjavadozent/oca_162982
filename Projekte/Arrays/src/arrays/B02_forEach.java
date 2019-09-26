package arrays;

public class B02_forEach {

	public static void main(String[] args) {

		float[] a1 = new float[3];
		a1[1] = 1.3F;

		System.out.println("*** a1 mit der for-Schleife: ");
		
		for(int i=0; i < a1.length; i++) {
			System.out.println( a1[i] );
		}
		
		
		System.out.println("*** a2 mit der erweiterten for-Schleife (foreach): ");
		
		for( float var : a1 ) {
			System.out.println(var);
		}
		
		System.out.println("*** (ohne weiteres) Kein Schreibzugriff auf das Array in der foreach:");
		
		for (float f : a1) {
			f = 17.23F; // Blockvariable überschreiben: keine Auswirkung auf das Array
		}
		
		System.out.println("a1[0] = " + a1[0]); // 0.0
		
		
		System.out.println("*** Mit etwas Aufwand geht es: ");
		int index = 0;
		
		for (float f : a1) {
			System.out.println("f = " + f);
			System.out.println("a1[index] = " + a1[index]);
			
			a1[index] = -5; // Schreiben in Array. Übersichtlicher wäre die normale for-Schleife
			index++;
		}
		
		kleineAufgabe();
	} // end of main
	
	/*
	 * kleine Aufgabe:
	 * 
	 * - Bitte ein boolean-Array der Länge 200 anlegen.
	 * - Array ausgeben
	 * - Jede gerade Position mit dem Wert true belegen
	 * - Array ausgeben
	 * 
	 */
	static void kleineAufgabe() {
		System.out.println("*** Aufgabe: ");
		
		boolean[] arr = new boolean[200];
		
		for (boolean b : arr) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		for(int i = 0; i<arr.length; i++) {
			if(i%2 == 0) {
				arr[i] = true;
			}
		}
		
		for (boolean b : arr) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

}











