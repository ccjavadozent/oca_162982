package exceptions;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * - Resource-Klassen sind nicht in der OCA-Prüfung.
 * - Verwenden Sie inder Praxis (wenn es geht) 'try-with-resources' stat try/finally
 * - try-with-resources ist nicht in der OCA-Prüfung.
 * 
 */

public class B11_sinvolle_finally_nicht_in_Exam {

	public static void main(String[] args) {

		/*
		 * Eine Textdatei öffnen, in die Datei schreiben, dann die Datei schliessen: 
		 * das alles geht über PrintWriter (auch als 'Ressource' bezeichnet) 
		 */
		String pfadZuDerDatei = "autos.txt"; // relative Pfadangaben
		
		PrintWriter out1 = null;
		
		try {
			out1 = new PrintWriter(pfadZuDerDatei); // checked exception deklariert
			
			out1.println("VW");
			out1.println("Opel");
			out1.println("KIA");
			
			System.out.println("Datei erzeugt/überschrieben: " + pfadZuDerDatei);
			
		} catch (IOException e) {
			System.out.println("Fehler beim Erzeugen der Datei!");
			e.printStackTrace();
			
		} finally {
			
			if(out1!=null) {
				out1.close();
			}
		}
		
		/*
		 * try-with-resources: 
		 */
		try(PrintWriter out = new PrintWriter("tiere.txt")) {
			out.println("Hund");
			out.println("Katze");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // implizit wird die Resource out geschlossen! Kein explizites finally mit out.close() nötig
		
		
	} // end of main

}
