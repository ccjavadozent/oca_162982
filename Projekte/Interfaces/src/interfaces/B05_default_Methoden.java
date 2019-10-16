package interfaces;

interface Fahrbar {
	void motorAn();
	void motorAus();
	
	default void fahren() {
		motorAn();
		System.out.println("fahren...");
		motorAus();
	}
	
} // end of Fahrbar


class Oldmobile implements Fahrbar {
	@Override
	public void motorAn() {
		System.out.println("Oldtimer: motor an");
	}
	
	@Override
	public void motorAus() {
		System.out.println("Oldtimer: motor aus");
	}
} // end of Oldmobile


class Rennwagen implements Fahrbar {
	@Override
	public void motorAn() {
		System.out.println("Rennwagen: motor an");
	}
	
	@Override
	public void motorAus() {
		System.out.println("Rennwagen: motor aus");
	}
	
	@Override
	public void fahren() {
		System.out.println("Rennwagen / fahren");
	}
}

public class B05_default_Methoden {

	public static void main(String[] args) {
		
		Fahrbar fahrbar = new Oldmobile();
		fahrbar.fahren();
		
		fahrbar = new Rennwagen();
		fahrbar.fahren();
	}
}
