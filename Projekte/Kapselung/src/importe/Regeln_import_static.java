package importe;

/*
 * import static: importiert einen oder alle statische Elemente aus einem Typ
 * 
 */

//import importe.p2.Utils;

import static importe.p2.Utils.getMaxValue;

import static java.lang.Math.*; // importiert alle statische Elemente der Klasse Math 

public class Regeln_import_static {

	public static void main(String[] args) {
		
		System.out.println( importe.p2.Utils.getMaxValue() );   // vollqualifizierter Klassenname und
																// 'normaler' Zugriff auf die statische Methode
		
//		System.out.println( Utils.getMaxValue() );   // 'vereinfachter' Klassenname (geht nicht ohne import) und
													// 'normaler' Zugriff auf die statische Methode

		System.out.println( getMaxValue() ); // 'vereinfachter' Zugriff die statische Methode (geht nicht ohne import static)
		
		
		System.out.println( Math.PI ); // 'normaler' Zugriff auf das statische Attribut

		System.out.println( PI ); // 'vereinfachter' Zugriff (geht nicht ohne import static)
		
		System.out.println( Math.random() ); // 'normaler' Zugriff auf die statische Methode
		
		System.out.println( random() ); // 'vereinfachter' Zugriff auf die statische Methode (geht nicht ohne import static)
	}

}
