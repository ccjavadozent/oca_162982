package methoden;

public class B06_returnMitWert {
	
	/*
	 * return mit einem Wert ist eine Art Zuweisung.
	 * 
	 * Vereinfacht: die Methode soll in ihrem Header angeben, 
	 * wieviel Bits für den zurückgelieferten Wert bereitgestellt werden kann
	 * 
	 *  
	 *  int cpu = sum
	 */
	static int add(int a, int b) {
		
		int sum = a + b;
		
//		return 1000L; // Compilerfehler: die Methode deklariert int als Rückgabe, also: int <= long
		return sum;
	}

	public static void main(String[] args) {
		
		add(2, 3);
		
		int x = add(7, 3);
		System.out.println("x = " + x);
		
		
		// byte y = add(7, 3); // Compilerfehler bei der Zuweisung: byte <= int
		
	}

}
