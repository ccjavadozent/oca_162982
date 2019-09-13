package variablen;

/*
 * Literale: Zeichenkombinationen, die einen konstanten Wert ergeben
 */
public class Literale {

	public static void main(String[] args) {
		
		/*
		 * int-Literale
		 */
		
		int var1 = 12; // dezimales int-Literal
		
		int var2 = -22;
		
		int var3 = +22; // dezimales int-Literal
		
		int var4 = 010; // oktales int-Literal								// 0*8hoch0 + 1*8hoch1 +0*8hoch2 (von rechts nach links umgerechnet)
						// fängt mit 0 an, gültige Zeichen: 0, 1 ... 7
		
		System.out.println("var4 = " + var4); // 8
		
		
		int var5 = 0x123DEF; // hexadezimales int-Literal
								// fängt mit 0x an, gültige Zeichen sind 0..9, a..f, A..F
		
		int var6 = 0xDeadCafe;
		
		int var7 = 0b101010;	// binäres int-Literal
		
		
		/*
		 * long-Literale
		 */
		
		long var8 = 12L; // dezimales long-Literal (L am Ende)
		long var9 = 12l; // dezimales long-Literal (kleines l am Ende)
		
		long var10 = 012L; // oktales
		long var11 = 0x12L; // hexadezimales
		long var12 = 0b101L; // binär
		
		
//		long var13 = 9223372036854775807; // Nicht in der Prüfung. Compilerfehler: long Max-Value mit einem int-Literal
		long var13 = 9223372036854775807L; 
		
		
		/*
		 * double Literale
		 */
		
		double d1 = 1.2; // double
		
		double d2 = 1.; // double-Literal = 1.0
		
		double d3 = .22; // double-Literal = 0.22
		
		System.out.println( .1 + .1 );
		System.out.println( .1 + .1 + .1 );
		
		double d4 = 3e2; // (wissenschaftliche Darstellung) = 3 * 10 hoch 2 als double 
		System.out.println("d4 = " + d4); // 300.0
		
		double d5 = -2E-3; // -2 * 10 hoch -3
		System.out.println("d5 = " + d5); // -0.002
		
		
		/*
		 * float Literale
		 */
		
//		float f1 = 1.3; // Compilerfehler: links float, rechts double-Literal
		
		float f2 = 1.3f; // float-Literal
		float f3 = 1.3F; // float-Literal
		
		float f4 = .1f + .1f + .1f;
		System.out.println("f4 = " + f4);
		
		
		/*
		 * Zeichen-Literale
		 */
		
		char ch1 = 'a'; // char-Literal  
		char ch2 = 97;  // int-Literal
		
		char ch3 = '\uAbCd'; // hexadezimales char-Literal
		
		/*
		 * boolean-Werte
		 */
		
		boolean b1 = true;
		boolean b2 = false;
		
		
		/*
		 * Nicht-primitive String-Literale:
		 */
		
		String s = "hallo java";
		
		
	} // end of main

}
