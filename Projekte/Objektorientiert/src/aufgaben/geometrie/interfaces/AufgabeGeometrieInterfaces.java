package aufgaben.geometrie.interfaces;

public class AufgabeGeometrieInterfaces {

	public static void main(String[] args) {

		Kreis k1 = new Kreis(3);
		System.out.println(k1);
	
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(r1);
		
		Figur[] figuren = new Figur[] {
			k1,
			r1
		};
		
		flaechenBerechnen(figuren);
		
	} // end of main

	static void flaechenBerechnen(Figur[] figuren) {
		for (Figur figur : figuren) {
			System.out.println( figur.getFlaeche() );
		}
	}
	
}
