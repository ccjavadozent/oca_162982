package aufgaben;

class Zebra {
	private String name;
	
	Zebra(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
//		return "Zebra " + name;
//		return Zebra.class.getSimpleName() +  " " + name;
		return getClass().getSimpleName() +  " " + name;
	}
}

public class KleineAufgabeKlassenobjekt {

	public static void main(String[] args) {

		Zebra z1 = new Zebra("Rosie");
		
		System.out.println(z1); // Zebra Rosie
		
		
		// Class<?> c1 = z1;
		// z1.getName();
		
		Class<?> c1 = Zebra.class;
		System.out.println( c1.getName() ); // aufgaben.Zebra
	}

}
