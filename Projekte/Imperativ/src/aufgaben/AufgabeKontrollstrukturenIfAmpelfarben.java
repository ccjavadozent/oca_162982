package aufgaben;

public class AufgabeKontrollstrukturenIfAmpelfarben {

	public static final int ROT = 1;
	public static final int GELB = 2;
	public static final int GRUEN = 3;
	
	
	public static void main(String[] args) {

		ampelfarbenMitSwitch( ROT );

		int farbe = GELB;
		
		ampelfarbenMitSwitch(farbe);
		
		ampelfarbenMitIf(farbe);
		
	} // end of main

	
	
	/**
	 * Untersucht eine übergeben Ampelfarbe und gibt das Ergebnis auf der Konsole aus
	 * 
	 * 
	 * @param farbe muss 1 (ROT), 2(GELB) oder 3 (GRÜN) sein
	 */
	public static void ampelfarbenMitSwitch(int farbe) {
		System.out.println("*** Ampelfarben mit switch");
		
		switch( farbe ) {
			case ROT:
				System.out.println("Rot. Bitte warten");
				break;
			case GELB:
				System.out.println("Gelb. Gleich geht es los");
				break;
			case GRUEN:
				System.out.println("Grün. Weg frei");
				break;
			default:
				System.out.println("Fehler! Diese Farbe gibt es nicht: " + farbe);
		}
	}
	
	public static void ampelfarbenMitIf(int farbe) {
		System.out.println("*** Ampelfarben mit if");
		
		if(farbe == ROT) {
			System.out.println("Rot. Bitte warten");
		} else if(farbe == GELB) {
			System.out.println("Gelb. Gleich geht es los");
		} else if(farbe == GRUEN) {
			System.out.println("Grün. Weg frei");
		} else {
			System.out.println("Fehler! Diese Farbe gibt es nicht: " + farbe);
		}
		
	}
	
}
