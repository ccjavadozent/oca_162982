package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B05_API_erweitert {

	public static void main(String[] args) {

		/*
		 * Konstruktoren
		 */
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(13);
		
		List<Integer> list2 = new ArrayList<>( list1 );
		System.out.println("1. list2: " + list2); // [12, 13]
		
		/*
		 * addAll(Collection)
		 */
		list2.addAll( list1 );
		System.out.println("1. list2.size(): " + list2.size());
		
		System.out.println("2. list2: " + list2); // [12, 13, 12, 13]
		
		/*
		 * void clear();
		 */
		list2.clear();
		
		System.out.println("1. list2.size(): " + list2.size()); // 0
		
		
		/*
		 * Iterable, Iterator (nicht in der Prüfung)
		 */
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.add(14);
		
		System.out.println("*** list3 mit dem Iterator: ");
		Iterable<Integer> iterable = list3;
		
		Iterator<Integer> it = iterable.iterator();
		
		while( it.hasNext() ) {
			Integer e = it.next();
			System.out.println(e);
		}
		
		/*
		 * 
		 */
		
		
		
	} // end of main

	/*
	 * Kleine Aufgabe:
	 * 
	 * - Erzeugen Sie eine ArrayList mit "montag", "di", "mittw.", "freitagabend", "samstag"
	 * - Verwenden Sie bitte die sort-Methode der Klasse 'ArrayList' 
	 *   um die Liste nach Länge der Strings zu sortieren
	 * 
	 * 
	 */
	
}
















