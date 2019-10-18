package strings;

public class B07_StringBuilder_API {

	public static void main(String[] args) {

		/*
		 * Konstruktoren
		 */
		new StringBuilder();
		new StringBuilder("java"); // String-Parameter
		new StringBuilder(20); // int-Parameter (Anfangsgröße des internen Arrays)

		/*
		 * StringBuilder append(param) (für alles mögliche überladen)
		 */
		StringBuilder sb1 = new StringBuilder();
		sb1.append("java");
		sb1.append(" ist ");
		sb1.append("toll");
		System.out.println("1: " + sb1); // "java ist toll"
		
		/*
		 * StringBuilder delete(int start, int end)
		 */
		sb1.delete(0, 4);
		System.out.println("2:" + sb1); // " ist toll"
		
		/*
		 * StringBuilder deleteCharAt(int index)
		 * 
		 * setCharAt(index, char) (nicht in der Prüfung)
		 */
		sb1.deleteCharAt(3);
		System.out.println("3:" + sb1); // " is toll"
		
		/*
		 * StringBuilder insert(int offset, param) (für alles mögliche überladen)
		 */
		int offset = 3;
		sb1.insert(offset, 't');
		sb1.insert(0, "Java");
		System.out.println("4: " + sb1); // "Java ist toll"
		
		/*
		 * StringBuilder replace(int start, int end, String str)
		 */
		sb1.replace(0, 4, "C++");
		System.out.println("5: " + sb1); // "C++ ist toll"
		
		
		/*
		 *  StringBuilder reverse()
		 */
		sb1.reverse();
		System.out.println("6: " + sb1); // "llot tsi ++C"
		
		/*
		 * 
		 */
		sb1 = new StringBuilder("java");
		System.out.println("*** weitere Tests mit dem neuen StringBuilder");
		
		System.out.println("1: " + sb1); // java
		
		/*
		 * int indexOf(String)
		 * int indexOf(String, int offset)
		 */
		int index = sb1.indexOf("c++");
		System.out.println("2: " + index);  // -1
		
		index = sb1.indexOf("av", 2);
		System.out.println("3: " + index);  // Suche nach "av" in "java" ab der Position 2: -1 
		
		index = sb1.indexOf("av", 0);
		System.out.println("4: " + index);  // Suche nach "av" in "java" ab der Position 0: 1 
		
		/*
		 * int lastIndexOf(String)
		 * int lastIndexOf(String, int fromIndex)
		 */
		index = sb1.lastIndexOf("a");
		System.out.println("5: " + index); // 3 (suche nach dem letzten Substring "a" unter Position 3 (inklisive)
		
		index = sb1.lastIndexOf("a", 3);
		System.out.println("6: " + index); // 3
		
		index = sb1.lastIndexOf("a", 2); 
		System.out.println("7: " + index); // 1
		
		/*
		 * int length() 
		 */
		System.out.println( "sb1.length: " + sb1.length() );
		
		
		/*
		 * String substring(int start)
		 * String substring(int start, int end)
		 */
		String substr = sb1.substring(1);
		System.out.println("8: " + substr); // "ava"
		
		substr = sb1.substring(1, 3);
		System.out.println("9: " + substr); // "av"
		
		
		/*
		 * toString
		 */
		String str = sb1.toString();
		System.out.println("str: " + str);
		
		
	} // end of main

}
