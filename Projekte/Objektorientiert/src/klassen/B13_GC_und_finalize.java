package klassen;

/*
 * - Vor dem Löschen eines Objektes (wenn es überhaupt dazu kommt) ruft der GC die Methode 'finalize' auf.
 *   Achtung! Falls das Objekt in der finalize Methode vom Löschen gerettet wird und später nochmal 
 *   dem GC zu Vergügung steht, wird der GC die finalize-Methode zu dem Objekt nicht nochmal aufrufen,
 *   sonder nur das Objekt löschen.
 * 
 * - Es wird davon abgeraten auf die finalize-Methode zu programmieren bzw. zu vertrauen
 */

class Dozent {
	
	static Dozent STATIC_D;
	
	@Override
	public void finalize() {
		System.out.println("finalize / Dozent");
		
		// Bitte nie sowas machen:
		STATIC_D = this; // retten vom Löschen
	}
}

public class B13_GC_und_finalize {

	public static void main(String[] args) {
		
		Dozent d = new Dozent();
		System.out.println("d: " + d);

		d = null;

		System.gc(); // kein Versprechen
		
		// aus der System.gc():
		Runtime.getRuntime().gc();
		
		System.out.println("Pause...");
		try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); } // Pause ca. 1 Sek.
		
		System.out.println("Dozent.STATIC_D: " + Dozent.STATIC_D);
		
		System.out.println("end of main");
	}

}
