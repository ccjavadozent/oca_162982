package vererbung;

public class B13_Vererbung_bei_Arrays {
	
	static class Person {} 
	static class Teilnehmer extends Person {} 
	static class Dozent extends Person {} 

	public static void main(String[] args) {

		/*
		 * Arrays mit primitiven Elementen sind Geschwisterklassen
		 */
		
		int[] a1 = { 1, 2, 3 };
		
		// long[] a2 = a1; 			// Compilerfehler: keine IS-A-Beziehung
		
		// Object[] arrObj = a1;	// Compilerfehler: keine IS-A-Beziehung
		
		float[] a3 = { 1F, 0.5F, 7.7F };
		
		print(a3);
		
		double[] a4 = { 3.3, 4.4, 5.5 };
		
		print(a4);
		
		
		/*
		 * Arrays von Referenzen haben Vererbungshierarchie! 
		 */
		Object var1 = new Person();
		Object var2 = new Dozent();
		Object var3 = new Teilnehmer();
		
		Object[] arrObj = { new Person(), new Dozent(), new Teilnehmer() };
		
		Person p1 = new Person(); 
		Person p2 = new Dozent(); 						// Person <= IS-A <= Dozent
		Person p3 = new Teilnehmer(); 
		
		Person[] arrPerson1 = new Person[2]; 
		Person[] arrPerson2 = new Dozent[2]; 			// Person[] <= IS-A <= Dozent[]
		Person[] arrPerson3 = new Teilnehmer[2]; 
		
		arrObj = arrPerson1;							// Object[] <= IS-A <= Person[]
		
		print(arrObj);
		print(arrPerson1);
		print(new String[] { "mo", "di", "mi" });
		
	} // end of main
	
	
	/*
	 * Aufgabe A2.
	 * 
	 * definieren Sie eine weitere print-Methode, die Elemente jedes beliebigen Referenzen-Arrays
	 * untereinander ausgibt.
	 */
	static void print(Object[] arr) {
		System.out.println("*** print(Object[])");
		
		for (Object object : arr) {
			System.out.println(object);
		}
	}
	
	/*
	 * Aufgabe A1.
	 * 
	 * Definieren Sie bitte eine (!) Methode print, die als Argument
	 * sowohl float[] als auch double[] akzeptiert. Die print soll alle Elemente des Arrays
	 * untereinander ausgeben.
	 * 
	 *  Die print muss keine anderen Arrays mit primitiven unterstützen.
	 *  
	 */
	static void print(Object obj) {
		if( obj instanceof float[] ) {
			System.out.println("*** float[]:");
			float[] arr = (float[]) obj;
			for (float f : arr) {
				System.out.println(f);
			}
		} else if( obj instanceof double[] ) {
			System.out.println("*** double[]:");
			double[] arr = (double[]) obj;
			for (double d : arr) {
				System.out.println(d);
			}
		} else {
			System.out.println("*** Weder float[] noch double[]: ");
			System.out.println(obj);
		}
		
	}

}
