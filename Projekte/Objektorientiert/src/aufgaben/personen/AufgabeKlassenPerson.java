package aufgaben.personen;


public class AufgabeKlassenPerson {

	public static void main(String[] args) {

		Person p1 = new Person("Max", "Mustermann", 1700);
		Person p2 = new Person("Hans", "Meyer", 1960, "12345");
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println( p1.equals(p2) );
		System.out.println( p2.equals(p1) );
		
		Person p3 = new Person("Max", "Mustermann", 1700);
		// System.out.println(p1.equals(p3)); // NullPointerException
		
		Person p4 = Person.getMustermann();
		System.out.println( p4 );
		
	}

}
