package personen;

public class Person {
	
	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory
				.getLogger(java.lang.invoke.MethodHandles.lookup().lookupClass());

	private String name;
	
	public Person(String name) {
		this.name = name;
		LOG.trace("Person erstellt: {}", name);
	}

	public String getName() {
		return name;
	}
}
