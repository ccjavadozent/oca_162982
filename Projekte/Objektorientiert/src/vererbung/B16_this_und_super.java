package vererbung;
/*
 * this und super gibte NUR in Insztanz-Methoden (und Konstruktoren)
 */
public class B16_this_und_super {
	
	static class Auto {
		String hersteller = "VW";
		
		int baujahr = 1970;
		
		@Override
		public String toString() {
			return "Baujahr " + baujahr;
		}
	} // end of Auto
	
	
	static class PKW extends Auto {
		int baujahr = 2019; // nicht empfohlen (es gibt bereits ein Attribut namens baujahr)
		
		@Override
		public String toString() {
//			return "PKW. " + toString(); // falsch! hier: this.toString() -> rekursiver Aufruf
			return "PKW. " + super.toString();
		}
		
		
		void test() {
			System.out.println( baujahr ); 				// 2019
			
			System.out.println( this.baujahr ); 		// 2019
			System.out.println( PKW.this.baujahr );		// 2019    (this und PKW.this ist dasselbe)
			
			System.out.println( super.baujahr ); 		// 1970
			System.out.println( PKW.super.baujahr ); 	// 1970		(super und PKW.super ist dasselbe)
			
			System.out.println( hersteller );		
			System.out.println( this.hersteller );
			System.out.println( super.hersteller );
			
		}
	} // end of PKW

	
	public static void main(String[] args) {
		new PKW().test();
	}

}
