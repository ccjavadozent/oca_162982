package methoden;

/*
 * - Lokale Variablen sind Variable, die eine Methode für sich selbst definiert.
 * - Lokale Variablen landen auf dem Stack
 * - Lokale Variablen sind ab der Stelle der Definition (der Einführung) bis zum Ende des Blockes gültig
 * - Lokale Variablen einer Methode sind für die anderen Methoden nicht erreichbar 
 *    (außer den Anfangswert für einen Parameter als Argument beim Aufruf übergeben).
 * 
 * - Parameter sind auch lokale Variablen der Methode, die aber beim Aufruf der Methode initialisiert werden
 * 
 * !!! Vor dem Lesen muss eine lokale Varibale manuell initialisiert werden.
 * 
 * 
 */
public class B03_lokaleVariablen {

	public static void main(String[] args) {

		int x; // lokal, nicht initialisiert
		
		// System.out.println(x); // Compilerfehler: x ist nicht initialisiert
		System.out.println(args); // OK, Parameter von dem Aufrufer initialisiert (von der JVM)
		
		x = 22;
		
		System.out.println("0. x = " + x);
		
		
		{
			int y = 33;
			
			// int x; // Compilerfehler: x gibt es bereits
			
			System.out.println("1. x = " + x);
			System.out.println("1. y = " + y);
			
		} // ab hier keine y
		
		// System.out.println(y); // Compilerfehler: keine gültige y
		
		{
			int y = 77;
			
			System.out.println("2. x = " + x);
			System.out.println("2. y = " + y);
		}
		
		
		for(int y, z; x==1000 ;) { // y und z sind nur in der for-Schleife gültig
			
		} 
		
		
		//so kann man auch lokale Variablen definieren:
		int a = 1, b = 2, c = 3;
		// int var1, byte var2; // Compilerfehler
		byte var1 = 1, var2;
		byte var3, var4 = 4;
		
		// System.out.println(var3); // Compilerfehler (nicht initialisiert)
		System.out.println("var4 = " + var4); 
		
		 
		 
	} // x ist bis hier gültig

}










