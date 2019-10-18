package strings;

public class B04_KlasseString_API {

	public static void main(String[] args) {

//		konstruktoren();
		
		System.out.println();
		length_und_charAt();
		
		System.out.println();
		toUpperCase_und_toLowerCase();
		
		System.out.println();
		isEmpty();
		
		System.out.println();
		endsWith_und_startsWith();
		
		System.out.println();
		concat();
		
		System.out.println();
		equals_und_equalsIgnoreCase();
		
		System.out.println();
		indexOf_und_lastIndexOf();
		
		System.out.println();
		substring();
		
		System.out.println();
		replace();
		
		System.out.println();
		static_valueOf();
	} // end of main
	
	/*
	 * valueOf (für alles mögliche überladen)
	 */
	static void static_valueOf() {
		System.out.println("*** String valueOf(XXX)");
		
		System.out.println( "String.valueOf(-12): " + String.valueOf(-12) ); // -12
		System.out.println( "String.valueOf(+12): " + String.valueOf(+12) ); // 12
		System.out.println( "String.valueOf(-2e-2): " + String.valueOf(-2e-2) ); // -0.02
		
		char[] arr = { 'J', 'a', 'v', 'a' };
		System.out.print("arr = ");
		System.out.println(arr); // Java (da es die spezielle println(char[]) gibt)
		
		System.out.println( "String.valueOf(char[]): "+ String.valueOf(arr) ); // Java
		
		Object obj = arr;
		System.out.println( "String.valueOf(Object): " + String.valueOf(obj) ); // [C@368239c8
	}

	/*
	 * replace (2x überladen)
	 */
	static void replace() {
		System.out.println("*** replace(char oldChar, char newChar)");
		
		String s = "Java ist Klasse";
		System.out.println("s = " + s);
		
		String newString = s.replace('a', 'A');
		System.out.println("a replaced with A: " + newString); // JAvA ist KlAsse
		
		System.out.println("*** replace(oldSubstr, newSubstr)");
		
		s = "Java (Sprache) und Java (Insel)";
		System.out.println("s = " + s);
		
		String oldSubstr = "Java";
		String newSubstr = "JAVA";
		newString = s.replace(oldSubstr, newSubstr);
		
		System.out.println("Java replaced with JAVA: " + newString);

	}
	
	/*
	 * substring (2x)
	 */
	static void substring() {
		System.out.println("*** String substring(int beginIndex)");
		
		//          0123456789012
		String s = "C++ ist toll!";
		System.out.println("s = " + s);
		
		String substring = s.substring(4);
		System.out.println("substring(4): " + substring); // "ist toll!"
		
		System.out.println("*** String substring(int beginIndex, int endIndex)");
		substring = s.substring(2, 9);
		System.out.println("substring(2, 9): " + substring); // "+ ist t"
		
//		System.out.println(s.substring(-20)); //Exception
//		System.out.println(s.substring(0, 1000)); //Exception
	}

	/*
	 * indexOf (überladen) und lastIndexOf (überladen)
	 */
	static void indexOf_und_lastIndexOf() {
		System.out.println("*** indexOf und lastIndexOf");
		
		//                     |         |         |
		//           0123456789012345678901234567890123
		String s1 = "Heute ist Donnerstag, es ist -22°C";
		
		System.out.println("     0123456789012345678901234567890123");
		System.out.println("s1 = " + s1);
		
		
		System.out.println("*** int indexOf(int)");
		
		int ch = 't';  // int (32 bit) <= char (16 bit)
		int index = s1.indexOf(ch);
		System.out.println("index of t: " + index); // 3
		
		System.out.println( "index of Y: " + s1.indexOf('Y')  ); // -1

		ch = -22; // sinnlos (es kann im String kein Zeichen mit dem Wert -22 geben), aber kompiliert. 
		System.out.println( "index of -22: " + s1.indexOf(-22)  ); // -1 
		
		
		System.out.println("*** int indexOf(String)");
		index = s1.indexOf("ist");
		System.out.println("index für den Unterstring 'ist': " + index); // 6
		

		System.out.println("*** int indexOf(int ch, int offset)");
		ch = 't';
		index = s1.indexOf(ch, 5);
		System.out.println("index of t (offset = 5): " + index); // 8
		
		System.out.println("*** int indexOf(String substr, int offset)");
		index = s1.indexOf("ist", 16);
		System.out.println("index of 'ist' (offset = 16): " + index); // 25
		
		System.out.println("*** int lastIndexOf 4x überladen");
		
		System.out.println("last index of t: " + s1.lastIndexOf(ch)); // 27
		System.out.println("last index of t (under 25): " + s1.lastIndexOf(ch, 25)); // 17 (unter index=25 suchen)
		
		System.out.println("last index of 'ist': " + s1.lastIndexOf("ist")); // 25
		System.out.println("last index of 'ist' (under 20): " + s1.lastIndexOf("ist", 20)); // 6
		
	}
	
	/*
	 * equals, equalsIgnoreCase
	 */
	static void equals_und_equalsIgnoreCase() {
		System.out.println("*** equals oder == ?");
		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		
		System.out.println("s1 == s2: " + (s1==s2)); // true (Referenzenvergleich)
		System.out.println("s1 == s3: " + (s1==s3)); // false (Referenzenvergleich)
		
		System.out.println( "s1.equals(s2): " + s1.equals(s2) ); // true
		System.out.println( "s1.equals(s3): " + s1.equals(s3) ); // true (Objektinhalte vergliechen) 
		
		System.out.println("*** boolean equalsIgnoreCase(String)");
		
		System.out.println( "ja_va! mit JA_VA! mit ignore case: " + "ja_va!".equalsIgnoreCase("JA_VA!") ); // true
		
		String sA = "Heute";
		String sB = "HEUTE";
		
		boolean gleich = sA.equals(sB);
		System.out.println( "Ist Heute gleich HEUTE? -> " + gleich ); // false
		
		gleich = sA.equalsIgnoreCase(sB);
		System.out.println( "Ist Heute gleich HEUTE (ignore case)? -> " + gleich ); // true
	}
	
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
