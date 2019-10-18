package strings;

public class WdhStrings {

	public static void main(String[] args) {

		/*
		 * 1. Was ist die Audgabe?
		 * 
		 * 		di,mi
		 * 
		 * 2. Wie viele String-Objekte entstehen beim Aufrug der Methode 'get' auf dem Heap?
		 * 
		 * 		3
		 */
		
		System.out.println( get() );
		
		 //Wie viele String-Objekte entstehen in der nächsten Zeile auf dem Heap?
		new String(new String(build())); // 3
	}
	
	static String get() {
		
		String s1 = "mo"; 
		
		s1 = s1 + ",di";  // s1 = "mo,di"			// +1 neuer String
		
		s1 = s1.substring(3); // s1 = di			// +1 neuer String
		
		s1 = s1.concat(",mi"); // s1 = di,mi		// +1 neuer String
		
		return s1.toString(); // toString liefert this zurück
	}
	
	static String build() {
		return new String("java");
	};

}
