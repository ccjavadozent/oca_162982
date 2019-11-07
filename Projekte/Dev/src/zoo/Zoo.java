package zoo;

import tiere.Tier;

/*
 * 
 */
public class Zoo {

	public static void main(String[] args) {

		System.out.println("*** Zoo");
		
		if( args.length > 0 ) {
			for (String name : args) {
				Tier t = new Tier(name);
				System.out.println(t);
			}
			
		} else {
			System.out.println("** Keine Argumente gefunden! Standardtiere werden erzeugt");
			Tier t1 = new Tier("Tom");
			System.out.println(t1);
			
			Tier t2 = new Tier("Jerry");
			System.out.println(t2);
		}
		
	} // end of main

}
