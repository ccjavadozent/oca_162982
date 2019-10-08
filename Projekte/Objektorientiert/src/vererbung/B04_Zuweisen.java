package vererbung;

/*
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Der Compiler kenn nie den Wert einer Variable, sondern ihren Typ
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * 
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Zuweisung von Referenzen kompiliert NUR wenn zwischen 
 * den Typen eine IS-A Beziehung besteht (von rechts nach links gelesen)
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */


class Pflanze /* extends Object */ {
	int alter;
}

class Blume extends Pflanze {}



public class B04_Zuweisen {

	public static void main(String[] args) {

		Object var1 = new Object(); // Object <= IS-A <= Object
		
		Object var2 = var1; // Object <= IS-A <= Object

		Object var3 = new Pflanze(); // Object <= Pflanze
		
		Object var4 = new Blume(); // Object <= IS-A <= Planze<= IS-A <= Blume
		
//		Blume var5 = var4; // Blume <= IST KEINE!!!!!!!!!!!!! <= Object
	
		Pflanze var6 = new Blume();  // Pflanze <= IS-A <= Blume
		
		// var4.alter = 12; // potentiell keine Pflanze
		var6.alter = 12; // definitiv eine Pflanze
		
	}

}
