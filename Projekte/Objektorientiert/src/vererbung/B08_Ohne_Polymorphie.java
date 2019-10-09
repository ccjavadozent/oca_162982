package vererbung;

public class B08_Ohne_Polymorphie {

	static class PKW {
		public void fahren() {
			System.out.println("Motor an");
			System.out.println("Gas geben");
			System.out.println("Fahren...");
		}
	}
	
	static class Fahrrad {
		public void fahren() {
			System.out.println("Auf die Pedalen treten");
			System.out.println("Fahren...");
		}
	}
	
	public static void main(String[] args) {
		
		PKW pkw = new PKW();
		startenUndFahren(pkw);

		startenUndFahren(new Fahrrad());
	}

	/*
	 * Universelle Komponente (bad style, ohne Polymorphie), die jedes bel. Fahrzeug fahren lassen kann
	 */
	static void startenUndFahren(Object fahrzeug) {
		
		System.out.println("*** Versuche mit " + fahrzeug.getClass().getSimpleName() + " zu fahren");
		
		if( fahrzeug instanceof PKW ) {
			PKW pkw = (PKW) fahrzeug;
			pkw.fahren();
		}
		else if(fahrzeug instanceof Fahrrad) {
			Fahrrad fRad = (Fahrrad) fahrzeug;
			fRad.fahren();
		} 
		else {
			System.out.println("Der Typ wird nicht unterstützt: " + fahrzeug.getClass());
		}
		
		
	}
	
}
