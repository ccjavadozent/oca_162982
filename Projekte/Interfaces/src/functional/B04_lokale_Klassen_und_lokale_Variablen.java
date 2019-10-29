package functional;

import java.util.Random;

/*
 * lokale Klassen nicht in der Prüfung
 */
public class B04_lokale_Klassen_und_lokale_Variablen {
	
	interface Tier { }
	
	
	class Katze implements Tier {
		@Override
		public String toString() {
//			return "Katze. Alter: " + alter; 
			return "Katze"; 
		}
	}
	
	

	static Tier getLieblingstier() {
		
		// Variable, die sich 'effectively final' verhält, darf in der lokalen Klasse gelesen werden
		int alter = new Random().nextInt(5) + 1;
		
		
		//Lokale Klasse. Gültig nur bis zum letzten geschw. Klammer der Methode getLieblingstier. 
		class Hund implements Tier {
		
			@Override
			public String toString() {
				return "Hund. Alter: " + alter; // Zugriff auf die Variable aus dem Context der Klassendefinition  
			}
		}
		
		return new Hund();
	} 
	
	
	public static void main(String[] args) {

		Tier tier1 = getLieblingstier();
		Tier tier2 = getLieblingstier();
		
		System.out.println( "tier 1" + tier1 );
		System.out.println( "tier 2" + tier2 );
		System.out.println( "tier 1" + tier1 );
		System.out.println( "tier 2" + tier2 );
		
	}

}
