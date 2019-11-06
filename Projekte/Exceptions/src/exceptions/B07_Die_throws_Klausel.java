package exceptions;

public class B07_Die_throws_Klausel {
	
	/**
	 * Bildet die Summe von a und b. Macht es immer korrekt.
	 * @param a
	 * @param b
	 * @return Liefert die Summe von a und b
	 * @throws IllegalArgumentException beim Integer-Overflow
	 */
	public static int add(int a, int b) throws IllegalArgumentException {
		
		long result = (long)a + b;
		
		if( result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Integer overflow");
		}
		
		return (int)result;
	}
	
	
	static void m1() { 
		throw new NullPointerException();
	}
	
	static void m2() throws NullPointerException {
		
	}
	
	static void m3() throws NullPointerException, ArithmeticException { // Geschwistertyp1, Geschwistertyp2 
		
	}
	
	static void m4() throws NullPointerException, Exception { // auch Basistyp, AbgeleiteterTyp  
		
	}
	
//	static void m5() throws String {} // Compilerfehler: String ist nicht Throwable

	public static void main(String[] args) {

		add(2, 3);
		
	}

}
