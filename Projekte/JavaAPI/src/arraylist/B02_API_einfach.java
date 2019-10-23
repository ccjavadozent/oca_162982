package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class B02_API_einfach {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		/*
		 * int size()
		 */
		System.out.println( "1. size: " + list.size() );


		/*
		 * boolean isEmpty()
		 */
		System.out.println( "1. isEmpty: "  + list.isEmpty() );
		
		
		/*
		 * boolean add(E element)
		 */
		boolean result = list.add("mo"); // immer true für ArrayList
		System.out.println("add: " + result); // true
		
		System.out.println( "2. size: " + list.size() );
		System.out.println( "2. isEmpty: "  + list.isEmpty() ); // false

		/*
		 * toString ist überschrieben
		 */
		System.out.println("A. list: " + list); // [mo]
		
		list.add("mi");
		list.add("fr");
		
		System.out.println("B. list: " + list); // [mo, mi, fr]
		
		/*
		 * boolean remove(Object) // Sucht und löscht das Element
		 */
		result = list.remove("so");
		System.out.println("remove 'so': " + result); // false (so war nicht in der List)
		
		result = list.remove("fr");
		System.out.println("remove 'fr': " + result); // true (fr gefunden und entfernt)
		
		System.out.println("C. list: " + list); // [mo, mi]
		
		// a1();
		
		/*
		 * 
		 * Operationen mit index
		 * 
		 * 
		 */
		
		/*
		 * void add(int index, E element)
		 */
		int index = 1;
		list.add(index, "di");
		
		System.out.println("D. list: " + list); // [mo, di, mi]
		
		/*
		 * E remove(int index)
		 */
		index = 0;
		String element = list.remove(index);
		System.out.println("remove(0): " + element); // mo
		
		System.out.println("E. list: " + list); // [di, mi]
		
	} // end of main
	
	
	
	static void a1() {
		System.out.println("*** A1, remove(Object)");
		
		// - Erstellen Sie folgende Liste mit Strings:
		//    mo, fr, di, fr, mi, fr, do, fr.
		// - Geben Sie die Liste aus.
		// - Verwenden Sie bitte die Methode 'boolean remove(Object)' solange, bis es kein String "fr" mehr gibt.
		// - Geben Sie die Liste aus.
		
		ArrayList<String> list = new ArrayList<>();
		list.add("mo");
		list.add("fr");
		list.add("di");
		list.add("fr");
		list.add("mi");
		list.add("fr");
		list.add("do");
		list.add("fr");
		
		System.out.println("1: " + list);
		
		while( list.remove("fr") ) {
			System.out.println("while: " + list);
		}
		
	}

}















