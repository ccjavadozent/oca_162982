package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class B05_API_LocalDate {
	
	public static void main(String[] args) {
//		objekteBilden();
//		rechnen();
		zugriffAufFelder();
		
	} // end of main 

	static void zugriffAufFelder() {
		System.out.println("*** ");
		
		int year = 1981;
		Month month = Month.FEBRUARY;
		int dayOfMonth = 12;
		
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println("1. date: " + date); // 1981-02-12
		
		/*
		 * int get(ChronoField)
		 */
		TemporalField field = ChronoField.MONTH_OF_YEAR;
		int value = date.get(field); // date.get(ChronoField.MONTH_OF_YEAR)
		System.out.println("date.get(ChronoField.MONTH_OF_YEAR): " + value );
		
		/*
		 * getXxx
		 */
		System.out.println("int date.getDayOfMonth(): " + date.getDayOfMonth()); // 12
		System.out.println( "int date.getMonthValue(): " + date.getMonthValue() ); // 2
		System.out.println( "Month date.getMonth(): " + date.getMonth() ); // FEBRUARY
		System.out.println( "date.getYear(): " + date.getYear() ); // 1981
		
		
		/*
		 * weitere (nicht in der Prüfung) 
		 */
		System.out.println( "date.isLeapYear(): " + date.isLeapYear() );
		System.out.println( "date.lengthOfMonth(): " + date.lengthOfMonth() );

		
		System.out.println("2. date: " + date); // 1981-02-12
		
		/*
		 * withXxx
		 */
		date = date.withYear(2000);
		
		System.out.println("3. date: " + date); // 2000-02-12
		
		date = date.withYear(2019).withMonth(11).withDayOfMonth(11);
		
		System.out.println("4. date: " + date); // 2019-11-11
	}
	
	static void rechnen() {
		System.out.println("*** plus/minus und Co.");
		
		LocalDate date = LocalDate.now();
		System.out.println("1. date: " + date); // 2019-11-11
		
		date.minusDays(2).minusMonths(3).minusYears(4);
		
		System.out.println("2. date: " + date); // 2019-11-11
		
		/*
		 * LocalDate minusDays(long)
		 * LocalDate minusMonths(long)
		 * LocalDate minusYears(long)
		 */
		date = date.minusDays(2).minusMonths(3).minusYears(4);
		
		System.out.println("3. date: " + date); // 2015-08-09
		
		/*
		 * LocalDate minus(long amountToSubtract, ChronoUnit unit)
		 */
		long amountToSubtract = 2;
		TemporalUnit unit = ChronoUnit.YEARS;
		date = date.minus(amountToSubtract, unit); // date.minus(2, ChronoUnit.YEARS)
		
		System.out.println("4. date: " + date); // 2013-08-09
		
		
		/*
		 * plus-Methoden (ähnlich wie minus-Methoden)
		 */
		date = date.plusYears(6).plusMonths( 5 ).plusDays(2);
		System.out.println("5. date: " + date); // 2020-01-11
		
	}

	
	public static void objekteBilden() {
		
		System.out.println("*** Objekte bilden mit now, of und of");
		
//		LocalDate date1 = new LocalDate(); // Compilerfehler!
		
		/*
		 * now()
		 */
		LocalDate date1 = LocalDate.now();
		System.out.println("date1: " + date1); // 2019-11-11
		
		
		/*
		 * of(int year, int month, int dayOfMonth)
		 */
		
		int year = 2003;
		int month = 6;
		int dayOfMonth = 5;
		
		LocalDate date2 = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println("date2: " + date2); // 2003-06-05
		
		
		/*
		 * LocalDate.of(int year, Month monthEnum, int dayOfMonth)
		 */
		Month monthEnum = Month.JUNE;
		LocalDate date3 = LocalDate.of(year, monthEnum, dayOfMonth);
		
		System.out.println("date3: " + date3);

		
		

	} // end of main

}

