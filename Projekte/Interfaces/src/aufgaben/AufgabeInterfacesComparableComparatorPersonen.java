package aufgaben;

import java.util.Arrays;
//import java.util.Comparator;

public class AufgabeInterfacesComparableComparatorPersonen {
	
	static class Person implements Comparable<Person> {
		private String vorname, nachname;

		public Person(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}
		
		@Override
		public String toString() {
			return vorname + " " + nachname;
		}
		
		@Override
		public int compareTo(Person p2) {
			return 0;
		}
		
	} // End of Person 
	

	public static void main(String[] args) {

		Person[] personen = {
			new Person("Paul", "Smith"),
			new Person("Paul", "Black"),
			new Person("John", "Smith"),
			new Person("John", "Black"),
		};
		
		print(personen); 

		Arrays.sort(personen); // 
		
		System.out.println("*** Aufgsteigend sortiert: ");
		print(personen);
		
	} // end of main
	
	
	static void print(Person[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println( i+1 + ". " + array[i] );
		}
	}

}
