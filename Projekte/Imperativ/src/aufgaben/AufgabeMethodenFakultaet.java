package aufgaben;

public class AufgabeMethodenFakultaet {

	public static void main(String[] args) {

		int erg = getFakultaet(3); // erg = 6
		
		System.out.println("n = 3, erg = " + erg);

		System.out.println("n = 0, erg = " + getFakultaet(0)); // 1
		System.out.println("n = 1, erg = " + getFakultaet(1)); // 1
		System.out.println("n = 5, erg = " + getFakultaet(5)); // 120
	}

	static int getFakultaet(int n) {
		int ergebnis = 1;
		
		for (int i = 1; i <= n; i++) {
			ergebnis *= i;
		}
		
		return ergebnis;
	}
	
}
