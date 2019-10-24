package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class StringCmpOnLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

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
		 * sort(Comparator) 
		 */
		System.out.println("*** sort(Comparator)");
		List<String> wochentage = new ArrayList<>();
		wochentage.add("montag");
		wochentage.add("di");
		wochentage.add("mittw.");
		wochentage.add("freitagabend");
		wochentage.add("samstag");
		
		System.out.println("wochentage vorm Sortieren: " + wochentage);
		
		Comparator<String> cmp = new StringCmpOnLength();
		wochentage.sort(cmp);
		
		System.out.println("wochentage nach dem Sortieren nach Länge: " + wochentage);
		
		/*
		 * In der Klasse java.util.Collections gibt es die Methoden sort und binarySearch für Listen
		 * 
		 */
		
	} // end of main

}



