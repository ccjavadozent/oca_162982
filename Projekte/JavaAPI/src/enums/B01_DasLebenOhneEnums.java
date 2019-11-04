package enums;

import java.util.Random;

public class B01_DasLebenOhneEnums {

	public static final byte ROT = 0;
	public static final byte GELB = 1;
	public static final byte GRUEN = 2;
	
	public static void main(String[] args) {

//		boolean boolVar = true; // 2 mögliche Werte
//		
//		byte byteVar = 1; // 256 mögiche Werte
//		
//		short shortVar = 1; // ca. 65000 mögliche Werte
//		System.out.println( "short: " + Math.pow(2, 16) + ", " + (Short.MAX_VALUE - Short.MIN_VALUE+ 1) );
//		
//		int intVar = 1; // ca. 4 Mrd. mögliche Werte
//		System.out.println( "int: " + Math.pow(2, 32));
//		
//		String strVar = ""; // fast endlos viele mögliche Werte :) 
		
		System.out.println("*** Vor einer Ampel: ");
		
		byte farbe = getAmpelFarbe(); // Design-Schwäche: zu viele sinnlose Werte für die 'farbe' möglich. Sinnvoll sind nur 3 Werte) 
	
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
		
	} // end of main

	
	static byte getAmpelFarbe() {
		return (byte) new Random().nextInt(4); // Bug hier: kann 0, 1, 2 oder 3 liefern
	}
	
	
}
