package wdh.zoo;

//import static wdh.tiere.Tier.MAX_ALTER; // nicht sichtbar

import static wdh.tiere.Tier.getMinAlter;													

public class AccessTier {

	public static void main(String[] args) {

//		System.out.println(wdh.tiere.Tier.MAX_ALTER); // nicht sichtbar
	
//		System.out.println( Tier.getMinAlter() );											// Tier ist nicht importiert
		
		System.out.println( getMinAlter() );
		
		System.out.println( wdh.tiere.Tier.getMinAlter() );
	}

}
