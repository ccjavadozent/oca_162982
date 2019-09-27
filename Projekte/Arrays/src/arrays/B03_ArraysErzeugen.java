package arrays;

public class B03_ArraysErzeugen {

	public static void main(String[] args) {

		/*
		 * Variante 1
		 */
		int[] arr1 = new int[3];
		arr1[0] = 12;
		arr1[1] = 13;
		arr1[2] = 14;
		
		/*
		 * Variante 2. Nur beim sofortigen Initialisieren einer neuen Referenz:
		 */
		int[] arr2 = { 12, 13, 14 };
		int[] arr2a = { 12, 13, 14, }; // dasselbe wie für arr2
		
		int[] arr2b = {
			1,	
			2,	
			3,	
		};
		
		/*
		 * Variante 3
		 */
		int[] arr3 = new int[] { 12, 13, 14 };
		
		
		/*
		 * Unterschiede beim Übergeben als Argument:
		 */
		sum(arr1);
		sum(arr2);
		sum(arr3);
		
//		 sum( 12, 13, 14 ); // Compilerfehler. dafür gibt es var-args (später)
		
//		 sum( {12, 13, 14} ); // Compilerfehler
		
		sum( new int[] {12, 13, 14} );
		
		
		/*
		 * Unterschide beim Zuweisen
		 */
		
		int[] arr4;
		
		arr4 = new int[3];
//		arr4 = { 0, 0, 0 }; // Compilerfehler: geht nur beim sofortigen Initialisieren
		arr4 = new int[] { 0, 0, 0 };
		
	} // end of main

	
	static int sum(int[] arr) {
		
		int result = 0;
		
		for (int x : arr) {
			result += x;
		}
		return result;
	}

	/*
	 * Unterschiede bei return 
	 */
	static int[] buildArray() {
//		int[] arr = { 12, 13, 14 };
//		return arr;	// geht auch
		
		// return {12, 13, 14}; // Compilerfehler
		return new int[] {
			12, 13, 14
		};
	}
}











