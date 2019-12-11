package api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateAndTime {

	public static void main(String[] args) {
//		b1();
//		b2();
		b3();
	}

	static void b3() {
		
		System.out.println("** B3");
		
		LocalDate d1 = LocalDate.of(2003, 5, 12);
		System.out.println( d1.getMonthValue() ); // 5 
		
		// d1 = LocalDate.of(2003, 5, 33); // Exception (KEIN Compilerfehler)
		
		DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE;
		TemporalAccessor ta1 = fmt.parse("2019-05-22");
//		TemporalAccessor ta2 = fmt.parse("2019/05/22"); // Exception
	}

	static void b2() {
		
		System.out.println("** B2");
		
		DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDateTime d1 = LocalDateTime.now();
		
		// Variante 1:
		String s1 = fmt.format(d1);
		
		// Variante 2:
		String s2 = d1.format(fmt);
		
		// Variante 3 evtl...
		
		/*
		 * Parsen
		 */
		
		TemporalAccessor d2 = fmt.parse(s1);
		System.out.println( fmt.parse(s1) );
		
		LocalDateTime d3 = LocalDateTime.parse(s2, fmt);
		System.out.println(d3);
	}
	
	static void b1() {
		
		System.out.println("** B1");
		
		DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDate d1 = LocalDate.now();
		LocalTime t1 = LocalTime.now();
		
		// fmt.format(d1); // Exception (keine Time-Angaben in LocalDate)
		// fmt.format(t1); // Exception (keine Date-Angaben in LocalTime)
		
		LocalDateTime d2 = LocalDateTime.now();
		
		String text = fmt.format(d2);
		System.out.println(text); // 2019-12-11T09:59:30.5373834
		
		
	}
	

}
