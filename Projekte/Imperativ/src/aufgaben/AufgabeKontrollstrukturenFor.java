package aufgaben;

public class AufgabeKontrollstrukturenFor {

	public static void main(String[] args) {

		/*
		 * Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: 
		 * 0 1 2 3 4 5 6 7 8 9
		 */
		
		System.out.println("*** A1.");
		
		for(int i=0 ; i<=9 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		/*
		 * 0 2 3 4 5 6 7 8 9 
		 */
		System.out.println("*** A2.");
		
		for (int i = 0; i < 10; i++) {
			if(i!=1) { 
				System.out.print(i);
				System.out.print(' ');
			}
		}
		System.out.println();
		
		
		/*
		 * -4 -2 0 2 4 ... 50
		 */
		System.out.println("*** A3");
		for (int i = -4; i <= 50; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/*
		 * Bitte die englischen Kleinbuchstaben von a bis z in einer Zeile ausgeben
		 */
		System.out.println("*** A4.a");
		
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println("*** A4.b");
		
		for(int ch = 'a'; ch<='z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println("*** A4.c");
		
		for(int ch = 97; ch<=122; ch++) {
			System.out.print((char)ch + " ");
		}
		System.out.println();
		
		/*
		 * Bitte die englischen Grossbuchstaben rueckwaerts in einer Zeile ausgeben
		 */
		
		System.out.println("*** A5");
		
		for(char ch='Z'; ch>='A' ;ch--) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		/*
		 * Bitte die Zahlen aus dem Bereich [1 ... 100] ausgeben, die durch 5 ohne Rest dividierbar sind
		 */
		
		System.out.println("*** A6");
		
		for(int i=1; i<=100; i++) {
			if( i%5 == 0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
		/*
		 * 3 1 2 3 2 1 2 1 1
		 * _       _     _
		 */
		
		System.out.println("*** A7");
		
		for(int i=3; i>0; i--) {
			System.out.print("|"+ i + "| ");
			
			for(int j=1; j<i+1; j++) {
				System.out.print(j + " ");
			}
		}
		
	} // end of main

}























