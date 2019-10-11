package vererbung;

public class B13_Vererbung_bei_Arrays {

	public static void main(String[] args) {

		/*
		 * Arrays mit primitiven Elementen sind Geschwisterklassen
		 */
		
		int[] a1 = { 1, 2, 3 };
		
		// long[] a2 = a1; 			// Compilerfehler: keine IS-A-Beziehung
		
		// Object[] arrObj = a1;	// Compilerfehler: keine IS-A-Beziehung
		
		float[] a3 = { 1F, 0.5F, 7.7F };
		
		print(a3);
		
		double a4 = { 3.3, 4.4, 5.5 };
		
		print(a4);
		
		
	} // end of main
	
	
	/*
	 * Aufgabe A1.
	 * 
	 * Definieren Sie bitte eine (!) Methode print, die als Argument
	 * sowohl float[] als auch double[] akzeptiert. Die print soll alle Elemente des Arrays
	 * untereinander ausgeben.
	 * 
	 *  Die print muss keine anderen Arrays mit primitiven unterstützen.
	 */

}
