package datetime;

import java.time.*;
import java.time.LocalTime;

public class B03_Datum_Zeit_Objekte_bilden {

	public static void main(String[] args) {

		/*
		 * Für ALLE Klassen aus java.time.*:
		 * 
		 *  - Haben keine sichtbaren Konstruktoren
		 * 	- Objekte werden mit statischen Fabrikmethoden erzeugt!!!
		 */
		
//		LocalDate var = new LocalDate(); // Compilerfehler!
		
		LocalDate date = LocalDate.now();
		System.out.println("date: " + date);	// 2019-11-11
	
		
//		new LocalTime(); // Compilerfehler!
		
		LocalTime time = LocalTime.of(12, 3); 
		System.out.println("time: " + time);	// 12:03
		
		
//		new LocalDateTime(); // Compilerfehler!
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); // 2019-11-11T10:15:50.505607100
		
	}

}
