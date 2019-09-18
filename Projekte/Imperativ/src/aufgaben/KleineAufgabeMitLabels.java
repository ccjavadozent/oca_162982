package aufgaben;

public class KleineAufgabeMitLabels {

	public static void main(String[] args) {
		
		int x = 3;
		
		peter:
		x = 5; // <- Block (ohne geschw. Klammer) namens peter
		
		// folgender Block hat keinen Namen:
		{
//			break peter; // Compilerfehler
		}

		
		
		
		/*
		 * noch eine Frage 
		 */
		System.out.println("*** A1");
		for (int i = 0; i < 3; i++) {
			
			do {
				continue;
				
			} while(false);
			
			System.out.println(i);
		}

		/*
		 * noch eine Frage 
		 */
		System.out.println("*** A2");
//		for (int i = 0; i < 3; i++) {
//			
//			do {
//				break;
//				
//			} while(true);
//			
//			System.out.println(i);
//		}
		
		
		peter:
		for (int i = 0; i < 3; i++) {
			
			paul:
			for (int j = 0; j < 2; j++) {
				break peter;
			}
			
			System.out.println(i);
		}
		
		
	}

}
