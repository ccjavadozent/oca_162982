package variablen;

/*
 * Primitive Typen werden auch elementare Typen genannt
 */
public class PrimitiveDatentypen {
	
	public static void main(String[]args) {

		/*
		 * 
		 * Numberische
		 * 
		 */
		
		/*
			ganzahlige
		 */
		byte b;		// 8 bit		[-128 .. 127]
		
		short s;	// 16 bit
		
		int x; 		// 32 bit 
		
		long var;	// 64 bit
		
		
		/*
		 	Gleitkomma-Typen
		 */
		float f;	// 32 bit
		
		double d;	// 64 bit
		
		
		/*
		 * 
		 	Zeichen-Typ
		 *
		 */
		char ch;	// 16 bit (nichtnegativ)
		
		
		/*
		 * 
		 	Wahrheits-Typ
		 *
		 */
		boolean bool; 	// ?
		
		
		System.out.println( "Max. int: " + Integer.MAX_VALUE );
		System.out.println( "Min. int: " + Integer.MIN_VALUE );
		System.out.println( "Max. long: " + Long.MAX_VALUE );
		System.out.println( "Max. float: " + Float.MAX_VALUE );
		System.out.println( "Max. double: " + Double.MAX_VALUE );
		
		
	} // end of main
	
	
}
