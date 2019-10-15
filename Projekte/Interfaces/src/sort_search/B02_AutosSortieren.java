package sort_search;

import java.util.Arrays;

public class B02_AutosSortieren {

	static class Auto implements Comparable<Auto> {
		private String hersteller;
		private int baujahr;

		public Auto(String hersteller, int baujahr) {
			this.hersteller = hersteller;
			this.baujahr = baujahr;
		}
		
		@Override
		public String toString() {
			return hersteller + " " + baujahr;
		}
		
		@Override
		public int compareTo(Auto a2) {
			int erg = hersteller.compareTo(a2.hersteller);
			
			if(erg==0) {
				erg = baujahr - a2.baujahr;
			}
			
			return erg;
		}
	} // end of Auto
	
	/*
	 * - Jedes Auto hat baujahr (int) und Hersteller (String)
	 * - Bilden Sie bitte ein Array mit 3-4 Autos
	 * - Sortieren Sie bitte das Array (mit Arrays.sort)
	 * - Geben Sie bitte das Array aus
	 * 
	 */
	public static void main(String[] args) {
		Auto[] autos = {
			new Auto("VW", 2000),	
			new Auto("Mazda", 2011),	
			new Auto("Audi", 2019),	
			new Auto("VW", 1987),	
		};
		
		print( autos );
		
		Arrays.sort( autos );
		
		print( autos );
		
	} // end of main
	

	static void print(Auto[] autos) {
		System.out.println("*** Autos");
		
		for (int i = 0; i < autos.length; i++) {
			System.out.println(i + ". " + autos[i]);
		}
	}
}
