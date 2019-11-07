package aufgaben;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AufgabeExceptionsParseDate {

	public static void main(String[] args) {

//		System.out.println( DateFormat.getDateInstance().format(new Date()) );
		
		DateFormat df = DateFormat.getDateInstance();
		
		while(true) {
			String dateAsString = getUserInput();
			
			try {
				Date date = df.parse(dateAsString);
				
				System.out.println("Date: " + date);
				System.out.println("Millis seit dem 1.1.1970: " + date.getTime());
				break;
				
			} catch(ParseException e) {
				System.out.println("Fehler! Ugültige Eingabe: " + dateAsString);
			} 
		}
		
		
	} // end of main

	private static String getUserInput() {
		System.out.println("Bitte das Datum eingeben (TT.MM.JJJJ): ");
		return new Scanner(System.in).nextLine();
	}
	
}
