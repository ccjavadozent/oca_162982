package aufgaben.kampfarena;

import java.util.Random;

public class Kaempfer {

	private String name;
	
	public Kaempfer(String name) {
		this.name = name;
	}
	
	public boolean schlagen() {
		Random random = new Random();
		return random.nextInt(100) < 10; // ca. 10 % Wahrscheinlichkeit, dass es true wird 
	}
	
	@Override
	public String toString() {
		return name;
	}
}
