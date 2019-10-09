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

		Person p1 = new Dozent();
		p1.name = "Tom";
		// p1.gehalt = 1200; // Compilerfehler: p1 ist von Typ Person (kein Attribut 'gehalt')

		
		// Dozent d1 = p1; // Dozent <= IST-KEIN <= Person
		
		Dozent d1 = (Dozent) p1;
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
