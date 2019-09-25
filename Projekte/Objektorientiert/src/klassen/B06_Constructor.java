package klassen;

/*
 * - Constructor ist eine spezielle Instanzmethode, 
 *   die zum Initialisieren von einem frisch reservierten Objekt aufgerufen wird
 *  
 * - Constructor hat KEINE Rückgabetypangaben
 *  
 * - Jede Klasse hat mindestens einen Constructor
 * 
 * - Für die Klasse ohne expliziten Konstruktoren generiert der Compiler den default-Constructor
 */


class C1 {
	int x;
	
	/*
		C1 hat den default-Constructor:

		
		C1() {
			super();
			this.x = 0; 
		}
	 */
}


class C2 {
	int x;
	int y;
	
	/*
	 * C2 hat keinen default-Constructor
	 */
	
	C2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class B06_Constructor {

	public static void main(String[] args) {

		new C1();
		
		// C1();  // geht gar nicht
		
		// new C2(); // kein noargs-Constructor
		
		C2 var = new C2(22, 13);
		System.out.println("var.x: " + var.x);
	}

}
