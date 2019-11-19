package dev.logging.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import personen.Person;

public class UseSLF4JLogger {
	
	private static Logger log = LoggerFactory.getLogger(UseSLF4JLogger.class);

	
	public static void main(String[] args) {

		log.trace("trace msg");
		log.debug("debug msg");
		log.info("info msg");
		log.warn("warn msg");
		log.error("error msg");
		
		
		Person p = new Person("Jerry");
		System.out.println("main hat die Person: " + p.getName());
		
		log.debug("main hat die neue Person erstellt: {}", p.getName()); // wenn es hier keine Ausgaben gibt, 
																		// die Logging-Stufe in der logback.xml ändern
		
	}

}
