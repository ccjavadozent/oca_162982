package klassen;

public class B01_StatischeVariablen {
	
	/*
	 * var hier: statische Variable bzw. Klassenvariable bzw. statisches Attribut
	 * 
	 * - gültig überall (falls sichtbar)
	 * - wird automatisch mit dem passenden Nullwert initialisiert
	 * - landet beim Laden der Klasse im 'statischen' Speicher (normalerweise auf dem Heap)
	 */
	static int var;
	
	public static void main(String[] args) {
		
		/*
		 * var hier: lokale Variable 
		 * 
		 * - gültig nur in der main-Methode
		 * - muss vor dem 1. Lesen initialisiert werden
		 * - landet auf dem Stack
		 *  
		 */
		int var; 
		// System.out.println(var); // Compilerfehler: nicht initialisiert
		var = 22;
		System.out.println("main 1. var = " + var);
		
		testScope();

		/*
		 *  - die lokale var überdeckt die statische var
		 */
		System.out.println("main 2. lokale var = " + var); // 22
		System.out.println("main 3. statische var: " + B01_StatischeVariablen.var); // 0
		
	} // end of main

	
	static void testScope() {
		System.out.println("** in der testScope");
		
		System.out.println("1. static var: " + B01_StatischeVariablen.var); // Zugriff mit dem Klassennamen
		System.out.println("2. static var: " + var); // Vereinfachter Zugriff auf die statisc var innerhalb der Klasse, 
													 //die die Variable definiert.
		
		// auch 'import static' kann eingesetzt werden
		
	}
}
