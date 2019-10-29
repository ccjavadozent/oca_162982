package functional;

/*
 * - functional Interface: Interface mit genau einer abstrakten Methode
 * 
 * - Nur funktionale Interfaces können mit Lambda-Funktionen realisiert werden
 * 
 * - Die Annotation @FunctionalInterface muss nicht sein.
 */


interface I1 {} // kein funktionales Interface 

interface I2 { // kein funktionales Interface
	void m1();
	void m2();
}

interface I3 { // funktionales Interface
	void m1();
}

interface I4 { // funktionales Interface
	void m1();
	default void m2() {}
}

interface I5 extends I4 {} // funktionales Interface

interface I6 extends I4 { // funktionales Interface
	void m1();
} 

@FunctionalInterface // <- Compiler soll überprüfen ob es wirklich ein funktionales Interface ist
interface I7 {
	void m1();
//	void m2();
}

public class B06_Functional_Interfaces {

	public static void main(String[] args) {
		
		I1 var0 = new I1() {} ; // anonyme Klasse, Lambda geht nicht

		I3 var1 = () -> {};
		
		I4 var2 = () -> {};
		
		I5 var3 = () -> {};
		
		I6 var4 = () -> {};
		
		Runnable var5 = () -> {};
		
		
	} // end of main

}
