package enums;

import java.util.Random;

enum AmpelFarbe {
	ROT, GELB, GRUEN
}

public class B03_AufzaehlungMitEnum {

	public static void main(String[] args) {
		
		System.out.println("*** Vor einer Ampel (mit switch)");
		
		AmpelFarbe farbe = getAmpelFarbe();  
		
		switch(farbe) {
			case ROT:
				System.out.println("Rot! Stehen bleiben!");
				break;
			case GELB:
				System.out.println("Gelb. Bereit halten");
				break;
			case GRUEN:
				System.out.println("Grün! Los!");
				break;
			default:
				System.out.println("Fehler! Unbekannte Farbe: " + farbe);
		}
		
		
		System.out.println("*** Vor einer Ampel (mit else/else if/else)");
		
		if( farbe == AmpelFarbe.ROT ) {
			System.out.println("Rot! Stehen bleiben!");
		} else if ( farbe == AmpelFarbe.GELB ) {
			System.out.println("Gelb. Bereit halten");
		} else if( farbe == AmpelFarbe.GRUEN ) {
			System.out.println("Grün! Los!");
		} else {
			System.out.println("Fehler! Unbekannte Farbe: " + farbe);
		}
		
		
	} // end of main

	
	static AmpelFarbe getAmpelFarbe() {
//		return new AmpelFarbe();
		
		AmpelFarbe[] alleFarben = AmpelFarbe.values();
		int index = new Random().nextInt( alleFarben.length );
		return alleFarben[index];
	}
	
}
