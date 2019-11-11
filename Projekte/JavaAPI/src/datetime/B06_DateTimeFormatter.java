package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class B06_DateTimeFormatter {

	public static void main(String[] args) {

//		DateTimeFormatter fmt = new DateTimeFormatter(); // Compilerfehler

		testPattern("y");
		testPattern("yy");
		testPattern("yyy");
		testPattern("yyyy");
		testPattern("yyyyy");
		
		
		testPattern("M");
		testPattern("MM");
		testPattern("MMM");
		testPattern("MMMM");
		testPattern("MMMMM");

		testPattern("d");
		testPattern("dd");

		testPattern("E");
		testPattern("EE");
		testPattern("EEE");
		testPattern("EEEE");
		testPattern("EEEEE");

		testPattern("d. MMMM");

		
		System.out.println("Heute ist der " + LocalDateTime.now().format( DateTimeFormatter.ofPattern("d. MMMM") ));
		
		testPattern("HH:mm:ss");

		
	} // end of main
	
	
	static void testPattern(String pattern) {
		LocalDateTime dateTime = LocalDateTime.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
		String text = dateTime.format(fmt);
		System.out.format("mit pattern %s: %s %n", pattern, text); // 2019
	}
	
}
