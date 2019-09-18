package kontrollstrukturen;

public class Schleifen05_break {

	public static void main(String[] args) {

		for(int i=0 ;  ; i++) {
			
			//wird bei (nicht empfohlenen) komplexen Schleifen (mit viel Code) auftreten können:
			if( i>3 ) {
				break; //Schleife beenden
			}
			
			System.out.println(i);
		}
		
		
		System.out.println("end of main");
	}

}
