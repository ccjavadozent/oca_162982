package vererbung;

import java.util.Random;

/*
 * - Polymorphismus (late binding) gibt es NUR für Instanzmethoden
 */

public class B10_Polymorphismus_Exam {
	
	static class Foo {
		static String note = "FA";
		
		static String getNote() { return note; }
//		 static String getNote() { return Foo.note; }
		
		static String getNoteNochmal() { return note; }
//		static String getNoteNochmal() { return Foo.note; }
		
		int att = 12;
		
		public int getAtt() {
			return this.att;
		}
		
	} // end of class Foo
	
	
	static class Bar extends Foo {
		
		static String note = "LA";
		
		static String getNote() { return note; } 
//		static String getNote() { return Bar.note; } 
		
		int att = 7; // Nicht zu empfehlen (ein zweites Attribut mit demselben Namen) 
		
		public int getAtt() {
			return this.att;
		}
		
	} // end of class Bar 

	public static void main(String[] args) {

		System.out.println( "1. " + Foo.note ); // FA, early binding
		System.out.println( "2. " + Bar.note ); // LA, early binding
		
		System.out.println( "3. " + Foo.getNote() ); // FA, early binding
		System.out.println( "4. " + Bar.getNote() ); // LA, early binding
		
		System.out.println( "5. " + Bar.getNoteNochmal() ); // FA, early binding
		
		Foo var1 = null;
		// System.out.println( var1.toString() ); // Kompiliert, aber NullPointerException
		
		/*
		 * Achtung! Das Aufrufen eeiner statischen Methode mit einer Referenz
		 * ist in Java kompilierbar. Es gibt eine Compilerwahrnung. Dann ersetzt der Compiler
		 * den Namen der Referenz durch ihren Typ. 
		 */
		System.out.println( "6. " + var1.getNote() ); // FA, early binding ( keine NullPointerException )

		Foo foo = new Foo();
		
		System.out.println( "7. " + foo.att ); // 12, early binding
		
		Bar bar = new Bar();
		
		System.out.println( "8. " + bar.att ); // 7, early binding
		
		foo = new Bar();
		
		System.out.println( "9. " + foo.att ); // 12, early binding
		
		System.out.println( "10. " + ((Bar)foo).att ); // 7, early binding
		
		System.out.println( "11. " + foo.getAtt() ); // 7, LATE BINDING!!!!!!!!
		
		System.out.println( "12. " + ((Bar)foo).getAtt() ); // 7, Late binding
		
		System.out.println( "13. " + ((Foo)foo).getAtt() ); // 7, Late binding
		
		
		foo = null;
		
		if(new Random().nextBoolean()) {
			foo = new Foo();
		} else {
			foo = new Bar();
		}
		
		System.out.println("14. " + foo.getAtt()); // ??, late binding
		
	}

}







