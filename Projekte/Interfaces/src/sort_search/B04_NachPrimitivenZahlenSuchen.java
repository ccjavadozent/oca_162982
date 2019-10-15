package sort_search;

import java.util.Arrays;

public class B04_NachPrimitivenZahlenSuchen {

	public static void main(String[] args) {

		int[] array = { 2, 5, 1, 7, 22 };
		
		/*
		 * binarySearch 
		 */
		Arrays.sort(array);
		
		System.out.println("array: " + Arrays.toString(array)); // [1, 2, 5, 7, 22]
		
		/*
		 * Suchen nach 22:
		 * 
		 *  0  1  2  3   4
		 * [1, 2, 5, 7, 22]
		 * 
		 *        |					- Schritt 1 ( 5 < 22 -> suche weiter rechts )
		 *           7, 22]
		 *             | 			- Schritt 2 ( 7 < 22 -> suche weiter rechts )
		 *              22]
		 *               |			- Schritt 3: Treffer, index 4 zurückliefern
		 */
		int pos = Arrays.binarySearch(array, 22);
		System.out.println("Gesucht nach 22, Position: " + pos); // 4
		
		/*
		 * Suchen nach 3:
		 * 
		 *  0  1  2  3   4
		 * [1, 2, 5, 7, 22]
		 *
		 * 
		 *        |					- Schritt 1 ( 5 > 3 -> suche weiter links )
		 * [1, 2
		 *    |						- Schritt 2 ( 1 < 3 -> suche weiter rechts )
		 *     2
		 *     |					- Schritt 3: Kein Treffer, -(index 2+1) zurückliefern
		 */
		
		pos = Arrays.binarySearch(array, 3);
		System.out.println("Gesucht nach 3, Position: " + pos); // -3
		
		
	} // end of main

}
