package klassen;

/*
 * - Eine Klasse wird beim ersten Verwenden geladen (Objekt bilden, statische Methode aufrufen)
 * 
 * - Beim Laden der Klasse werden alle statische Initialisierungsblöcke ausgeführt
 *  
 */

class Tier {
	
	static {
		System.out.println("Tier / static init");
	}
	
	Tier() {
		System.out.println("Tier / Konstruktor");
	}
}

class Stern {
	static {
		System.out.println("Stern / static init");
	}
}


public class B09_KlasseLaden_static_int {

	public static void main(String[] args) throws Exception {

		System.out.println("main 1");
		
		Tier t1; // <- Laden der Klasse ist nicht nötig um 32 bit auf dem Stack zu reservieren
		
		System.out.println("main 2");
		
		new Tier(); // <- Klasse Tier wird geladen, erst danach kann ein Tier-Objekt mit 'new' gebildet werden
		
		System.out.println("main 3");
		
		new Tier(); // <- Klasse Tier ist bereits geladen, muss nicht nochmal geladen werden
		
		// manuell Klasse laden:
		Class<?> classOfStern = Class.forName("klassen.Stern"); 
		
		// Klassenobjekt finden:
		Class<?> classOfTier = Tier.class;

		Class<?> classSternCopy = Stern.class;
		
		System.out.println("Referenzenvergleich: " + ( classOfStern==classSternCopy ) ); // true
	
		Stern s1 = new Stern();
		
		Class<?> classSternCopy2 = s1.getClass();
		
		System.out.println("Referenzenvergleich: " + ( classOfStern==classSternCopy2 ) ); // true
		
		System.out.println("Klassenname (vollqualifiziert): " + classOfStern.getName());
		System.out.println("Klassenname (einfach): " + classOfStern.getSimpleName());
		
				
	} // end of main

	
	static {
		System.out.println("B09 / static init");
	}
}
