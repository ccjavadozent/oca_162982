package aufgaben;

enum Hunderasse {
	DACKEL (.5), 
	COLLIE, 
	DOGGE(1.5);

	private Hunderasse() {}
	
	Hunderasse(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}
	
	private double maxGroesse = 1;
	
	public double getMaxGroesse() {
		return maxGroesse;
	}
	
	
	@Override
	public String toString() {
		String name = name().charAt(0) + name().substring(1).toLowerCase();
		return name + ", max. Größe: " + maxGroesse;
	}
}


public class AufgabeEnumsHunderassen {

	public static void main(String[] args) {

		Hunderasse r1 = Hunderasse.DACKEL;
		
		System.out.println("r1: " + r1);
		
		System.out.println("*** Alle Hunderassen: ");
		for (Hunderasse rasse : Hunderasse.values()) {
			System.out.println(rasse);
		}
		
	}

}
