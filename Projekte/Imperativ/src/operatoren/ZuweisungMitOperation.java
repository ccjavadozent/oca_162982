package operatoren;

public class ZuweisungMitOperation {

	public static void main(String[] args) {
		
		/*
		 * - Zuweisung mit Operation (komplette Liste im Insel-Buch):
		 * 
		 * 		+=		-= 		*=		/=		%=		
		 * 
		 */
		
		int a = 2;
		int b = 3;
		
		a += b;

		/*
		 * += ist (fast) dasselbe wie:
		 * 
		 * a = a + b;
		 * 
		 */
		
		System.out.println("1. a = " + a); // 5
		

		/*
		 * Exam 1:
		 */
		
		byte b1 = 2;
		byte b2 = 3;
		
//		b1 = b1 + b2; // Compilerfehler: byte <= int (Ergebnis einer arithmetischen Operation ist mindestens vom Typ int)
		
		b1 = (byte) (b1 + b2);
		
		System.out.println("2. b1 = " + b1); // 5
		
		/*
		 * Exam 2. Achtung! Kein Compilerfehler!
		 * 
		 * b1 += b2 kompiliert doch, da der Compiler dabei das implizite Casting einsetzt:
		 * 			b1 = (byte) (b1 + b2);	
		 */
		
		b1 += b2;
		
		System.out.println("3. b1 = " + b1); // 8
		
		b1 += 1000000; // b1 = (byte) (b1 + b2);
		
		
	}

}
