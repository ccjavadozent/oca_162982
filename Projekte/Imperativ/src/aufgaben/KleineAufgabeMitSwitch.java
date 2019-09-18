package aufgaben;

public class KleineAufgabeMitSwitch {

	public static void main(String[] args) {

		/*

			gegeben ist der Code:


				if( day < 6 && day > 0 ) {
					System.out.println("3. Arbeitstag");
				} else if( day==6 || day==7 ) {
					System.out.println("3. Wochenende");
				} else {
					System.out.println("3. Ungültige Tag-Angaben: " + day);
				}

		
			bekannt ist, dass day eine int-Variable ist.
			

			Ersetzen Sie den gegebenen Code mit einer switch-Anweisung

		 */
		
		System.out.println("*** mit for");
		
		for (int day = 1; day <= 8; day++) {
			
			System.out.println("day = " + day);
			
			if( day < 6 && day > 0 ) {
				System.out.println("3. Arbeitstag");
			} else if( day==6 || day==7 ) {
				System.out.println("3. Wochenende");
			} else {
				System.out.println("3. Ungültige Tag-Angaben: " + day);
			}
			
		}
		
		
		System.out.println("*** mit switch");
		
		for (int day = 1; day <= 8; day++) {
			System.out.println("day = " + day);
			
			switch(day) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("Arbeitstag");
					break;
				case 6:
				case 7:
					System.out.println("Wochenende");
					break;
				default:
					System.out.println("Ungültige Tag-Angaben: " + day);
			}
			
		}
		
		
	}

}
