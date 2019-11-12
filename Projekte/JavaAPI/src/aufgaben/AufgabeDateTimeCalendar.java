package aufgaben;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AufgabeDateTimeCalendar {

	public static void main(String[] args) {

		printCalendar(4, 2010);
		
	}

	static void printCalendar(int month, int year) {
		
		LocalDate date = LocalDate.of(year, month, 1);
		
		System.out.println("-------------------------");
		DateTimeFormatter fmtTitle = DateTimeFormatter.ofPattern("MMMM y");
		System.out.println( fmtTitle.format(date) );
		
		System.out.println("-------------------------");
		
		DateTimeFormatter fmtDay = DateTimeFormatter.ofPattern("dd EEEE");
		
		int daysInMonth = date.lengthOfMonth();
		
		for (int i = 1; i <= daysInMonth; i++) {
			System.out.println( fmtDay.format(date) );
			date = date.plusDays(1);
		}
		
		System.out.println("-------------------------");
	}
	
}
