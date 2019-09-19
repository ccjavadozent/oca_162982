package aufgaben;

public class AufgabeKontrollstrukturenSwitch {

	public static void main(String[] args) {
		checkChar('b');
		
		checkAllChars();
	}
	
	/*
	 * 
	 */
	static void checkAllChars() {
		System.out.println("****** A2. Start");
		
		for(char ch = 'A'; ch<='z'; ch++) {
			checkChar(ch);
		}
		
		System.out.println("****** A2. Ende");
	}
	
	
	/*
	 * 
	 */
	public static void checkChar(char ch) {
		System.out.println("*** A1");
		
		// char ch = 'x';
		
		System.out.println("Überprüfe " + ch);

		if( !((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ) {
			System.out.println("Kein englischer Buchstabe!");
			
		} else {
			switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("Das ist ein Vokal");
					break;
				default:
					System.out.println("Das ist ein Konsonant");
			}
		}
		
		
		/*
		 * geht auch:
		 * 
		if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
			
			switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("Das ist ein Vokal");
					break;
				default:
					System.out.println("Das ist ein Konsonant");
			}
			
		} else {
			
			System.out.println("Kein englischer Buchstabe!");
		}
		*/
	}
	
	

}
