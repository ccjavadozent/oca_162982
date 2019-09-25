package klassen;

/*
 * Definition der Klasse 'Auto'. Oft in einer eigenen java-Datei
 */
class Auto {
	
	/*
	 * Statisches Attribut. Hat nichts mit Objekten vom Typ 'Auto' zu tun
	 */
	public static final int MIN_BAUJAHR = 1886;
	
	/*
	 * Statische Methode. Hat nichts mit Objekten vom Typ 'Auto' zu tun
	 */
	static int getRandomBaujahr() {
		return new java.util.Random().nextInt(2000-MIN_BAUJAHR) + MIN_BAUJAHR;
	}
	
	/*
	 * Attribute (nicht-statische) beschreiben die Inhalte von jedem Auto-Objekt
	 */
	String hersteller; // Attribut
	int baujahr;
	
	/*
	 * (Nicht-statische) Methode beschreibt das Verhalten eines Auto-Objektes
	 */
	void fahren() {
		System.out.println("Auto fährt. Hersteller: " + hersteller + ", Baujahr: " + baujahr);
	}
	
} // end of Auto


/*
 * Die Klasse 'Auto' in den Methoden einer anderen Klasse verwenden
 */
public class B04_EineKlasseDefinierenUndVerwenden {

	public static void main(String[] args) {
		Auto a1 = new Auto();

		// System.out.println(a1.modell); // a1 ist vom Typ 'Auto', Klasse 'Auto' beschreibt kein Attribut 'modell'
		
		System.out.println("a1.baujahr: " + a1.baujahr); // 0
		
		System.out.println("a1.hersteller: " + a1.hersteller);
		
		a1 = null; // null ist die Konstante, die in jede Varibale-Referenz kopiert werden kann
		
		// a1.baujahr kompiliert, erzeugt aber zur Laufzeit eine Exception:
		// System.out.println( a1.baujahr ); // java.lang.NullPointerException

		
		/*
		 * Zugriff auf statische Elemente der Klasse Auto:
		 * 
		 *  Mit der Klassennamen!!!
		 */
		int minBJ = Auto.MIN_BAUJAHR;
		int randBJ = Auto.getRandomBaujahr();
		
		
		a1 = new Auto();
		/*
		 * Zugriff auf die Elemente eines Auto-Objektes:
		 */
		int baujahrAusA1 = a1.baujahr;
		a1.fahren();
		
		
		System.out.println("end of main");
		
	}

}
