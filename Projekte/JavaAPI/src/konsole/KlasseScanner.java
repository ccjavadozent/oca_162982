package konsole;

import java.util.Scanner; // !!!

public class KlasseScanner {

	public static void main(String[] args) {
		ausEinemStringLesen();
		ausEinemStringLesenMitEinerSchleife();
		vonDerKonsoleLesen();
		
		System.out.println("end of main");
	}
	
	public static void vonDerKonsoleLesen() {
		System.out.println("*** B3");
		
		Scanner sc = new Scanner( System.in );
	
		System.out.print("Bitte Ihren Namen eingeben: ");
//		String userName = sc.next();
		String userName = sc.nextLine();
		
		System.out.println("Hallo " + userName + "!");
		
		System.out.print("Wie heißt Ihre Katze: ");
		String catName = sc.nextLine();
		
		System.out.println("Katze: " + catName);
		
		System.out.print("Wie alt ist die Katze: ");
		int catAge = sc.nextInt();
		
		System.out.println("Alter gelesen: " + catAge);
		
		// sc.close();  //Achtung! Wenn System.in als Datenquelle verwendet wird, bitte den Scanner NICHT schliessen!
	}
		
	public static void ausEinemStringLesenMitEinerSchleife() {
		System.out.println("*** B2");
		
		Scanner sc = new Scanner("mo di mi do fr");
		
		while(sc.hasNext()) {
			String element = sc.next();
			System.out.println(element);
		}
		
		sc.close();
	}
	
	
	public static void ausEinemStringLesen() {
		System.out.println("*** B1");

		String stringSource = "a b hallo d";
		
		Scanner sc = new Scanner(stringSource);
		
		String element = sc.next(); // das nächste Element (Unterstring) aus der Quelle lesen
		
		System.out.println("element: " + element); // a
		
		element = sc.next();
		System.out.println("element: " + element); // b
		
		element = sc.next();
		System.out.println("element: " + element); // hallo
		
		element = sc.next();
		System.out.println("element: " + element); // d
		
		if(sc.hasNext()) {
			element = sc.next();
			System.out.println("element: " + element);
		} else {
			System.out.println("Keine weiteren Elemente");
		}
		
		sc.close();
	}

}
