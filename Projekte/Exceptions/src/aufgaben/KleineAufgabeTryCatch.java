package aufgaben;

import java.util.Random;

public class KleineAufgabeTryCatch {

	public static void main(String[] args) {
		
		/*
		 * A1.
		 * 
		 * realisieren Sie bitte die Methode 'void maybeException()', 
		 * die mit ca. 50%-Wahrscheinlichkeit eine unchecked Exception wirft
		 * 
		 * A2.
		 * Rufen Sie maybeException() in der main solange auf, bis sie ohne Exception ausgeführt wird.
		 * 
		 * (d.h. wenn maybeException() eine Exception wirft, soll sie nochmal aufgerufen werden...)
		 * 		
		 */

		do {
			try {
				System.out.println("Rufe die maybeException auf");
				maybeException();
				System.out.println("Erfolg!");
				break;
				
			} catch (Exception e) {
				System.out.println("Exception!");
			}
		} while(true);
		
		
		System.out.println("end of main");
	}

	static void maybeException() {
		if( new Random().nextBoolean() ) {
			throw new RuntimeException();
		}
	}
}
