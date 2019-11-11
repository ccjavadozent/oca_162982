package staedte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UncheckedIOException;

public class TextIO {

	public static String getFromWiki(String urlName) throws UncheckedIOException {
		try {
			java.net.URL url = new java.net.URL( urlName );   
			InputStream is = url.openStream();   
			Reader r = new InputStreamReader(is);
			
			return read(r);
			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
		}
		
	}
	
	public static void save(String text, String fileName) throws UncheckedIOException {
		try(PrintWriter out = new PrintWriter(fileName)) {
			out.print(text);
		} catch (FileNotFoundException e) {
			throw new UncheckedIOException("Text kann nicht gespeichert werden", e);
		}
	}
	
	public static String loadFromFile(String fileName) {
		try {
			FileReader r = new FileReader(fileName);
			
			return read(r);
			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann den Text nicht laden", e);
		}
	}
	
	/**
	 * 
	 * Achtung! der Übergebene Read wird in der Methode read geschlossen!
	 * 
	 * @param r
	 * @return
	 * @throws IOException
	 */
	private static String read(Reader r) throws IOException {

		try(BufferedReader in = new BufferedReader( r )) {
			
			StringBuilder sb = new StringBuilder();
			String line;
			while( (line = in.readLine()) != null ) {
				sb.append(line).append("\n");
			}
			
			return sb.toString();
		}
	}
	
	
}
