package aufgaben;

public class KleineAufgabeExceptions {

	public static void main(String[] args) {

		/*
		 * A1. Bitte die Methode formatName realisieren (Das Argument wird in Großbuchstaben umgewandelt)
		 */
		
		String name = "Jerry";
		
		name = formatName(name);
		
		System.out.println("Name: " + name); // JERRY
		
		/*
		 *  A2. Bei dem folgenden Aufruf, soll die main-Methode nicht kritisch beendet werden: 
		 */
		try {
			name = formatName(null);
		} catch (Exception e) {
			System.out.println("Abgefangen: " + e);
		}
		
		
		/*
		 * A3. 
		 * 
		 * folgende Aufruf der formatName soll eine IllegalArgumentException werfen, mit der Fehlernachricht:
		 * 'der Name muss mindestens 3 Zeichen haben' 
		 */
		formatName("Do");
		
		
		System.out.println("end of main");
		
	} // end of main

	
	static String formatName(String name) {
		// falls der Name zu kurz ist, die IllegalArgumentException werfen
		if( name.length() < 3 ) {
			throw new IllegalArgumentException("der Name muss mindestens 3 Zeichen haben");
		}
		
		return name.toUpperCase();
	}
}



















