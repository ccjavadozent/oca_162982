package strings;

/*
 * immutable = unveränderlich
 */

public class B03_StringsSindUnveraenderlich {

	public static void main(String[] args) {

		String s1 = "java";
		
		System.out.println("1. s1 = " + s1);
		
		s1.toUpperCase(); // erzeugt neuen String
		
		System.out.println("2. s1 = " + s1); // java
		
		s1 = s1.toUpperCase();

		System.out.println("3. s1 = " + s1); // JAVA
		
		
	}

}
