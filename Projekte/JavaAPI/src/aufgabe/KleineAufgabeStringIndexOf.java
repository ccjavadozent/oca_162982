package aufgabe;

public class KleineAufgabeStringIndexOf {

	public static void main(String[] args) {

		//          0123456789012345678901234567890123456789012345678901234567890123456
		String s = "Die Note Do ist nicht dasselbe wie Do, wenn Do für Donnerstag steht";
		
		/*
		 * A1.
		 * 
		 * Suchen Sie bitte alle Positionen im String s, wo der Unterstring 'Do' steht.
		 * geben Sie die Positionen aus: 
		 */
		a1a(s);
		a1b(s, "Do");
		a1c(s, "Do");
		
	} // end of main
	
	static void a1c(String s, String substr) {
		System.out.println("a1, Variante 3");
		
		for (int i = 0; i < s.length()-substr.length(); i++) {
			
			int trefferIndex = s.indexOf(substr, i);
			
			if(trefferIndex==i) {
				System.out.println("Treffer, Index " + i);
				i = trefferIndex;
			}
		}
	}

	static void a1b(String s, String substr) {
		System.out.println("a1, Variante 2");
		
		for (int i = 0; i < s.length()-substr.length(); i++) {
			if( s.startsWith(substr, i) ) {
				System.out.println("Treffer, Index: " + i);
			}
		}
	}
	
	static void a1a(String s) {
		System.out.println("a1, Variante 1");
		
		int toIndex = s.length()-2;
		
		for (int i = 0; i < toIndex; i++) {
			if( s.charAt(i) == 'D' && s.charAt(i+1) == 'o' ) {
				System.out.println("Treffer, Index: " + i);
			}
		}
	}

}
