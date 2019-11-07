package exceptions;

import java.util.Scanner;

class Foo {
	static {
		System.out.println(5/0); // ArithmetikException wird in ExceptionInInitializerError umgewandelt 
	}
}


public class B12_Exam_Fehlertypen {

	public static void main(String[] args) {
		
		/*
		 * Throwable - Kann geworfen/abgefangen/deklariert werden
		 */
		
		Throwable e1;
		
		/*
		 * Error (können nicht dynamisch korrigiert werden)
		 * 
		 *   StackOverflowError, ExceptionInInitializerError, NoClassDefFoundError
		 */
		try {
			testStackOverflowError();
			
		} catch (StackOverflowError e) {
			System.out.println("StackOverflowError abgefangen. Lässt sich nicht dynamisch korrigieren");
		}
			
		try {
			new Foo();
		} catch (ExceptionInInitializerError e) {
			System.out.println("ExceptionInInitializerError abgefangen");
		}
		
		// NoClassDefFoundError wäre denkbar, wenn eine Klasse gar nicht gefunden wird
		// https://dzone.com/articles/java-classnotfoundexception-vs-noclassdeffounderro


		// AssertionError: Fehler, der beim testen geworfen werden kann (nicht in der Prüfung)
		
		
		/*
		 * Exception, RuntimeException
		 * 
		 * - Oft von den Java-Operatoren geworfen (unwahrscheinlich von einem Entwickler in seiner Methode mti throw new)
		 * 	ClassCastException, NullPointerException, ArrayIndexoutOfBoundsException, ArithmeticException
		 * 
		 * - Oft vom Entwickler geworfen:
		 * 	IllegalArgumentException (darunter auch NumberFormatException), IllegalStateException
		 * 
		 */
		
		Scanner sc = new Scanner("a b c");
		System.out.println( sc.next() );
		sc.close();
		try {
			System.out.println( sc.next() ); // IllegalStateException: Scanner closed
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException abgefangen");
		}
		

	}
	
	static void testStackOverflowError() {
		testStackOverflowError();
	}
	

}
