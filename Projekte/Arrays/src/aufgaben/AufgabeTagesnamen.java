package aufgaben;

public class AufgabeTagesnamen {

	public static void main(String[] args) {

		/*
		 * A1. Erzeugen Sie 4 folgende Arrays:
		 */
		
		// Array 1:
		// Montag, Dienstag, Mittwoch, Donnerstag, Freitag
		String[] a1 = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" };
		
		// Array 2:
		// Mo, Di, Mi, Do, Fr
		String[] a2 = { "Mo", "Di", "Mi", "Do", "Fr" };
		
		// Array 3:
		// Samstag, Sonntag
		String[] a3 = { "Samstag", "Sonntag" };
		
		// Array 4:
		// Sa, So
		String[] a4 = { "Sa", "So" };
		
		/*
		 * Bitte alle 4 Arrays in einem String[][] speichern
		 * und danach alle Inhalte aus dem String[][] ausgeben.
		 * 
		 */
		String[][] arr2D = new String[4][];
		arr2D[0] = a1;
		arr2D[1] = a2;
		arr2D[2] = a3;
		arr2D[3] = a4;
		
		String[][] nochEinArr2D = { a1, a2, a3, a4 };
		
		for(String[] subArray : nochEinArr2D) {
			for( String s : subArray ) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

}
