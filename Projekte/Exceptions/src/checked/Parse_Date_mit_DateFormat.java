package checked;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*
 * Date und DateFormat sind nicht in der Prüfung
 */

public class Parse_Date_mit_DateFormat {

	public static void main(String[] args) {
//		testKlasseDate();
//		testKlasseDateFormat();
		testDateFormat_Instanzen();
		
	} // end of main
	
	static void testDateFormat_Instanzen() {
		
		Date date = new Date();
		
		System.out.println("*** Klasse DateFormat / getInstance");
		DateFormat df = DateFormat.getInstance();
		System.out.println( df.format(date) ); // 06.11.19, 12:51
		
		System.out.println("*** Klasse DateFormat / getDateInstance");
		df = DateFormat.getDateInstance();
		System.out.println( df.format(date) ); // 06.11.2019
		
		System.out.println("*** Klasse DateFormat / getTimeInstance");
		df = DateFormat.getTimeInstance();
		System.out.println( df.format(date) ); // 12:53:21
		
		System.out.println("*** Klasse DateFormat / getDateTimeInstance()");
		df = DateFormat.getDateTimeInstance();
		System.out.println( df.format(date) ); // 06.11.2019, 12:53:57
		
		
		System.out.println("*** Klasse DateFormat / getDateTimeInstance(LONG, SHORT)");
		int dateStyle = DateFormat.LONG; // FULL, MEDIUM, SHORT
		int timeStyle = DateFormat.SHORT; // FULL, MEDIUM, SHORT
		df = DateFormat.getDateTimeInstance(dateStyle, timeStyle);
		System.out.println( df.format(date) ); // 6. November 2019, 12:56
		
		System.out.println("*** Klasse DateFormat / getDateTimeInstance(FULL, FULL)");
		dateStyle = DateFormat.FULL; // FULL, MEDIUM, SHORT
		timeStyle = DateFormat.FULL; // FULL, MEDIUM, SHORT
		df = DateFormat.getDateTimeInstance(dateStyle, timeStyle);
		System.out.println( df.format(date) ); // Mittwoch, 6. November 2019 um 12:57:22 Mitteleuropäische Normalzeit
		
	}
	
	static void testKlasseDateFormat() {
		System.out.println("*** Klasse DateFormat");
		
		DateFormat df = DateFormat.getInstance();
		
		/*
		 * Date zum String formatieren:
		 */
		Date date = new Date();
		String dateAlsText = df.format(date);
		
		System.out.println("date als String (formatiert): " + dateAlsText);  // 06.11.19, 12:41
		System.out.println("date mit toString: " + date); // Wed Nov 06 12:41:53 CET 2019
		
		
		/*
		 * String zum Date parsen:
		 */
		try {
			dateAlsText = "12.07.03, 07:15";
			Date d2 = df.parse(dateAlsText);
			System.out.println("d2: " + d2);
			
		} catch (ParseException e) {
			System.out.println("Fehler! Kann den Text nicht parsen: " + dateAlsText);
		}
	}
	
	public static void testKlasseDate() {
		
		System.out.println("*** Klasse Date");
		
		/*
		 * Klasse Date.
		 * 
		 * Date speichert als long die Anzahl der Millisekunden von 1.1.1970 bis zu einem anderen Zeitpunkt
		 */
		
		Date date = new Date(); // Millis bis jetzt
		
		long millis = date.getTime();
		System.out.println("Millis seit 1.1.1970 bis jetzt: " + millis);
		
		System.out.println( "date: " + date ); // Wed Nov 06 12:33:28 CET 2019
		
		// 
		Date damals = new Date(121314); // 121314 Millis seit 1.1.1970 
		System.out.println("damals: " + damals); // Thu Jan 01 01:02:01 CET 1970

		
	}

}
