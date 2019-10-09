package vererbung;


public class B09_Mit_Polymorphie {
	
	static class Fahrzeug {
		public void fahren() {
			System.out.println("Ein Fahrzeug fährt...");
		}
	}
	
	static class PKW extends Fahrzeug {
		public void fahren() {
			System.out.println("Motor an");
			System.out.println("Gas geben");
			System.out.println("Fahren...");
		}
		
		@Override
		public String toString() {
			return "PKW-Objekt";
		}
	}
	
	static class Fahrrad extends Fahrzeug {
		public void fahren() {
			System.out.println("Auf die Pedalen treten");
			System.out.println("Fahren...");
		}
	}
	
	static class Skateboard extends Fahrzeug {
		@Override
		public void fahren() {
			System.out.println("Rollen...");
		}
	}
	
	public static void main(String[] args) {
		
		PKW pkw = new PKW();
		startenUndFahren(pkw);

		startenUndFahren(new Fahrrad());
		
		startenUndFahren(new Skateboard());
		
		System.out.println("*** toString-Test");
		System.out.println( pkw );
	}
	
	/*
	 * Universelle Komponente (mit Polymorphie), die jedes bel. Fahrzeug fahren lassen kann
	 */
	static void startenUndFahren(Fahrzeug fahrzeug) {
		System.out.println("*** fahre mit " + fahrzeug.getClass().getSimpleName());
		
		fahrzeug.fahren(); // <- polymorphischer Aufruf 
	}

}















































