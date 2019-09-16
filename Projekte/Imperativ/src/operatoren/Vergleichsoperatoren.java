package operatoren;

public class Vergleichsoperatoren {

	public static void main(String[] args) {

		/*
		 * Istgleich- Istungleich-Operatoren
		 * 
		 * 		==		!=
		 * 
		 * 
		 *  - Damit werden beliebige numerische Operanden (auch char) vergliechen
		 *  - Oder boolean-Operanden
		 *  - Referenzenvergleiche werden in weiteren Beispielen extra untersucht
		 * 
		 */
		
		byte b1 = 3;
		int x = 3;
		
		System.out.println( "b1 == x: " + (b1 == x) ); // true

		double d1 = 3.0;
		System.out.println( "x == d1: " + (x == d1) ); // true
		
		double d2 = .3;
		System.out.println( "d2 == 0.3: " + (d2 == 0.3) ); // true
		System.out.println( "d2 == 0.1 + 0.1 + 0.1: " + (d2 == 0.1 + 0.1 + 0.1) ); // false  (nicht in der Prüfung)
		
		char ch1 = 'a'; 
		char ch2 = 97;
		System.out.println("ch1 == ch2: " + (ch1 == ch2));  // true
		System.out.println("ch1 == 97: " + (ch1 == 97));  // true
		
		
		boolean istMontag = true;
		// System.out.println( istMontag == 1 );  // Compilerfehler: boolean nur mit boolean vergleichen! 
		
		boolean istWochenende = false;
		
		System.out.println( "istMontag == istWochenende: " + (istMontag == istWochenende) );
		
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		
		/*
		 * 		<		- kleiner als
		 * 		>		- grösser als
		 * 		<=		- kleiner oder gleich als
		 * 		>=		- grösser oder gleich als
		 * 
		 *  - Damit werden beliebige numerische Operanden (auch char) vergliechen
		 */
		
		System.out.println( "22.3 >= 33.4-10: " + (22.3 >= 33.4-10) ); // false
		
		
	}

}
