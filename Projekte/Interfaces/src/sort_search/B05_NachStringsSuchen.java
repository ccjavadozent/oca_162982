package sort_search;

import java.util.Arrays;

public class B05_NachStringsSuchen {

	public static void main(String[] args) {

		String[] array = {
			"bb", "pp", "ff", "jj", "fh"	
		};
		
		Arrays.sort(array);
		System.out.println("Array: " + Arrays.toString(array));
		
		/*
		 *    0   1   3   3   4
		 *  [bb, ff, fh, jj, pp]
		 */
		
		int pos = Arrays.binarySearch(array, "pp");
		System.out.println("Gesucht nach pp. Position: " + pos); // 4
		
		pos = Arrays.binarySearch(array, "aa");
		System.out.println("Gesucht nach aa. Position: " + pos); // -1
		
	} // end of main

}
