package aufgaben.hafen;

public class AufgabeHafen {

	public static void main(String[] args) {
		
		Schiff s1 = new Schiff("Tom");
		System.out.println("s1: " + s1);
		
		Schiff s2 = new Schiff("Jerry");

		Hafen h = new Hafen();

		if( h.einlaufen(s1) ) {
			System.out.println("Klasse, " + s1 + " eingelaufen!");
		} else {
			System.out.println("Kein Platz für " + s1);
		}
		
		System.out.println(h); // Hafen (Schiffe: 1. Freie Plätze: 99)
	
		if( h.einlaufen(s2) ) {
			System.out.println(s2 + " ist auch im Hafen");
		} else {
			System.out.println("Kein Platz für " + s2);
		}
		
		System.out.println(h); // Hafen (Schiffe: 2. Freie Plätze: 98)
		
		
		System.out.println("+++ weitere 10 Schiffe");
		
		for (int i = 0; i < 10; i++) {
			h.einlaufen(new Schiff("s" + i));
		}
		
		System.out.println(h);
		
	}

}
