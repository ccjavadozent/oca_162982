package kontrollstrukturen;

public class IfElseVerzweigung {

	public static void main(String[] args) {
		
		int day = 777;
		
		/*
		 *  if
		 *  else 
		 */
		if( day==2 ) {
			System.out.println("1. Donnerstag");
		} else {
			System.out.println("1. Ein Tag, der nicht Donnerstag ist");
		}

		/*
		 * 	if
		 * 	else if
		 *  else if
		 *  
		 *  Nur der erste Zweig mit 'true' wird aktiviert (falls es überhaupt einen Zweig mit 'true' gibt).
		 */
		if( day < 6 ) {
			System.out.println("2. Arbeitstag");
		} else if( day==6 ) {
			System.out.println("2. Samstag");
		} else if( day==7 ) {
			System.out.println("2. Sonntag");
		}
		
		
		
		/*
		 * if
		 * else if
		 * ...
		 * else
		 */
		if( day < 6 && day > 0 ) {
			System.out.println("3. Arbeitstag");
		} else if( day==6 || day==7 ) {
			System.out.println("3. Wochenende");
		} else {
			System.out.println("3. Ungültige Tag-Angaben: " + day);
		}
		
		
		
		System.out.println("end of main");
	}

}
