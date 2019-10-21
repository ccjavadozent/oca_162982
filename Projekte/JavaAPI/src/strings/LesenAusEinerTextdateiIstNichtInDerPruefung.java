package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LesenAusEinerTextdateiIstNichtInDerPruefung {

	public static void main(String[] args) {
		
		/*
		 * Benutzen Sie folgenden Code und erstellen Sie bitte damit eine Methode 'String loadFromFile(String path)'.
		 * 
		 *  Die Methode soll den Text aus einer Datei laden und als String zurückliefern.
		 *  
		 *  Verwenden Sie bitte auch den StringBuilder für die Lösung (also keine Strings-Konkatenationen)
		 */

		/*
		String relativePath = "Datei mit Text.txt";
		
		try( BufferedReader in = new BufferedReader( new FileReader( relativePath ) ) ) {
			
			String line;
			while( (line = in.readLine()) != null ) {
				
				System.out.println("Zeile: " + line);
			}
			
		} catch (IOException e) {
			System.out.println("Fehler! Kann die Datei nicht lesen");
			e.printStackTrace();
		}
		
		System.out.println("end of main");
		*/
		
		String text = loadFromFile("Datei mit Text.txt");
		System.out.println(text);
		
	} // end of main

	
	static String loadFromFile(String path) {
		
		try( BufferedReader in = new BufferedReader( new FileReader( path ) ) ) {
			
			StringBuilder sb = new StringBuilder();
			
			String line;
			while( (line = in.readLine()) != null ) {
				sb.append(line).append("\n");
			}
			
			return sb.toString();
			
		} catch (IOException e) {
			System.out.println("Fehler! Kann die Datei nicht lesen");
			e.printStackTrace();
		}
		
		return "";
	}
}
