package aufgaben.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Astronaut {
	private String name;

	public Astronaut(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Austronaut " + name;
	}
}

public class KleineAufgabeFunctional {

	public static void main(String[] args) {
		
		/*
		 * A1. 
		 * 
		 * Bitte ein Array 'namen' mit folgenden Strings erstellen:
		 * 	
		 * "Tom", "Jerry", "Peter", "Paul", "Mary", "Ute"
		 * 
		 */

		String[] namen = { "Tom", "Jerry", "Peter", "Paul", "Mary", "Ute" };
		
		/*
		 * A2.
		 * 
		 * Klasse 'Astronaut' mit 
		 * - einem String-Attribut 'name'
		 * - Konstruktor (das Attribut initialisieren)
		 * - toString: return "Austronaut " + name;
		 * 
		 */
		
		/*
		 * A3.
		 * 
		 * Bitte die Methode 'buildMannschaft' realisieren, die die List mit Astronauten erzeugt,
		 * und Namen für die Astronauten aus dem übergebenen Array nimmt.
		 * Der 2. Parameter beschreibt die Logik zum Bilden eines Astronauten. 
		 */
		List<Astronaut> listA = buildMannschaft(namen, n -> new Astronaut(n));
		
		for (Astronaut astronaut : listA) {
			System.out.println(astronaut);
		}
		
		
	} // end of main

	static List<Astronaut> buildMannschaft(String[] namen, Function<String, Astronaut> builder) {
		List<Astronaut> list = new ArrayList<>();
		
		for (String name : namen) {
//			Astronaut a = new Astronaut(name);
			Astronaut a = builder.apply(name);
			list.add(a);
		}
		
		return list;
	}
	
}






