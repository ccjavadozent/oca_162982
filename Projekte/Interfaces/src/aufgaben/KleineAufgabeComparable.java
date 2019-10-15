package aufgaben;

import java.util.Arrays;
import java.util.Random;

public class KleineAufgabeComparable {
	
	static class Kreis implements Comparable<Kreis> {
		private int radius;

		public Kreis(int radius) {
			this.radius = radius;
		}
		
		@Override
		public String toString() {
			return "Kreis R = " + radius;
		}
		
		@Override
		public int compareTo(Kreis k2) {
			return radius - k2.radius;
		}
	}

	public static void main(String[] args) {

		/*
		 * - Jeder Kreis hat Radius (int)
		 * - Erzeugen Sie bitte ein Array mit 10 zufälligen Kreisen (Array ausgeben)
		 * - Sortieren Sie bitte das Array aufsteigend (Arrays.sort)
		 * - Geben Sie das Array erneut aus
		 */
		
		Kreis[] kreise = new Kreis[10];
		Random random = new Random();
		
		for(int i = 0; i<kreise.length; i++) {
			kreise[i] = new Kreis( random.nextInt(100) + 1 );
		}
		
		System.out.println("*** Vor dem Sortieren");
		for (int i = 0; i < kreise.length; i++) {
			System.out.println( i + ". " + kreise[i] );
		}
		
		Arrays.sort(kreise);
		
		System.out.println("*** Nach dem Sortieren");
		for (int i = 0; i < kreise.length; i++) {
			System.out.println( i + ". " + kreise[i] );
		}
		
		
		
	}

}
