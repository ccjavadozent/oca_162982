package vererbung;

/*
 * - Casting ändert nicht den Typ eines Objektes!!!
 * 
 */

public class B06_Casting {
	
	static class Person {
		String name;
	}
	
	static class Dozent extends Person {
		int gehalt;
		
		@Override
		public String toString() {
			return "Dozent " + name + ", Gehalt: " + gehalt;
		}
	}

	
	public static void main(String[] args) {

		/*
		 * Situation im Code: eine Referenz vom Basistyp (Hier: p1 vom Typ Person)
		 * referenziert ein Objekt vom abgeleiteten Typ (Hier: Dozent-Objekt).
		 * 
		 * In deisem Lernbeispiel wird das Objekt dierekt mit new gebildet,
		 * in der Praxis kann es dazu kommen, dass eine Komponente ein Dozent-Objekt bildet, aber
		 * eine Basistyp-Referenz darauf liefert.   
		 * 
		 * Aufgabe hier: gehalt im Objekt auf 1200 setzten
		 */
		Person p1 = new Dozent();
		p1.name = "Tom";
		// p1.gehalt = 1200; // Compilerfehler: p1 ist von Typ Person (kein Attribut 'gehalt')

		
		// Dozent d1 = p1; // Dozent <= IST-KEIN <= Person
		
		Dozent d1 = (Dozent) p1; // OK, p1 zeigt auf ein Objekt von Typ 'Dozent'
		d1.gehalt = 1200;
		
		/*
		 * Das Casting '(Dozent) p1' kann mann nachprogrammieren:
		 * 
		 * if( !(p1 instanceof Dozent) ) {
		 *    throw new ClassCastException("das Objekt ist nicht von Typ 'Dozent'");
		 * }
		 */
		
		System.out.println( p1 );
		System.out.println( d1 );
		
		p1 = new Person();
		Dozent d2 = (Dozent) p1; // ClassCastException
		
		
		
		
	} // end of main 

}
