package api;

import java.time.LocalDate;
import java.time.Period;

public class Q57 {

	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		LocalDate end = start.plusDays(2);
		Period p = Period.between(start, end);
		System.out.print(p.getDays());

	}

}
