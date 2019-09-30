package arrays;

import java.util.Arrays;

public class B09_KlasseArrays {

	public static void main(String[] args) {

		int[] arr = { 5, -7, 8, 13, 20005 };
		
		// new java.util.Arrays();  // Compilerfehler (privater Konstruktor)
		
		String s1 = Arrays.toString(arr);
		String s2 = arr.toString();
		
		System.out.println(s1); // [5, -7, 8, 13, 20005]
		System.out.println(s2); // [I@1e81f4dc
		
		
	}

}
