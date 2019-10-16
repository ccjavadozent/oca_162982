package aufgaben;

import java.util.Arrays;
import java.util.Comparator;
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
			int res = this.nachname.compareTo(p2.nachname);
			
			if(res==0) {
				res = this.vorname.compareTo(p2.vorname);
			}
			
			return res;
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

		System.out.println("*** Aufgsteigend sortiert: ");
		Arrays.sort(personen); // 
		print(personen);
		
		System.out.println("*** Suche nach John Black");
		
		Person key = new Person("John", "Black");
		int pos = Arrays.binarySearch(personen, key);
		System.out.println("Position: " + pos); // 0
		
		
		System.out.println("*** Abgsteigend sortiert: ");
		
		Comparator<Person> cmp = Comparator.reverseOrder(); 
		Arrays.sort(personen, cmp);
		print(personen);

		System.out.println("*** Suche nach John Smith");
		
		key = new Person("John", "Smith");
		pos = Arrays.binarySearch(personen, key, cmp); // bitte die richtige binarySearch bei alternativen Sortierung verwenden
		System.out.println("Position: " + pos);
		
		
		
	} // end of main
	
	
	static void print(Person[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println( i+1 + ". " + array[i] );
		}
	}

}
