package dev.logging.standard;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * http://openbook.rheinwerk-verlag.de/java8/19_001.html#u19
 *
 */
public class UseJavaUtilLogger {
	
	private static Logger log = Logger.getLogger( UseJavaUtilLogger.class.getName() ); 
	

	public static void main(String[] args) {

		
//		log.setLevel(Level.OFF);
//		log.setLevel(Level.ALL);
		log.setLevel(Level.WARNING); // nur Nachrichten ab 'WARNING' unf wichtiger präsentieren
		
		
		
		log.info("info msg");
		log.warning("warning msg");
		
		System.out.println("end of main");
	}

}
