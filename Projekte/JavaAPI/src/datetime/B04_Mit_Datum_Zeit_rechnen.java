package datetime;

import java.time.LocalDate;

public class B04_Mit_Datum_Zeit_rechnen {

	public static void main(String[] args) {

		/*
		 * Für ALLE Klassen aus java.time:
		 * 
		 * - Objekte sind UNVERÄNDERLICH!!! (Immutable!!!)
		 * 
		 */
		
		LocalDate date = LocalDate.now();
		
		System.out.println("1. " + date); // 2019-11-11
		
		date.plusYears(2); // neues Objekt gebildet! Altes Objekt NICHT GEÄNDERT!!!!
		
		System.out.println("2. " + date); // 2019-11-11
		
		
		date = date.plusYears(2);
		
		System.out.println("3. " + date); // 2021-11-11
		
		
		
//		String s = "java";
//		s.concat(" ist toll");
//		System.out.println(s); // s
		
	} // end of main

}
