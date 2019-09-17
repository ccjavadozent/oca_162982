package kontrollstrukturen;

public class IfAbfrage {

	public static void main(String[] args) {

		if(true) {
			System.out.println("1.a Heute ist Dienstag");
			System.out.println("1.b Di.");
		}

		
		int day = 2;
		
		if( day==1 ) { // der folgende Block wird übersprungen
			System.out.println("2. Heute ist Montag"); 
		}
		
		/*
		 * Es ist nicht empfohlen, auf die geschweiften Klammer nach if zu verzichten.
		 * Aber es geht:
		 */
		
		if( day==2 ) 
			System.out.println("3. Ja, ist Dienstag"); // gehört zu der if
		
		if( day==3 ) 
			System.out.println("4. Mittwoch"); // gehört zu der if, wird übersprungen (false)
		
		
		/*
		 * Achtung, Exam
		 */
		if( day==4 )
			System.out.println("5.a Donnerstag.");
			System.out.println("5.b Do ist die Abkürzung."); // Gehört NICHT zu der if! Wird unbedingt ausgeführt
			
		/*
		 * Achtung, Exam
		 * 
		 * var darf NUR boolean sein:
		 */
		int var = 3;
		// if(var) {  }   // Compilerfehler
		
		boolean var2 = false;
		
		if( var2 == true ) { // Seltsam, aber korrekt: Vergleichsoperator verwendet. (Besser: var2)
			System.out.println("A. var2 ist true"); // übersprungen
		}
		
		boolean var3 = false;
		if( var3 = true ) { // Achtung! Zuweisungsoperator statt des Vergleichsoperators!
			System.out.println("B. var3 ist true"); // wird ausgegeben 
		}
		
		
		
		
		System.out.println("end of main");
	}

}




















