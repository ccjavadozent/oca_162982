package aufgaben.autos;

public class Auto {
	static void printAuto(Auto auto) {
		System.out.println("Auto. Modell: " + auto.modell + ", Geschwindigkeit: " + auto.speed);
	}

	
	/*
	 * Objekt-Elemente
	 */
	
	String modell;
	int speed;
	
	void printAuto() { 
		System.out.println("Auto. Modell: " + this.modell + ", Geschwindigkeit: " + speed);
	}
	
}
