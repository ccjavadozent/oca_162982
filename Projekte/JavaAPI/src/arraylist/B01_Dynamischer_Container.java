package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class B01_Dynamischer_Container {

	public static void main(String[] args) {

		int[] arr = new int[10]; // die Länge lässt sich nicht ändern
		
		System.out.println( "arr: " + Arrays.toString(arr) );
		
		
		ArrayList<Integer> list = new ArrayList<>(); // Anfangsgröße = 0  
		
		System.out.println( "1. list: " + list ); // []
		
		list.add(1);
		list.add(3);
		
		System.out.println( "2. list: " + list ); // [1, 3]
		
		list.add(7);
		list.add(-12);

		System.out.println( "3. list: " + list ); // [1, 3, 7, -12]
		
		list.remove(0); // index = 0

		System.out.println( "4. list: " + list ); // [3, 7, -12]
		
		System.out.println( "get(1): " + list.get(1) );
		
	} 

}
