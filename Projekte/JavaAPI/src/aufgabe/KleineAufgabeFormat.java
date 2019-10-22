package aufgabe;

import java.util.Random;

public class KleineAufgabeFormat {

	public static void main(String[] args) {

		/*
		 * A1
		 * 
		 * 
		 * Bitte das Array mit Zufallswerten als eine Tabelle ausgeben:
		 * 
		 * |     Nr.| 		Wert  |
		 * |	 01 | 	   121314 |
		 * |     02 | 		  -22 |
		 * ...
		 * 
		 */
		int[] array = randomArray(); // Array Länge 10 mit Zufallswerten aus dem Bereich [-10000 ... 10000] 
		print(array);
		
		
	} // end of main
	
	static void print(int[] arr) {
		String fmt = "|%8s |%10s |%n";
		System.out.printf(fmt, "Nr.", "Wert");
		
		fmt = "|      %02d |%10s |%n";
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(fmt, i+1, arr[i]);
		}
	}

	static int[] randomArray() {
		int[] arr = new int[10];
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(20001) - 10000; 
		}
		
		return arr;
	}
	
	
}
