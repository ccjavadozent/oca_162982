package aufgaben;

import java.util.Random;

public class AufgabeArrays {

	public static void main(String[] args) {
		a1a2();
		a3();
		a4();
	}
	
	static void a4() {
		System.out.println("*** A4");
		char[] letters = deutscheBuchstaben();
		String arrayAsString = java.util.Arrays.toString(letters);
		System.out.println(arrayAsString);
	}
	
	static void a3() {
		System.out.println("*** A3");
		char umlaute[] = deutscheUmlaute(); 
		
		for(char ch : umlaute) {
			System.out.println(ch);
		}
		
	}
	
	static void a1a2() {
		System.out.println("*** A1 und A2");
		
		int[] arr = createArray(2, 15, 30);
		printArray(arr);
	} 

	static char[] deutscheUmlaute() {
		return new char[] { 'ä', 'ö', 'ü' };
	}

	static char[] deutscheBuchstaben() {
		int len = 'z' - 'a' + 5; // + 1 + 4 (ä, ö, ü, ß)
		
		char[] letters = new char[len];
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			letters[ch-'a'] = ch;
		}
		
		letters[letters.length-4] = 'ä';
		letters[letters.length-3] = 'ö';
		letters[letters.length-2] = 'ü';
		letters[letters.length-1] = 'ß';
		
		return letters;
	}
	
	static int[] createArray(int min, int max, int len) {
		int[] arr = new int[len]; 
		
		Random random = new Random();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(max-min) + min;
		}
		
		return arr;
	}
	
	static void printArray(int[] arr) {
		for( int x : arr ) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	
}
