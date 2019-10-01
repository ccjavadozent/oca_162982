package aufgaben;

public class KleineAufgabeVarargs {

	/*
	 * Definieren Sie bitte eine Methode 'printArgs', die mindestens einen String-Argument braucht,
	 * aber die maximale Anzahl der Argumente (Strings) nicht beschränkt.
	 * Sie gibt alle Argumente kommagetrennt aus.
	 */
	public static void main(String[] args) {

		// printArgs(); // sollte nicht kompilieren 
		printArgs("mo");
		printArgs("mo", "di");
		printArgs("mo", "di", "mi");
		printArgs("mo", "di", "mi", "do");

	}
	
	static void printArgs(String first, String... other) {
//		System.out.println("other.length: " + other.length);
		
		System.out.print(first);
		
		for(String s : other) {
			System.out.print(", ");
			System.out.print(s);
		}
		System.out.println();
		
	}

}
