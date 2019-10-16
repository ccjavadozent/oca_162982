package sort_search;

import java.util.Arrays;
import java.util.Comparator;

public class B05_NachStringsSuchen {
	
	
	static class MyComp implements Comparator<String> { 
		public int compare(String s1, String s2) { 
			return s2.compareTo(s1); 
		}
	}
	

	public static void main(String[] args) {

		String[] array = {
			"bb", "pp", "ff", "jj", "fh"	
		};
		
		System.out.println("*** Aufsteigend sortiert");
		Arrays.sort(array);
		System.out.println("Array: " + Arrays.toString(array));
		
		/*
		 *    0   1   3   3   4
		 *  [bb, ff, fh, jj, pp]
		 */
		
		int pos = Arrays.binarySearch(array, "pp"); // sucht im natürlich aufsteigend sortierten Array
		System.out.println("Gesucht nach pp. Position: " + pos); // 4
		
		pos = Arrays.binarySearch(array, "aa");
		System.out.println("Gesucht nach aa. Position: " + pos); // -1
		
		
		System.out.println("*** Absteigend sortiert");

		Comparator<String> cmp = new MyComp();
		Arrays.sort(array, cmp);
		System.out.println("Array: " + Arrays.toString(array)); 
		
		/*
		 *   0   1   2   3   4
		 * [pp, jj, fh, ff, bb]
		 */
		// falsche binarySearch
		pos = Arrays.binarySearch(array, "pp"); // sucht im natürlich aufsteigend sortierten Array, aber hier ist das Array anders sortiert
		System.out.println("FALSCH gesucht im alternativ sortierten Array nach pp. Position: " + pos); // -6
		
		// richtige binarySearch
		pos = Arrays.binarySearch(array, "pp", cmp); // sucht im sortierten Array, 
		System.out.println("RICHTIG gesucht im alternativ sortierten Array nach pp. Position: " + pos); // 0
		
	} // end of main

}
