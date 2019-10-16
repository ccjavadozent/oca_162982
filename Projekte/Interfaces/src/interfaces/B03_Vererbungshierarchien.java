package interfaces;


public class B03_Vererbungshierarchien {
	
	
	interface Lauffaehig {
		public void laufen();
	}
	
	
	interface Sportler {
		public void springen();
	}
	
	interface Sprungfaehig {
		public void springen();
	}
	
	/*
	 * Interface extends Interface
	 */
	interface Fahrbar extends Lauffaehig {  // Fahrbar IS-A Lauffaehig
		
	}
	
	/*
	 * Klasse implements InterfaceA, InterfaceB
	 */
	static class Dozent implements Sportler, Lauffaehig { // Dozent IS-A Sportler, Dozent IS-A Lauffaehig
		public void laufen() {}
		public void springen() {}
	}
	
	static abstract class Fahrer implements Sportler {}

	/*
	 * Es ist kein Problem, wenn zwei Basisinterfaces eine Methode mit der gleichen Signatur deklarieren: 
	 */
	static class SportFrosch implements Sportler, Sprungfaehig {
		public void springen() {} 
	}
	
	
	public static void main(String[] args) {
		
		Lauffaehig var1 = null;
		Sportler var2 = null;
		Fahrbar var3 = null;

//		var1 = var2; // keine IS-A
		var1 = var3; // Lauffaehig <= IS-A <= Fahrbar
//		var3 = var1; // keine IS-A von rechts nach links
		
		Sprungfaehig sprungfaehig = new SportFrosch();
		sprungfaehig.springen();
		
		Sportler sportler = new SportFrosch();
		sportler.springen();
		
	} // end of main

}
