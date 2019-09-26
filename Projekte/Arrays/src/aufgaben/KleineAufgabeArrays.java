package aufgaben;

public class KleineAufgabeArrays {

	public static void main(String[] args) {
		
		a1();
		a2();

	} // end of main
	
	/*
	 * Erzeugen Sie bitte ein Array in dem die Konstanten Math.PI und Math.E gespeichert werden.
	 * Geben Sie dann das Array aus.
	 */
	static void a1() {
		
		System.out.println("*** A1");
		
		double[] arr = { Math.PI, Math.E };
		// System.out.println(arr);
		
		for (double d : arr) {
			System.out.println(d);
		}
		
	}
	
	/*
	 	Gegeben sind folgende zwei Arrays:

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 12, 13, 14 };
		
		Und folgender Methodenaufruf:
		
		int[] a3 = add(a1, a2);
		
		Diefinieren Sie bitte die Methode add, dass sie die ensprechenden Elemente 
		beider übergebenen Arrays addiert und in einem neuen Array zurück liefert.
		
		In dem Bsp. wird a3 folgende Werte erhalten: 13, 15, 17 (Summen ensprechender Positionen)
	 */
	static void a2() {
		System.out.println("*** A2");
		
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 12, 13, 14, 15, 16 };
		
		int[] a3 = add(a1, a2);
		
		System.out.print("a3: ");
		for (int x : a3) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	static int[] add(int[] a1, int[] a2) {
		int len = a1.length > a2.length ? a1.length : a2.length;
		
		int[] arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			System.out.println("i = " + i);
			
			int x = a1.length <= i ? 0 : a1[i];
			int y = a2.length <= i ? 0 : a2[i];
			
			arr[i] = x + y;
		}
		
		return arr;
	}

}
