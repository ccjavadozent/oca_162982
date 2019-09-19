package aufgaben;

public class AufgabeKontrollstrukturenWhileDoWhile {

	public static void main(String[] args) {

		System.out.println("*** A1: 0 1 2 3 4 5 6 7 8 9");
		
		int zahl = 0;
		
		while( zahl < 10 ) {
			System.out.print(zahl++ + " ");
		}
		System.out.println();
		
		
		System.out.println("*** A2: 0 2 3 4 5 6 7 8 9");
		
		zahl = 0;
		
		do {
			if(zahl != 1) { 
				System.out.print(zahl + " ");
			}
			zahl++;
			
		} while( zahl < 10 );
		System.out.println();
		
		
		System.out.println("*** A3: -4 -2 0 2 4 ... 50");
		
		zahl = -4;
		
		while(zahl <= 50) {
			System.out.print(zahl + " ");
			zahl += 2;
		}
		System.out.println();
		
		
		System.out.println("*** A4: a b c ... z");
		
		char ch = 'a';
		
		do {
			System.out.print(ch + " ");
			
		} while( ch++ < 'z' );
		
		System.out.println();
		
		
		System.out.println("");
		
		
		System.out.println("*** A5: Z Y X ... A");
		
		ch = 'Z';
		
		while(ch >= 'A') {
			System.out.print(ch-- + " ");
		}
		System.out.println();
		
	} // end of main

}
