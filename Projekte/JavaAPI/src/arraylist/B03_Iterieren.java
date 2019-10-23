package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class B03_Iterieren {

	public static void main(String[] args) {

		System.out.println("*** Array mit for: ");
		
		Integer[] arr = { 1, 3, -22, 5 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " " );
		}
		System.out.println();

		System.out.println("*** ArrayList mit for: ");
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(-22);
		list.add(5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print( list.get(i) + " " );
		}
		System.out.println();
		
		
		System.out.println("*** Array mit foreach: ");
		
		for( Integer x : arr ) {
			System.out.print(x + "  ");
		}
		System.out.println();
		
		System.out.println("*** ArrayList mot foreach: ");
		for(Integer x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		kleineAufgabe();
	} // 

	/*
	 * A1
	 * - Bitte ein String-Array anlegen: "mo", "di", "mi"
	 * 
	 * A2
	 * - Elemente aus dem Array in eine neue ArrayList kopieren
	 * 
	 * A3
	 * - Geben Sie untereinander die Elemente der ArrayList aus
	 */
	static void kleineAufgabe() {
		System.out.println("*** kleine Aufgabe");
		
		String[] arr = { "mo", "di", "heute" };
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add( arr[i] );
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	
}

