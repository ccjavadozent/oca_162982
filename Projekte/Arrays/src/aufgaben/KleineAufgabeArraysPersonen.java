package aufgaben;

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
public class KleineAufgabeArraysPersonen {

	public static void main(String[] args) {
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
