package vererbung;

import java.util.Random;

public class WdhVererbung {

	static class Fahrzeug {
		int baujahr;

		public Fahrzeug(int baujahr) {
			this.baujahr = baujahr;
		}
		
		public Fahrzeug() {
			this(2000);
		}
		
	} // end of Fahrzeug
	
	static class Rennwagen extends Fahrzeug {
		
	} // end of Rennwagen
	
	public static void main(String[] args) {

		Fahrzeug f = new Fahrzeug(1990);
		
		if(new Random().nextBoolean()) {
			f = new Rennwagen();
		}
		
		System.out.println( f.baujahr ); // entweder 1990 oder 2000
		
	}

}
