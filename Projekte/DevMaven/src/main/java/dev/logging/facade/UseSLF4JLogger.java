package dev.logging.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UseSLF4JLogger {
	
	private static Logger log = LoggerFactory.getLogger(UseSLF4JLogger.class);

	
	public static void main(String[] args) {

		log.trace("trace msg");
		log.debug("debug msg");
		log.info("info msg");
		log.warn("warn msg");
		log.error("error msg");
		
	}

}
