package format;

public class TestRunden {

	public static void main(String[] args) {

		double var1 = 12.3567;
		
		/*
		 * Bitte runden Sie (mathematisch richtig) die var1 auf zwei Nachkommastellen
		 *   
		 */
		
		System.out.println( Math.round(var1*100) / 100. ); // 12.36
		
		System.out.println( Math.PI );
		System.out.println( Math.round(Math.PI*10000)/10000. ); // 3.1416
		
		
		
	} // 

}
