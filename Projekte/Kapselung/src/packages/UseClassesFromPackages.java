package packages; // <- führt dazu, dass die Topleveltypen dieser java-Datei
					// in dem vollqualifizierten Namen auch den Package-Namen beinhalten


/*
 * package-Angabe ist immer die erste übersetzbare Anweisung in der javas-Datei!
 * 
 * import-Anweisungen, wenn es die gibt, stehen immer danach.
 * 
 * Und alles andere muss nach import-Anweisungen definiert werden.
 * 
 */

import importe.p1.Utils;
//import importe.p2.Utils;

import static java.lang.Math.PI;




class Auto { // <- heißt packages.Auto
	
}  


public class UseClassesFromPackages { // <- heißt packages.UseClassesFromPackages

	/*
	 * Wenn VM die main starten soll, bekommt sie den vollqualifizierten Namen der Klasse!
	 * 
	 * 	java packages.UseClassesFromPackages
	 */
	
	public static void main(String[] args) {
		
		Auto a1; // Der Compiler sucht nach dem Typ-Namen (Auto) zuerst in dem direkt umschliessenden Modul (Methode 'main')
					// dann eine Ebene höher (Klasse UseClassesFromPackages)
					// dann im Package 'packages' (Treffer)
		
		Utils u; // Der Compiler sucht nach dem Typ-Namen (Utils) zuerst in dem direkt umschliessenden Modul (Methode 'main')
					// dann eine Ebene höher (Klasse UseClassesFromPackages)
					// dann im Package 'packages'
					// dann in den import-Anweisungen (Treffer)
		
//		int PI = 2;
		System.out.println( PI ); // Der Compiler sucht nach dem Namen (PI) zuerst in dem direkt umschliessenden Modul (Methode 'main')
								  // dann eine Ebene höher (Klasse UseClassesFromPackages und Basisklassen)
									// dann in den import-static-Anweisungen (Treffer)
		System.out.println( "end of main of: " + UseClassesFromPackages.class.getName() );
	}

//	static String PI = "hallo"; 
}
