package aufgaben.geometrie.vererbung;

public class AufgabeGeometrieVererbung {

	public static void main(String[] args) {

		System.out.println("*** Rechteck: ");
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(r1); 
		r1.bewegen(101, -22);
		System.out.println(r1);
	
		System.out.println("*** Kreis");
		Kreis k1 = new Kreis(7);
		System.out.println(k1);
		k1.bewegen(2003, 171918);
		System.out.println(k1);
	}

}
