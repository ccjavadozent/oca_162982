package aufgaben.geometrie.vererbung;

public class AufgabeGeometrieVererbung {

	/*
	 *  - Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.
		- Es soll auch Kreise geben können. Jeder Kreis soll ein Radius haben. 
		- Sowohl ein Rechteck als auch ein Kreis hat die x und y Koordinaten.
		- Sowohl ein Rechteck als auch ein Kreis hat eine Methode "bewegen", mit der sich die Koordinaten ändern lassen.
		- Erzeugen Sie ein Rechteck 3 x 4 mit den Koordinaten (0, 0) und geben Sie seine Koordinaten aus. Bewegen Sie das Rechteck zu den Koordinaten (12, -7). Geben Sie die aktuellen Koordinaten aus.
		- Erzeugen Sie einen Kreis mit dem Radius 4 mit den Koordinaten (0, 0) und geben Sie seine Koordinaten aus. Bewegen Sie den Kreis zu den Koordinaten (33, 1). Geben Sie die aktuellen Koordinaten aus.
	 */
	public static void main(String[] args) {

		System.out.println("*** Rechteck: ");
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(r1); 
		r1.bewegen(101, -22);
		System.out.println(r1);
	
		System.out.println("*** Kreis");
		Kreis k1 = new Kreis(7);
		System.out.println(k1);
		k1.bewegen(2003, 171918);
		System.out.println(k1);
	}

}
