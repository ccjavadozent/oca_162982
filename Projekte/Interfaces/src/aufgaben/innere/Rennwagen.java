package aufgaben.innere;

public class Rennwagen {
	
	public class Motor {
		private String type;
		
		public Motor(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Motor " + type + " aus dem Rennwagen " + hersteller;
//			return "Motor " + type + " aus dem Rennwagen " + Rennwagen.this.hersteller; // <- in Wirklichkeit
		}
	} // end of Motor
	
	public static class Fahrer {
		private String vorname, nachname;

		public Fahrer(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}
		
		@Override
		public String toString() {
			return vorname + " " + nachname;
		}
	} // end of Fahrer

	private String hersteller;
	private Fahrer fahrer;
	private Motor motor;
	
	public Rennwagen(String hersteller) {
		this.hersteller = hersteller;
		this.motor = new Motor("Type1");
//		this.motor = this.new Motor("Type1"); // <- in Wirklichkeit
	}
	
	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	@Override
	public String toString() {
		return "Rennwagen " + hersteller + ". Fahrer: " + fahrer;
	}
	
}
