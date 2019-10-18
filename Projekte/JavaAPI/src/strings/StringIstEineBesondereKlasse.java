package strings;

public class StringIstEineBesondereKlasse {

	public static void main(String[] args) {

		/*
		 * String ist eine 'normale' Klasse:
		 * 
		 */
		String s = new String();
		s.toUpperCase();

		/*
		 * Aber auch eine besondere Klasse:
		 */

		/*
		 * 1. Konkatenations-Operator
		 */
		Object obj1 = "1";
		Object obj2 = "2";
		
		// System.out.println( obj1 + obj2 ); // Compilerfehler
		
		String s1 = "1";
		String s2 = "2";
		
		System.out.println( s1 + s2 ); // 12
		
		/*
		 * 2. String-Literale
		 */
		
		String s3 = "java";
		
		System.out.println("Anführungszeichen mit der Escape-Sequenz: \"");
		System.out.println("\"".length()); // 1
		System.out.println("\n".length()); // 1
		System.out.println("Backslash im String: \\"); 
		
		/*
		 * 3. String-Pool (s. Bsp. 'StringPool')
		 */
		
	}

}
