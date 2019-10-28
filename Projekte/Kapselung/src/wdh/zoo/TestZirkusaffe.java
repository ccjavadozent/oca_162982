package wdh.zoo;

import wdh.tiere.Affe;

class ZirkusAffe extends Affe {
	void access() {
		System.out.println( haende ); // in einer abgeleiteten Klasse (Zugriff auf protected)
		System.out.println( this.haende ); // in einer abgeleiteten Klasse (Zugriff auf protected)
		
		Affe nachbar = new ZirkusAffe();
//		System.out.println( nachbar.haende ); // nicht mit abgeleiteten Typ

		ZirkusAffe opa = new ZirkusAffe();
		System.out.println( opa.haende ); // mit abgeleitetem Typ
	}
}

public class TestZirkusaffe {

	public static void main(String[] args) {
	
//		System.out.println( new Affe().haende );
		
		ZirkusAffe za = null;
//		System.out.println( za.haende ); // nicht in einer abgeleiteten Klasse (Zugriff auf protected)
		
		ZirkusAffe opa = new ZirkusAffe();
//		System.out.println( opa.haende ); // nicht in einer abgeleiteten Klasse (Zugriff auf protected)
	}
	
}
