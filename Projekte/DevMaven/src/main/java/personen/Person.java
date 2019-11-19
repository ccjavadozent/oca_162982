package personen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
	
	private static final Logger LOG = LoggerFactory.getLogger( Person.class ); 

	private String name;
	
	public Person(String name) {
		this.name = name;
		LOG.trace("Person erstellt: {}", name);
	}

	public String getName() {
		return name;
	}
}
