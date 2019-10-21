package format;

/*
 * Foramtierung ist nicht in der Prüfung
 */
public class B02_Formatter_Regeln {

	/*
	 * Format-String allgemein:
	 * 
	 * 		%[argument_index$][flags][width][.precision]conversion
	 */
	public static void main(String[] args) {
//		conversion();
//		argumentIndex();
//		precision();
//		width();
		flags();
	} // end of main

	
	/*
	 * 		%[flags]conversion
	 * 
	 */
	static void flags() {
		System.out.println("****************************");
		System.out.println("%[flags]conversion");
		System.out.println("****************************");
		
		System.out.println("------------------ 1");
		System.out.printf("| %6s | %n", "Tom");
		System.out.printf("| %6s | %n", "Jerry");
		
		System.out.println("------------------ 2. Linksbündig mit dem flag '-'");
		System.out.printf("| %-6s | %n", "Tom");
		System.out.printf("| %-6s | %n", "Jerry");

		System.out.println("------------------ 3");
		System.out.printf("|%10.2f|%n", 123.456);	// |    123,46|
		System.out.printf("|%-10.2f|%n", 123.456);  // |123,46    |
		System.out.printf("|%10d|%n", 99307);		// |     99307|
		System.out.printf("|%010d|%n", 99307);		// |0000099307|  0-Flag geht nur für Zahlen
		
	}
	
	static void width() {
		System.out.println("****************************");
		System.out.println("%[width]conversion");
		System.out.println("****************************");
	
		System.out.printf("<%s> %n", "Tom");		// <Tom> 
		System.out.printf("<%5s> %n", "Tom");		// <  Tom> 
		
		System.out.println("-----------------------");
		System.out.printf("| %s | %n", "Tom");
		System.out.printf("| %s | %n", "Jerry");
		System.out.println("-----------------------");
		System.out.printf("| %6s | %n", "Tom");
		System.out.printf("| %6s | %n", "Jerry");
		System.out.println("-----------------------");
		System.out.printf("| %10s | %n", "Tom");
		System.out.printf("| %10s | %n", "Mustermann");
		System.out.println("-----------------------");
		
		
	}
		
	/*
	 * 		%[.precision]f
	 * 
	 */
	static void precision() {
		System.out.println("****************************");
		System.out.println("%[.precision]f");
		System.out.println("****************************");
		
		System.out.printf("<%f> %n", 12.0);			// <12,000000>
		System.out.printf("<%f> %n", 12.123456789); // <12,123457> 
		
		System.out.printf("<%.2f> %n", 12.0);			// <12,00>
		System.out.printf("<%.2f> %n", 12.123456789); 	// <12,12> 
		System.out.printf("<%.2f> %n", 8.567); 			// <8,57> 
		System.out.printf("<%.2f> %n", 8.999); 			// <9,00> 
		
	}
	
	
	/*
	 * 		%[argument_index$]conversion
	 * 
	 */
	static void argumentIndex() {
		System.out.println("****************************");
		System.out.println("%[argument_index$]conversion");
		System.out.println("****************************");
		
		System.out.printf("1: %s %s %s %n", "mo", "di", "mi");	// mo di mi 
		System.out.printf("2: %2$s %s %n", "mo", "DI");			// DI mo 
		System.out.printf("3: %2$s %s %s %n", "mo", "DI");		// DI mo DI
		System.out.printf("4: %2$s %s %2$s %s %2$s %n", "mo", "DI");	// DI mo DI DI DI 
	}
	
	/*
	 * 		%conversion
	 */
	static void conversion() {

		System.out.format("Ausgabe 1 ");
		System.out.format("Ausgabe 2 \n");
		
		/*
		 * %n - line separator
		 */
		System.out.format("Ausgabe 3 %n Ausgabe 4 %n");
		
		
		/*
		 * %s - Argument als Text
		 */
		System.out.println();
		System.out.println("*** %s - Argument als Text");
		// System.out.printf("%s %n"); // Exception: kein Argument
		
		System.out.printf("%s %n", "Tom");
		System.out.printf("%s %n", 12);
		System.out.printf("%s %n", false);
		
		System.out.printf("%s %s %n", "Montag", "Dienstag");
		
		
		/*
		 * %d - Argument als eine ganze Zahl
		 */
		System.out.println();
		System.out.println("*** %d - Argument als ganze Zahl");
		
		// System.out.printf("%d", "bin keine Zahl"); //Exception: Argument ist keine ganze Zahl
		System.out.printf("<<<%d>>>%n", 22); 
		System.out.printf("<<<%d>>>%n", 12345678901L); 
		
		/*
		 * %f - Argument als eine Gleitkomma-Zahl
		 */
		System.out.println();
		System.out.println("*** %f - Argument als Gleitkomma-Zahl");
		
		// System.out.printf("<<<%f>>>%n", 22);   //Exception: Argument ist keine Gleitkomma-Zahl
		System.out.printf("<<<%f>>>%n", 22.);   
		System.out.printf("<<<%f>>>%n", 123.456);   
		System.out.printf("<<<%f>>>%n", 1F);   
		
		
	} // 

}
