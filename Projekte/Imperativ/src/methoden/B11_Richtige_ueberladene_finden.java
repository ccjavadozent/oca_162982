package methoden;

public class B11_Richtige_ueberladene_finden {
	
//	static void m() { System.out.println("no-args"); }
	
//	static void m(int x) { System.out.println("int"); }
	static void m(long x) { System.out.println("long"); }
	static void m(float x) { System.out.println("float"); }
	
	static void m(int... x) { System.out.println("varargs"); } // int[] x

	public static void main(String[] args) {

		int var = 1;
		
		m( var );
		
	} // end of main

	/*
	 * Compiler-Suche nach der richtigen aufgerufenen Methode:
	 * 
	 * 
	 * 1. Parametertyp exakt gleich dem Argument-Typ 
	 * 
	 * 2. Widening nach der Liste:
	 * 		byte -> short -> int -> long -> float -> double
	 * 
	 */
	
}
