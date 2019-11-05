package exceptions;

public class B01_KorrekteMethodeDefinieren {
	
	/*
	 * Biite realisieren Sie eine KORREKTE statische Methode add (soll Summe der Parameter berechnen und zurück liefern):
	 * 
	 * int add(int, int)
	 * 
	 */

	static boolean isAddOk = true; // keine gute Lösung

	static int add(int a, int b) {
		isAddOk = true;
		
		long result = (long)a + b;
		
		if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			System.out.println("Fehler! Integer Overflow: " + result); 
			// System.exit(0); // keine gute Lösung
			isAddOk = false;
		}
		
		return (int)result;
	}
	
	
	
	
	public static void main(String[] args) {
	
		final int MIN_ENTFERNUNG = 1000;
	
		int a = 1;
		int b = Integer.MAX_VALUE;
		
		
		int entfernung = add(a, b);
		
		if(!isAddOk) {
			System.out.println("Die Anwendung hat einen Fehler erkannt");
			
		} else {
		
			System.out.println("Entfernung: " + entfernung); 
			
			if(entfernung < MIN_ENTFERNUNG) {
				System.out.println("Feuer!");
			} else {
				System.out.println("Alles klar");
			}
		}
		

	}

}
