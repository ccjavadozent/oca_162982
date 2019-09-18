package kontrollstrukturen;

public class Schleifen06_continue {

	public static void main(String[] args) {

		System.out.println("*** continue in einer do-while: ");
		
		int x = 0;
		
		do {
			x++;
			
			if(x == 3) {
				continue; // Direkt mit dem nächsten Schleifendurchlauf starten.
							// bei der do-while wird aber doch nach continue das Ausführungskriterium überprüft!
			}
			
			System.out.println("x = " + x);
			
		} while(x < 5);
		
		
		System.out.println("*** continue in einer for-Schleife: ");
		
		for(int i=0; i<5; i++) {
			
			if(i==1) {
				continue; // Direkt mit dem nächsten Schleifendurchlauf starten.
			}
			
			System.out.println("i = " + i);
		}
		
		
	}

}
