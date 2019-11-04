package enums;

class AmpelFarbeAlsKlasse {
	public static final AmpelFarbeAlsKlasse ROT = new AmpelFarbeAlsKlasse();
	public static final AmpelFarbeAlsKlasse GELB = new AmpelFarbeAlsKlasse();
	public static final AmpelFarbeAlsKlasse GRUEN = new AmpelFarbeAlsKlasse();
}

public class B02_EigenerTypMitClass {
	

	public static void main(String[] args) {
		
		System.out.println("*** Vor einer Ampel: ");
		
		AmpelFarbeAlsKlasse farbe = getAmpelFarbe();  
	
//		switch(farbe) {
//			case ROT:
//				System.out.println("Rot! Stehen bleiben!");
//				break;
//			case GELB:
//				System.out.println("Gelb. Bereit halten");
//				break;
//			case GRUEN:
//				System.out.println("Grün! Los!");
//				break;
//			default:
//				System.out.println("Fehler! Unbekannte Farbe: " + farbe);
//		}
		
		if( farbe == AmpelFarbeAlsKlasse.ROT ) {
			System.out.println("Rot! Stehen bleiben!");
		} else if ( farbe == AmpelFarbeAlsKlasse.GELB ) {
			System.out.println("Gelb. Bereit halten");
		} else if( farbe == AmpelFarbeAlsKlasse.GRUEN ) {
			System.out.println("Grün! Los!");
		} else {
			System.out.println("Fehler! Unbekannte Farbe: " + farbe);
		}
		
		
	} // end of main
	
	/*
	 * Kleine Aufgabe:
	 * 
	 * Realisieren Sie die Klasse AmpelFarbeAlsKlasse so, dass es nur drei Konstanten ROT, GELB und GRUEN als Werte möglich sind.
	 */
	
}
