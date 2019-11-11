package aufgaben;

import java.time.LocalDate;

public class KleineAufgabeMitDatumRechnen {

	public static void main(String[] args) {

		/*
		 * A1.
		 * 
		 * Überprüfen Sie bitte, ob 2000 ein Schaltjahr war
		 */
		
		System.out.println( LocalDate.of(2000, 1, 1).isLeapYear() );
	
		
		/*
		 * A2.
		 * 
		 * Generieren Sie bitte folgende Jahre:
		 * 
		 * 1890, 1892, 1894, 1896... 2020
		 * 
		 * geben Sie bitte die Jahre aus, die sich ohne Rest durch 4 dividieren lassen, aber keine Schaltjahre sind
		 * 
		 */
		for (int year = 1890; year <= 2020; year+=2) {
			LocalDate date = LocalDate.of(year, 1, 1);
			
			if(year%4==0 && !date.isLeapYear()) {
				System.out.println(year);
			}
		}
		
		
	}

}
