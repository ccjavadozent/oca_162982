package interfaces;

import java.util.Arrays;

public class B02_ArraysSortieren_WieEinInterfaceKomponentenVerbindet {
	
	
	static class Auto implements Comparable<Auto> {
		int baujahr;

		public Auto(int baujahr) {
			this.baujahr = baujahr;
		}

		@Override
		public String toString() {
			return "Auto " + baujahr;
		}
		
		public int compareTo(Auto a2) {
			return baujahr - a2.baujahr;
		}
		
	} // end of Auto
	

	public static void main(String[] args) {
		
		Object[] autos = {
			new Auto(2003),				
			new Auto(1990),				
			new Auto(2012),				
		};
		
		System.out.println( Arrays.toString(autos) );
		
		/*
		 * Sortiert aufsteigend in der natürlichen Reihenfolge.
		 */
		Arrays.sort(autos);
		
		/*
		 * - Die sort-Methode muss auf kleiner/grösser vergleichen um zu sortieren. 
		 *   Dafür verlangt die sort-Methode, dass die Elemente im Array vergleichbar sind (Comparable).
		 *   
		 * - Die sort-Methode vergleicht Elemente paarweise etwa so (bei i < j):
		 * 
		 *   Comparable element_i = (Comparable) array[i];
		 *   Comparable element_j = (Comparable) array[j];
		 *   
		 *   if( element_i.compareTo(element_j) > 0 ) {
		 *   	// hier elemente vertauschen
		 *   }
		 */
		
		System.out.println( Arrays.toString(autos) );
		
		

	} // end of main

}
