package kontrollstrukturen;

public class Schleifen04_SchleifenSchachteln {

	public static void main(String[] args) {

		/*
		 * 
		 */
		for(int i=0; i<5; i++) {
			
			int k = 3;
			while( k < i ) {
				System.out.println(k++ + " ");
			}
			
		}
		
		System.out.println();
		
		/*

			----------- 1. for startet:
			
		 	i=0 (Init)
		 	
		 	if(i < 5)
		    {
			
				int k = 3;
				while( k < i ) {
					System.out.println(k++ + " ");
				}
			
			}
		    
			----------- 2. for geht weiter:
		    
		   i = 1 (Increment)
		    
		   if(i < 5 )
		   {
			
				int k = 3;
				while( k < i ) {
					System.out.println(k++ + " ");
				}
			
			}
			
			
			----------- 3. for geht weiter:
		    
		   i = 2 (Increment)
		    
		   if(i < 5 )
		   {
			
				int k = 3;
				while( k < i ) {
					System.out.println(k++ + " ");
				}
			
			}
			
			----------- 4. for geht weiter:
		    
		   i = 3 (Increment)
		    
		   if(i < 5 )
		   {
			
				int k = 3;
				while( k < i ) {
					System.out.println(k++ + " ");
				}
			
			}
			
			
			----------- 5. for geht weiter:
		    
		   i = 4 (Increment)
		    
		   if(i < 5 )
		   {
			
				int k = 3;
				while( k < i ) { // endlich einsteigen
				
					System.out.println(k++ + " "); // Ausgabe 3
				}
			
			}
			
			----------- 5. for geht weiter:
		    
		   i = 5 (Increment)
		    
		   if(i < 5 ) ? wenn nicht -> beenden
			
			
		 
		 */
		
	}

}
