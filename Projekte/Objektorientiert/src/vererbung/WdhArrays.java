package vererbung;

import java.util.Arrays;

class Wochentag {
	String name;
	
	Wochentag(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class WdhArrays {

	public static void main(String[] args) {

		/*
		 * A1
		 * 
		 * createDaysArray bitte entwickeln
		 */
		String[] days = createDaysArray();
		System.out.println( Arrays.toString(days) ); // [mo, di, mi, do, fr, sa, so]
		
		/*
		 * A2
		 * 
		 * die Klasse Wochentag so ändern, dass bei der Ausgabe von t1 'mo' ausgegeben wird
		 */
		Wochentag t1 = new Wochentag( days[0] );
		System.out.println(t1); // mo						<- hier Ausgabe mo
		
		
		/*
		 * A3
		 * 
		 * Die Methode 'konvertieren' bitte entwickeln
		 */
		
		Wochentag[] wochentagArray = konvertieren(days);
		System.out.println( Arrays.toString(wochentagArray) ); // [mo, di, mi, do, fr, sa, so]
		
	} // end of main
	
	static Wochentag[] konvertieren(String[] arr) {
		Wochentag[] arrBack = new Wochentag[arr.length];
		
		for (int i = 0; i < arrBack.length; i++) {
			arrBack[i] = new Wochentag( arr[i] );
		}
		
		return arrBack;
	}
	
	static String[] createDaysArray() {
		return new String[] { "mo", "di", "mi", "do", "fr", "sa", "so" };
	}

}
