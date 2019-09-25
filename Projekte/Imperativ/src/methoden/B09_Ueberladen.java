package methoden;

/*
 * - Überladen in englisch: overloading
 * 
 * - Überladen: Definieren mehrere Methoden mit gleichem Namen in derselben Klasse.
 * 		Es geht, wenn die Signaturen der Methoden sich unterscheiden.
 * 
 * - Signatur: Methodenname + Liste der Parametertypen
 * 
 *  
 * 
 */

public class B09_Ueberladen {
	
	static void hello() { 				// Signatur: hello()
		System.out.println("noargs");
	}
	
//	static int hello() {  				// Signatur: hello()
//	}
	
	static void hello(String name) { 	// Signatur: hello(String)
		System.out.println("String");
	}
	
//	static void hello(String user) { 	// Signatur: hello(String)
//	}

	static void hello(int x, int y) {	// Signatur: hello(int, int)
		System.out.println("int, int");
	}
	
	static void hello(int x, long y) { // Signatur: hello(int, long)
		System.out.println("int, long");
	}

	public static void main(String[] args) {

		hello(2, 3); // int, int
		hello(2, 3L); // int, long
		
	}

}
