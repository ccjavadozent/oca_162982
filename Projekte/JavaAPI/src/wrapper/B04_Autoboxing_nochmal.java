package wrapper;

public class B04_Autoboxing_nochmal {

	public static void main(String[] args) {

//		System.out.println( 1200.toString() ); // Compilerfehler
//		System.out.println( 1200.getClass().getName() ); // Compilerfehler
		
		int var1 = 1200;
//		System.out.println( var1.toString() ); // Compilerfehler
		
		Integer var2 = new Integer(1200);
		System.out.println( var2.toString() );
		System.out.println( var2.getClass().getName() );
		System.out.println("var2.intValue(): " + var2.intValue());
	
		Integer var3 = Integer.valueOf(1300);
		System.out.println( var3.toString() );
		System.out.println( var3.getClass().getName() );
		System.out.println("var3.intValue(): " + var3.intValue());
		
		Integer var4 = 1400; // Autoboxing: Integer.valueOf(1400)
		System.out.println( var4.toString() );
		System.out.println( var4.getClass().getName() );
		System.out.println("var4.intValue(): " + var4.intValue());
		
		
		int var5 = var4.intValue();
		System.out.println("var5: " + var5);
		
		int var6 = var4; // Autounboxing: var4.intValue() 
		System.out.println("var6: " + var6);
		
		
		Integer var7 = null;
		// int var8 = var7; // NullPointerException, da Autounboxing: var7.intValue()
		
		System.out.println("------------------------------");
		
		double var8 = 22.45;
		Double var9 = var8; // Autoboxing: Double.valueOf(var8);
		
		Integer var10 = 3000; // Autoboxing: Integer.valueOf(3000);
		
		var10++; 
		
		/*
		 * Inkrementieren:
		 * 
		 * var10 = var10 + 1;
		 * 
		 * 1. Autounboxing: var10.intValue()
		 * 2. Zwei primitive addieren: 3000 + 1 -> 3001
		 * 3. Autoboxing von Ergebnis: Integer.valueOf(3001)
		 * 4. Referenzenzuweisung
		 * 
		 *
		 * var10 = Integer.valueOf( var10.intValue() + 1 )
		 * 
		 */
		
		System.out.println("var10: " + var10);
		
		
		System.out.println("--------------------------------");
		
		float f1 = 13F;
		
		Float f2 = 13.5F;
		
		System.out.println( "f1 < f2: " + (f1 < f2) );  // Autounboxing von f2
		
		int i1 = 13;
		
		System.out.println( "f1 < i1: " + (f1 < i1) ); // Vergleich von primitiven
		
		System.out.println( "f2 < i1: " + (f2 < i1) ); // Vergleich von primitiven (nach dem Autounboxing)
		
		
		/*
		 * Achtung!
		 * 
		 * Es gibt den Operator '<' nur für primitive, ABER
		 * - den Operator '==' gibtes sowohl für primitive alas auch für Referenzen!!!
		 * 
		 * - Unboxing wird bevorzugt, wenn entweder Unboxing oder Boxing nötig ist
		 * 
		 * - Java ist eine OO-Sprache: Beim '==' oder '!=' Vergleich zwei Referenzen bleibt es immer beim
		 *   Referenzenvergleich 
		 * 
		 */
		
		System.out.println( "f1 == f2: " + (f1 == f2) ); // Autounboxing und Vergleich der primitiven 
		
		System.out.println( "i1 == f2: " + (i1 == f2) ); // Autounboxing und Vergleich der primitiven
		
		Integer i2 = 13;
		// System.out.println(i2 == f2); // Compilerfheler: Referenzenvergleich zwei Geschwistertypen-Referenzen
		System.out.println( "i2 < f2: " + (i2 < f2) ); // Autounboxing und Vergleich der primitiven 
		
		Number n2 = 12F;
		System.out.println(n2 == f2); // Referenzenvergleich 
		
		
	} // end of main

}













