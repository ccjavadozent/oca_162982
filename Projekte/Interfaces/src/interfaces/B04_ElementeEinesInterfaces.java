package interfaces;

/*
 * ALLE Elemente in einem Interface sind PUBLIC !!!!!! (Java 8)
 */

interface MyInterface {

	// void m0() {} 
	
	/*
	 * Deklarationen astrakter Instanzmethoden 
	 */
	void m1(); 				// implizit auch : public abstract
	abstract void m2(); 	// implizit auch noch: public
	public abstract void m3();
	
	/*
	 * default-Definitionen der Instanzmethoden (auch immer public) 
	 */
	default void m4() {  // implizit public
		System.out.println("m4. Definiert in einem Interface");
	}

	/*
	 * keine Objekt-Attribute (Instanz-Attribute, Felder...
	 */
	
	
	/*
	 * Statische Konstanten (auch immer public) 
	 */
	// int ATT0; 					// implizit auch noch: public static final, muss explizit initialisiert werden
	int ATT1 = 1; 					// implizit auch noch: public static final
	static int ATT2 = 2; 			// implizit auch noch: public final
	final int ATT3 = 3; 			// implizit auch noch: public static
	public int ATT4 = 4; 			// implizit auch noch: static final
	
	
	/*
	 * Statische Methoden (auch public)
	 */
	static void m5() { // implizit public
		System.out.println("m5. Statische Methode aus einem Interface");
	}
	
	/*
	 * Innere Typen (nicht in der OCA-Prüfung)
	 */
	class InnerClass {} // static public
	
} // end of MyInterface





interface ExamInterface {
	void m();
}

//class ExamClass implements ExamInterface {
//	void m() {} 	// Compilerfehler! Sichtbarkeit verschärft
//}

public class B04_ElementeEinesInterfaces {

	public static void main(String[] args) {

	}

}
