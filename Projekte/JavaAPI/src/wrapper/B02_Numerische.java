package wrapper;

public class B02_Numerische {

	public static void main(String[] args) {

		/*
		 * - Byte, Short, Integer, Long, Float und Double erben von Number.
		 * 
		 * - Number ist eine abstrakte Klasse
		 */
		
		Integer i1 = Integer.valueOf(1200);
		
		Number n1 = i1;
		System.out.println("n1 = " + n1);
		
		n1 = Double.valueOf(22334455.3);
		System.out.println("n1 = " + n1);
		
		
		// n1 = new Number(); // Compilerfehler: Number ist abstract
		
		byte v1 = n1.byteValue();
		short v2 = n1.shortValue();
		int v3 = n1.intValue();
		long v4 = n1.longValue();
		float v5 = n1.floatValue();
		double v6 = n1.doubleValue();
		
		System.out.println("n1.byteValue(): " + v1); // falscher Wert (nicht in der Prüfung)
		
		
	} // end of main

}
