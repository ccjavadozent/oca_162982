package strings;

public class KlasseString_API {

	public static void main(String[] args) {

//		konstruktoren();
		
		length_und_charAt();
		
		toUpperCase_und_toLowerCase();
		
		isEmpty();
		
		endsWith_und_startsWith();
		
		concat();
	} // end of main

	/*
	 * concat
	 */
	static void concat() {
		System.out.println("*** String concat(String)");
		
		String a = "Java";
		String b = " ist toll";
		
		System.out.println("mit +: " + a + b);
		System.out.println("mit concat: " + a.concat(b));
		
		// System.out.println(a); // Java 
	}
	
	
	/*
	 * endsWith, startsWith (2X)
	 */
	static void endsWith_und_startsWith() {
		System.out.println("*** boolean endsWith(String suffix)");
		
		//          0123456789012345...
		String s = "Heute ist Donnerstag";
		
		System.out.println("s = " + s);
		System.out.println( "endsWith(\"tag\"): " + s.endsWith("tag") ); // true
		System.out.println( "endsWith(\"Tag\"): " + s.endsWith("Tag") ); // false

		System.out.println("*** boolean startsWith(String prefix)");
		System.out.println( "startsWith(\"Heute\"): " + s.startsWith("Heute") ); // true
		
		System.out.println("*** boolean startsWith(String prefix, int offset)");
		System.out.println( "startsWith(\"ist\", 6): " + s.startsWith("ist", 6) ); // true
		System.out.println( "startsWith(\"ist\", 5): " + s.startsWith("ist", 5) ); // false
		
	}
	
	/*
	 * isEmpty
	 */
	static void isEmpty() {
		System.out.println("*** boolean isEmpty()");
		
		String s = "java";
		System.out.println( "\"java\".isEmpty(): " + s.isEmpty() ); // Ausgabe: "java".isEmpty(): false
		
		s = "";
		System.out.println( "\"\".isEmpty(): " + s.isEmpty() ); // Ausgabe: "".isEmpty(): true
		
		s = null;
		// s.isEmpty(); NullPointerException 
	}
	
	/*
	 * toUpperCase, toLowerCase
	 */
	static void toUpperCase_und_toLowerCase() {
		
		System.out.println("*** String toUpperCase()");
		
		String s = "jAvA_%";
		
		System.out.println("s = " + s); // jAvA_%
		
		System.out.println("toUpperCase: " + s.toUpperCase());
		System.out.println("toLowerCase: " + s.toLowerCase());

		System.out.println("s = " + s); // jAvA_%
	}

	/*
	 * length, charAt
	 */
	static void length_und_charAt() {
		System.out.println("*** int length()");
		
		String s1 = "Java";
		System.out.println( "s1.length(): " + s1.length() ); // 4 
		
		System.out.println( "*** char charAt(int)"  );
		System.out.println( "s1.charAt(2): " + s1.charAt(2) ); // v
	
		a1();
	}
	
	static void konstruktoren() { 
		System.out.println("*** Konstruktoren");
		String s1 = new String();
		String s2 = new String("JavaÜd");
	}
	
	
	/*
	 * A1
	 * 
	 *  Bitte geben Sie den String rückwärts aus
	 */
	static void a1() {
		System.out.println("*** A1");
		
		String s = "Heute ist Mittwoch";
		
		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print( s.charAt(i) );
		}
		
	}
}
