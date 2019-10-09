package vererbung;

public class B07_Casting_nochmal {

	static class Tier {}
	static class Hund extends Tier {}
	static class Katze extends Tier {}
	
	public static void main(String[] args) {

		Tier tier = new Tier();
		
		Hund hund = new Hund();
		
		Katze katze = new Katze();
		
		
		Tier t2 = tier;
		Tier t3 = (Tier) tier; // sinnlos aber kompiliert

		Tier t4 = hund;
		Tier t5 = (Tier) hund; // Upcasting. Sinnlos aber kompiliert
		
		tier = new Katze();
		// Katze k3 = tier; // keine IS-A von rechts nach licnks
		
		if( tier instanceof Katze ) {
			// Katze k3 = tier; // keine IS-A von rechts nach licnks
			Katze k3 = (Katze) tier; // Downcasting
		}
		
		Katze k4 = (Katze) tier;
		

		/*
		 * Casting kompiliert NUR entlang einer Vererbunslinie
		 */

//		if(hund instanceof Katze) { // Compilerfehler (Hund und Katze sind Geschwisterklassen)           
//		}
		
//		katze = (Katze)hund; // Compilerfehler (Hund und Katze sind Geschwisterklassen)
		
//		hund = (Hund)katze; // Compilerfehler (Hund und Katze sind Geschwisterklassen)
		
		
		/*
		 * Bitte nie entwas ähnliches programmieren: 
		 */
		hund = (Hund) (Tier) katze; // Absolut sinnlos! 
		
	}

}
