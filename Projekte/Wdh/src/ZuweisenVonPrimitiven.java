
/*
 * Bei der Zuweisung werden von Compiler die Typen vergliechen. Compilerfehler, wenn der Typ rechts 'breiter' ist.
 * 
 * 		T1 <= T2 ?
 * 
 * 		int <= byte : OK
 * 		short <= double : Compilerfehler
 * 
 * Ausnahme:
 * 		für die int-Literale auf der rechten Seite
 * 			- bei der expliziten Initialisierung einer eigenen Variable (implizites Casting, wenn der Wert klein genug ist)
 * 			- bei dem Hochlagen der Rückgabe mit return (implizites Casting, wenn der Wert klein genug ist)
 * 			
 * Aber KEINE AUSNAHME beim Übergeben eines Argumentes!
 * 
 */
public class ZuweisenVonPrimitiven {
	
	static void set(byte b) {
		
	}
	
	static byte get() {
		return 12; // return (byte) 12;
	}

	public static void main(String[] args) {

		byte v1 = 12; // (byte) 12;
//		byte v2 = 1200;

		byte v3 = 3L;
		byte v4 = 3D;
		
		set(12);
		
		short v5 = 129; // (short) 129;
	}

}
