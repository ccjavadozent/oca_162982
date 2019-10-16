package strings;

public class KlasseString_API {

	public static void main(String[] args) {

//		konstruktoren();
		
		length_und_charAt();
		
		toUpperCase_und_toUpperCase();
	} // end of main
	
	static void toUpperCase_und_toUpperCase() {
		
		System.out.println("*** String toUpperCase()");
		
		String s = "jAvA_%";
		
		System.out.println("s = " + s);
		
		System.out.println("toUpperCase: " + s.toUpperCase());
		System.out.println("toLowerCase: " + s.toLowerCase());
	}

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
		String s2 = new String("Java");
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
