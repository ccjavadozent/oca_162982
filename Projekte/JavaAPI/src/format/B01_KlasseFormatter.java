package format;

import java.io.PrintStream;

/*
 * Formattierungen sind nicht in der Prüfung
 * 
 * Allgemein - Formatter:
 * 		https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
 * 
 * Alternativ für Zahlen-Foramtierung - DecimalFormat:
 * 		https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
 * 
 */

public class B01_KlasseFormatter {

	public static void main(String[] args) {

		/*
		 * format(String format, Object... args)
		 * 
		 */
		
		String fmt = "%s - %s - %s \n"; // Muster nach Formatter-Regeln
		Object[] varargs = { "java", 12, true };
		
		/*
		 * Methode 'format' aus der Klasse String
		 */
		String result = String.format(fmt, varargs); // Nach Formatter-Regeln formatieren
		System.out.println(result); // <- Ausgeben
		
		
		/*
		 * Methoden 'format' und 'printf' aus der Klasse PrintStream
		 */
		PrintStream var = System.out; // IS-A
		
		System.out.format(fmt, varargs); // Nach Formatter-Regeln formatieren und ausgeben
		System.out.printf(fmt, varargs); // Nach Formatter-Regeln formatieren und ausgeben
		
		
		
	} // end of main

}
