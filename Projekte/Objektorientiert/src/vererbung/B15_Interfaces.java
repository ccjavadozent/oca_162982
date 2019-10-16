package vererbung;

/*
 * (s. auch das Projekt 'Interfaces')
 * 
 * - Interface ist auch eine Typ-Beschreibung (wie eine Klasse), aber abstrakt
 * 
 * - Zu einem Interface kann eine Klasse eine IS-A-Beziehung definieren
 */

interface Lauffaehig {
	void laufen();
}



public class B15_Interfaces {

	static class Auto {
		
	}
	
	static class PKW extends Auto implements Lauffaehig { 
		public void laufen() {
			System.out.println("PKW fährt...");
		}
	}
	
	
	static class Person {
		
	}
	
	static class Dozent extends Person implements Lauffaehig {
		public void laufen() {
			System.out.println("Dozent läuft");
		}
	}
	
	
	/*
	 * Universelle Komponente
	 */
	static void zumLaufenBringen(Lauffaehig var) {
		var.laufen();
	}

	/*
	 * App
	 */
	public static void main(String[] args) {

		Dozent dozent = new Dozent();
		
		zumLaufenBringen( dozent );
		
		PKW pkw = new PKW();
		
		zumLaufenBringen(pkw);
		
		
		// Lauffaehig var = new Auto(); // Lauffaehig <= IST-NICHT <= Auto
		Lauffaehig var = new PKW(); // Lauffaehig <= ? <= PKW
		
		// var = new Person();
		var = new Dozent();
		
	} 
	

}
