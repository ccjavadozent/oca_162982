package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Situation:
 * 		- Eine Komponente einbinden, die auf ein Interface programmiert wurde:
 * 			Hier: Collections.sort(List, Comparator) aufrufen, um besonders eine List zu sortieren
 * Dafür nötig:
 * 		- Interface Comparator realisieren (eine neue Klasse schreiben, compare-Methode implementieren)
 * 		- Neues Objekt von der neuen Klasse erzeugen
 * 		- sort aufrufen, die Referenz auf das neue Comparator-Objket übergeben und 
 * 			mit dem Objekt den Verweis auf die konkrete Realisierung der Methode 'compare'  
 * 
 * Design-Probleme und Lösungen:
 *  
 * Problem 1:
 * 		- Kein direktes Lösen der Aufgabe: (Vergleichslogik an die sort übergeben). 
 * 			Es wird immer ähnlicher Dienstcode nötig: Klasse realisieren...
 * 
 * 		- Lösung vor Java 8: anomyme Klassen
 * 		- Lösung ab Java 8: Lambda-Funktionen (nur bei funktionallen Interfaces)
 * 
 * 
 * Problem 2:
 * 		- Es entsteht eine weitere Klasse in der Anwendungsbibliothek
 *         (mehr Möglichkeiten für Kopplung, mehr Namen zu berücksichtigen...)
 * 
 * 		- Lösung: Klassen verstecken (innere Klassen, Sichtbarkeiten),
           Gültigkeitsbereich der Klassen reduzieren (lokale Klassen) 
 * 
 * 
 */


/*
 * Toplevel-Klasse definieren 
 *  (nicht so toll, wenn die Klasse nur innerhalb einer anderen Klasse verwendet wird)
 */
class ToplevelCmp implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;
	}
}

public class B02_Loesungswege_mit_Sprachmitteln {
	
	/*
	 * Innere Klasse definieren
	 *   - besser als Toplevelklasse, wenn die Comparator-Klasse nur innerhalb einer anderen Klasse (B02_...) verwendet wird.
	 *   - gute Lösung, wenn in mehreren Methoden der aüßeren Klasse die innere Klasse wiederberwendet wird
	 */
	private static class NestedCmp implements Comparator<Integer> {
		public int compare(Integer i1, Integer i2) {
			return i2 - i1;
		}
	} 

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(22);
		list.add(-7);
		list.add(0);

		/*
		 * Toplevel-Klasse verwenden:
		 */
//		Collections.sort(list, new ToplevelCmp());
		
		
		/*
		 * Inner-Klasse verwenden:
		 */
//		Collections.sort(list, new NestedCmp());
		
		
		
		/*
		 * Lokale Klasse definieren:
		 * 	- besser sogar als innere Klasse, wenn der Comparator nur in der main-Methode benötigt wird
		 */
		class LocalCmp implements Comparator<Integer> {
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		}
		
		/*
		 * Lokale Klasse verwenden:
		 * 
		 */
//		Collections.sort(list, new LocalCmp());
		
		
		/*
		 * Anonyme Klasse definieren UND sofort verwenden
		 */
		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		};
//		Collections.sort(list, cmp);
		
		
		
		/*
		 * Nochmal eine anonyme Klasse definieren UND sofort verwenden
		 */
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		});
		
		
		/*
		 * Das Problem mit unlesbaren anonymen Klassen sollen Lambda-Funktionen lösen:
		 */
		Collections.sort( list, (i1, i2) -> i2 - i1 );
		
		
		System.out.println("list: " + list);
	} // end of main

	
	
}
