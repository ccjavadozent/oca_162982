package strings;
/*
 * - Schritt 1 (Kompilieren)
 * 
 * 		Unter anderem sammelt der Compiler alle (einzigartige) String-Literale aus der Klasse
 * 		und erstellt daraus für die Klasse die Literalen-Liste: mo, di
 * 
 * - Schritt 2 (Starten)
 * 
 * 		Beim Laden der Klasse erzeugt die VM für die Texte aus der Literalen-Liste, 
 * 		die es noch nicht im String-Pool gibt neue String-Objekte und fügt sie dem String-Pool zu.
 */
public class StringPool {

	public static void main(String[] args) {
		String s = "mo"; // hole die Referenz für 'mo'-String aus dem String-Pool
		String s1 = "mo"; // hole die Referenz für 'mo'-String aus dem String-Pool
		
		System.out.println(s == s1); // true
		
		String s2 = new String("mo"); // neues Objekt auf dem Heap erzeugen, 
										// Inhalte aus dem String-Objekt vom String-Pool.
										//  Hole dafür die Referenz für 'mo'-String aus dem String-Pool
		
		
		System.out.println(s == s2); // false 
		
		String s3 = "di"; //  Hole die Referenz für 'di'-String aus dem String-Pool
		
		test(); // Keine neuen String-Objekte werden beim Aufruf der Methode 'test' erzeugt
	}

	static void test() {
		String s = "mo"; //  Hole die Referenz für 'mo'-String aus dem String-Pool
	}
	
}
