package exceptions;

import java.text.DateFormat;
import java.text.ParseException;

public class B08_CheckedExceptions {
	
	static void m0() {
		throw new NullPointerException(); // unchecked
	}
	
	static void m1() throws NullPointerException {
		throw new NullPointerException(); // unchecked
	}
	
	static void m2() {
//		throw new java.text.ParseException("", 1); // Compilerfehler: checked
	}
	
	/*
	 * Möglichkteit 1 bei einer potentiellen checked-Exception: passender catch
	 */
	static void m3() {
		try {
			throw new java.text.ParseException("", 1); // checked
			
		} catch (ParseException e) { // checked Exception abgefangen
			e.printStackTrace();
		}
	}
	
	/*
	 * Möglichkteit 2 bei einer potentiellen checked-Exception: throws-Klausel
	 */
	static void m4() throws ParseException {		// checked Exception deklariert
		throw new java.text.ParseException("", 1); // checked
	}

	
	static void m5() throws ParseException {
		
	}

	public static void main(String[] args) {

		m0();
		m1();
		m2();
		m3();
		
//		m4(); // Compilerfehler: checked-Exception deklariert
		
//		m5(); // Compilerfehler: checked-Exception deklariert
	
		
		Integer.parseInt("hallo welt"); // deklariert NumberFormatException (unchecked)
		
//		DateFormat.getInstance().parse("hallo welt"); // Compilerfehler: deklariert ParseException (checked)
		
		
	} // end of main

}
