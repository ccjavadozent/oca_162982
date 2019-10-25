package interfaces;

interface Laeufer {
	int MAX_DISTANZ = 100;
	
	static int getMaxDistanz() { return MAX_DISTANZ; }
}


class Person implements Laeufer {
	public static final int MAX_ALTER = 150;
	
	public static int getMaxAlter() { return MAX_ALTER; }
	
	static void personTest() {
		System.out.println(Person.MAX_ALTER);
		System.out.println(MAX_ALTER);
		
		System.out.println( getMaxAlter() );
		System.out.println( getMaxDistanz() ); // Achtung! statische Methoden aus einem Interface NUR durch den Interface-Namen erreichbar
		System.out.println( Laeufer.getMaxDistanz() ); 
	}
}


class Dozent extends Person {
	static void dozentTest() {
		System.out.println(Person.MAX_ALTER);
		System.out.println(MAX_ALTER);
		
		System.out.println( getMaxAlter() );
		System.out.println( getMaxDistanz() ); // Achtung! statische Methoden aus einem Interface NUR durch den Interface-Namen erreichbar
		System.out.println( Laeufer.getMaxDistanz() ); 
	}
	
//	public static int getMaxDistanz() { return 3; } 
}

public class B07_Statische_Elemente_und_erbende_Klassen {

	public static void main(String[] args) {

//		System.out.println(MAX_ALTER); // Compilerfehler
		
		System.out.println("1: " + Person.MAX_ALTER);
		System.out.println("2: " + Dozent.MAX_ALTER);
		
		System.out.println("3: " + Laeufer.MAX_DISTANZ);
		System.out.println("4.a: " + Person.MAX_DISTANZ);
		System.out.println("4.b: " + Dozent.MAX_DISTANZ);
		
		/*
		 * Achtung beim Aufruf statische Methoden:
		 */
		System.out.println("5: " + Person.getMaxAlter());
		System.out.println("6: " + Dozent.getMaxAlter());
		
		System.out.println("7: " + Laeufer.getMaxDistanz());
		System.out.println("8: " + Person.getMaxDistanz()); // Achtung! statische Methoden aus einem Interface NUR durch den Interface-Namen erreichbar
		System.out.println( Laeufer.getMaxDistanz() ); 
		
	}

}
