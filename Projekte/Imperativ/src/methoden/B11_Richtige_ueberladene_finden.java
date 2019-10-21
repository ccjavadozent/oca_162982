package methoden;

/*
 * Achtung! Bitte in der Praxis nicht so oft überladen
 */

class Tier {}
class Hund extends Tier {}


public class B11_Richtige_ueberladene_finden {
	
//	static void m() { System.out.println("no-args"); }
	
//	static void m(int x) { System.out.println("int"); }
	static void m(long x) { System.out.println("long"); }
//	static void m(float x) { System.out.println("float"); }
	
//	static void m(int... x) { System.out.println("int..."); } // int[] x
	static void m(float... x) { System.out.println("float..."); }
	
//	static void m(Hund x) { System.out.println("Hund"); } 
//	static void m(Katze x) { System.out.println("Katze"); } 
	static void m(Tier x) { System.out.println("Tier"); } 
//	static void m(Object x) { System.out.println("Object"); } 

	public static void main(String[] args) {

//		int var = 1;
		Hund var = null;
		
		m( var ); 
		
	} // end of main

	/*
	 * Compiler-Suche nach der richtigen aufgerufenen Methode bei primitiven Argumenten:
	 * 
	 * 
	 * 1. Parametertyp exakt gleich dem Argument-Typ 
	 * 
	 * 2. Widening nach der Liste:
	 * 		byte -> short -> int -> long -> float -> double
	 * 
	 * ...
	 * 
	 * 
	 * X. Alle Suchschritte für Varargs-Methoden durchführen (bis einem Treffer)
	 * 
	 */
	
	
	
	/*
	 * Compiler-Suche nach der richtigen aufgerufenen Methode bei Referenzen als Argumenten:
	 * 
	 * 1. Parametertyp exakt gleich dem Argument-Typ 
	 * 
	 * 2. Basistyp-Parameter
	 * 
	 * ...
	 *
	 * X. Alle Suchschritte für Varargs-Methoden durchführen (bis einem Treffer)
	 * 
	 */
}


