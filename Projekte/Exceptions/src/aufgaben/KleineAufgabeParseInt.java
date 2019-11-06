package aufgaben;

public class KleineAufgabeParseInt {

	/*
	 * Gegeben ist 
	 * 
	 * 		int Integer.parseInt(String) // deklariert NumberFormatException (unchecked)
	 * 
	 * 
	 * Verwenden Sie bitte die parseInt um die neue Methode 'boolean isInteger(String)' zu realisieren.
	 * 
	 * So sollte sie funktionieren:
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println( isInteger("10") ); // true
		System.out.println( isInteger("hallo welt") ); // false
	}
}
