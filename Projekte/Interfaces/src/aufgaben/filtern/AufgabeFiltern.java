package aufgaben.filtern;

import java.util.ArrayList;

public class AufgabeFiltern {

	public static void main(String[] args) {

		/*
		 * A1. Eine ArrayList mit folgenden Zahlen bilden: 12, 13, 14, 15, -4, 77
		 * 
		 *     Bitte die Liste ausgeben
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(-4);
		list.add(77);
		
		System.out.println("list: " + list);
		
		/*
		 * A2.
		 * 
		 * Bitte die Methode 'filtern' realisieren, die aus der übergebenen Liste nur die gerade Zahlen nimmt 
		 * und in eine neue ArrayList kopiert.
		 * 
		 * Die neue ArrayList wird zurück geliefert.
		 * 
		 */
		ArrayList<Integer> listGerade = filtern(list);
		System.out.println("list gerade: " + listGerade); // 12, 14, -4
		
		
	} // end of main

}
