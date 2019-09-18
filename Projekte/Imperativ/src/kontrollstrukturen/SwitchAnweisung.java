package kontrollstrukturen;

public class SwitchAnweisung {

	public static void main(String[] args) { 


		/*
		 * switch kann Variablen nur von folgenden Typen analysieren:
		 * 
		 *  - byte, short, int 
		 *  - Byte, Short, Integer
		 *  - char
		 *  - Character
		 *  - enum
		 *  - String
		 */
		
		int day = 1;
		
		switch( day ) {
		
		}
		
		
		/*
		 * Logik der switch:
		 * 
		 * 1. Den passenden Zweig finden. Zuerst unter case-Zweigen suchen, 
		 *   falls kein passender case-Zweig existiert nach dem default-Zweig suchen. 
		 * 
		 * 2. In den Zweig einsteigen und alle Zeige ab dem gefundenen bis zum break abarbeiten
		 * 		
		 * 
		 */
		
		System.out.println("** B1");
		
		day = 2;
		
		switch( day ) {
			case 1:
				System.out.println("Montag");
				break;
		
			case 2:
				System.out.println("Dienstag");
				System.out.println("Di");
				// break;
				
			case 3: 
				System.out.println("Mittwoch"); // wird auch ausgegeben (da kein break im case 2)
				break;
		
		}
		
		
		System.out.println("** B2");
		
		day = 2;
		
		switch( day ) {
			case 6:
			case 7:
				System.out.println("Wochenende");
				break;
			default:
				System.out.println("Arbeitstag");
		}

		
		System.out.println("** B3");
		
		day = 2;
		
		switch( day ) {
			default:
				System.out.println("Arbeitstag");
				// break;
			case 6:
			case 7:
				System.out.println("Wochenende"); // wird auch ausgegeben (da kein break im default-Zweig)
				break;
		}
		
		
		/*
		 * Konstanten dürfen sich nicht wiederholen!
		 */
		switch( day ) {
//			case 1: 
//			case 1:
		}

		
		/*
		 * Konstanten in switch bei case sind erlaubt, Variablen nicht!
		 */
		final int dayTwo = 2; // Konstante
		// dayTwo = 3; // Compilerfehler
		
		switch( day ) {
			case 1: 
			case dayTwo: // dayTwo ist eine Konstante
		}
		
	}

}
