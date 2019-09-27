package arrays;

class Giraffe {}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person " + name;
	}
}

public class B07_MehrdimArraysNochmal {

	public static void main(String[] args) {

		int[] arr1; // 0 Objekte
		
		int[][] arr2 = new int[5][]; // 1 Objekt 
		
		int[][][][][][] arr3 = new int[2][][][][][]; // 1 Objekt
		
		
		int[][][] arr4 = new int[2][3][2]; // 9 Objekte

		int[][][] arr5 = new int[3][2][3]; // 10 Objekte

		String[] arr6 = new String[3]; // 1 Objekt (alle Elemente sind null)

		String[][][] arr7 = new String[3][2][3]; // 10 Objekte
		
		
		Giraffe[] arr8 = new Giraffe[10]; // 1 Objekt (Array selbst)
		
		arr8[0] = new Giraffe(); // + 1 Objekt 
		
		kleineAufgabe();
	} 
	
	/*
	 * kleine Aufgabe:
	 * 
	 * 1. Speichern Sie bitte folgende Namen in einem Array namens 'namen':
	 * 
	 *  Tom, Jerry, Peter, Paul, Mary
	 * 
	 * 2. 
	 * 	  Erzeugen sie eine Klasse 'Person' mit einem Attribut 'name'
	 * 
	 * 3. Bilden Sie bitte ein Array mit Personen. Die Namen für die Personen
	 * 		aus dem Array 'namen' verwenden.
	 * 
	 */
	static void kleineAufgabe() {
		System.out.println("*** Aufgabe");
		
		String[] namen = { "Tom", "Jerry", "Peter", "Paul", "Mary" };
		
		Person[] personen = new Person[namen.length];
		
		for (int i = 0; i < personen.length; i++) {
			personen[i] = new Person(namen[i]);
		}
		
		for (Person person : personen) {
			System.out.println(person);
		}
		
	}

}
