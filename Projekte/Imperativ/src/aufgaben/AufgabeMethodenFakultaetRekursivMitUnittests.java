package aufgaben;

public class AufgabeMethodenFakultaetRekursivMitUnittests {

	public static void main(String[] args) {
		
		testGetFakultaetRekursiv(0, 1);
		testGetFakultaetRekursiv(1, 1);
		testGetFakultaetRekursiv(3, 6);
		testGetFakultaetRekursiv(5, 120);
		testGetFakultaetRekursiv(10, 3_628_800);
		
		testGetFakultaetRekursivShouldFailOnNegativeArgument();
		
	} 

	static void testGetFakultaetRekursiv(int n, int expected) {
		int actual = getFakultaetRekursiv(n); 

		if(actual == expected) {
			System.out.println("Test bestanden für n = " + n);
		} else {
			System.out.println("Fehler! Test NICHT bestanden für n = " + n + ". Erwartet: " + expected + ", Aktuell: " + actual);
		}
	}

	static void testGetFakultaetRekursivShouldFailOnNegativeArgument() {
		
		try {
			getFakultaetRekursiv(-1);
			
			System.out.println("Fehler! Test NICHT bestanden für n = -1, Erwartet: IllegalArgumentException");
			
		} catch (IllegalArgumentException e) {
			System.out.println("Test bestanden für negatives n");
		}
		
	}
	
	static int getFakultaetRekursiv(int n) {
		if(n<0) {
			throw new IllegalArgumentException("n darf nicht negativ sein: " + n);
		}
		
		if(n<=1) {
			return 1;
		}
		
		return n * getFakultaetRekursiv(n-1);
	}
	
	
}
