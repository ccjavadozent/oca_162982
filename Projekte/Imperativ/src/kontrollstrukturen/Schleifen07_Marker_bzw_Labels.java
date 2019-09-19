package kontrollstrukturen;

public class Schleifen07_Marker_bzw_Labels {

	public static void main(String[] args) {
		
		/*
		 * Marker sind Namen für Code-Blöcke.
		 * 
		 *  Den Marker kann man NUR in dem Block verwenden, der mit dem Marker benannt wurde.
		 */

		
		tom:
		{
			if(args==null) {
				break tom;
			}
			
			System.out.println("im Block namens 'tom'");
		}
		

		/*
		 * Evtl. In der Prüfung: Schleifen mit Marker
		 */
	
	
		tom:
		while(true) {
			System.out.println("In der Schleife namens 'tom'");
			
			break tom;
		}
		
		
		System.out.println("*** break jerry (geschachtelte Schleifen): ");
		
		jerry:
		for(int i=0; i<5; i++) {
			
			int k=0;
			
			while( k++ < 2 ) {
			
				if(i==1 && k==1) {
					// break;  // while Schleife beenden
					break jerry;  // Schleife namens 'jerry' beenden
				}
			}
			
			System.out.println("i = " + i);
		}
		
		
		System.out.println("*** continue (geschachtelte Schleifen): ");
		
		tom:
		for(int i=0; i<5; i++) {
			
			System.out.print("  k = ");
			
			jerry:
			for(int k=0; k<3; k++) {
				
				if(i==1) {
					// continue jerry; // ist hier dasselbe wie continue;
					
					continue tom; 	// Schleife jerry beenden, aktuellen Schleifendurchlauf von tom abbrechen
									// und mit dem nächsten Schleifendurchlauf von tom weitermachen
				}
				
				System.out.print(k + " ");
			}
			System.out.println();
			
			System.out.println("i = " + i);
		}
		
		
	} // end of main

}
