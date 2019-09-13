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
		
		System.out.println(var4); // 8
		
		
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
		
		
//		long var13 = 9223372036854775807; // Compilerfehler: long Max-Value mit einem int-Literal
		long var13 = 9223372036854775807L; 
		
		
		
	}

}
