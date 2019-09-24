package aufgaben.autos;

/*
 * 0. definieren Sie eine Klasse 'Auto' mit den Attributen 'modell' und 'speed'.
 * 
 * 1. Erzeugen Sie ein Auto-Objekt.
 * 2. Setzen Sie sinnvolle Werte für das 'modell' und 'speed'
 *
 * 3. Versuchen Sie eine statische Methode printAuto zu definieren, die alle Auto-Infos ausgibt.   
 * 4. Versuchen Sie eine Instanz-Methode printAuto zu definieren, die alle Auto-Infos ausgibt.   
 * 
 */

public class AufgabeAuto {

	public static void main(String[] args) {

		Auto golf = new Auto();
		golf.modell = "Golf IV";
		golf.speed = 110;
		
		
		Auto.printAuto(golf); // Statische Methode
		
		golf.printAuto(); // Instanz-Methode
	}

}
