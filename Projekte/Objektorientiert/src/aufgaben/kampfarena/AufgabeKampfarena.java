package aufgaben.kampfarena;

public class AufgabeKampfarena {

	public static void main(String[] args) {

		// Kämpfer vorbereiten (8 Kämpfer erzeugen und auf einer Sitzbank platzieren)
		Sitzbank bank = new Sitzbank();
		bank.add(new Kaempfer("Tom"));
		bank.add(new Kaempfer("Jerry"));
		bank.add(new Kaempfer("Tyson"));
		bank.add(new Kaempfer("Klitchko"));
		bank.add(new Kaempfer("Popeye"));
		bank.add(new Kaempfer("Achill"));
		bank.add(new Kaempfer("Peter"));
		bank.add(new Kaempfer("Paul"));
		
		// Kämpfe durchführen:
		
		// solange es mindestens zwei Kämpfer auf der Bank sitzen:
		while( bank.getSize() > 1 ) {
			System.out.println("-----------------");
			System.out.println("Neuer Kampf! Auf der Bank: " + bank);
			
			// Ein Kampf:
			
			// - Zwei zufällige Kämpfer von Sitzbank in die Arena holen
			Kaempfer k1 = bank.removeRandom();
			Kaempfer k2 = bank.removeRandom();
			System.out.println("Kämpfer 1: " + k1);
			System.out.println("Kämpfer 2: " + k2);
			
			Kaempfer kampfSieger = null;
			
			// Schlagaustausch wiederholen
			while(true) {
				if( k1.schlagen() ) { // k1 schlägt den k2
					kampfSieger = k1;
					// 	 wenn k2 KO ist Kampf beenden
					break;
				} else if( k2.schlagen() ) {	// k2 schlägt den k1
					kampfSieger = k2;
					// 	 wenn k1 KO ist Kampf beenden
					break;
				} else {
					System.out.println("Kein KO, der Kampf geht weiter");
				}
			}
			
			// nach dem Kampf:
			System.out.println("*** Der Kampf ist vorbei");
			
			// Sieger/Verlierer zeigen
			Kaempfer kampfVerlierer = kampfSieger == k1 ? k2 : k1;
			System.out.println("gewonnen: " + kampfSieger);
			System.out.println("verloren: " + kampfVerlierer);
			
			// Verlierer rauswerfen
			// Sieger zurück auf die Sitzbank
			bank.add(kampfSieger);
		}
		
		// Endsieger von der Bank holen und gratulieren
		Kaempfer endSieger = bank.removeRandom();
		
		System.out.println("************************");
		System.out.println("End-Sieger: " + endSieger);
		System.out.println("************************");
		
	}

}
