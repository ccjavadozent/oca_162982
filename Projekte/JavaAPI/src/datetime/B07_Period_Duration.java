package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class B07_Period_Duration {

	public static void main(String[] args) {

		/*
		 * Period
		 */
		
		LocalDate startDateInclusive = LocalDate.now();
		LocalDate endDateExclusive = startDateInclusive.plusDays(2);
		
		Period p = Period.between(startDateInclusive, endDateExclusive);
		
		System.out.println( "p: " + p ); // P2D
		
		System.out.printf("days: %s, months: %s, years: %s %n",  p.getDays(), p.getMonths(), p.getYears() );
		
		
		/*
		 * Duration
		 */
		
		LocalTime startInclusive = LocalTime.now();
		LocalTime endExclusive = startInclusive.plusHours(2);
		
		Duration d = Duration.between(startInclusive, endExclusive);

		System.out.println("d: " + d);
		
		System.out.printf("seconds: %s %n", d.getSeconds());
		
	}

}
