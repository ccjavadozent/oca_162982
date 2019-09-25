package klassen;

class OS {
	private String name;
	private int majorVersion;
	private int minorVersion;
	
	/*
	 * Ein Konstruktor, der selbst alle Attribute initialisiert
	 * (majorVersion und minorVersion bekommen implizit die Nullwerte)
	 */
	OS(String name) {
		this.name = name;
	}
	
	
	/*
	 * Ein Konstruktor, der mit this den anderen überladenen Konstruktor aufruft
	 */
	OS(String name, int majorVersion) {
//		OS(name, majorVersion, 0); // Compilerfehler 
		this(name, majorVersion, 0); // Den Constructor (String, int, int) aufrufen

		System.out.println("im Konstruktor (String, int)");
	}

	
		
	OS(String name, int majorVersion, int minorVersion) {
		if(name==null || name.isEmpty()) {
			throw new IllegalArgumentException("Der Name darf nicht leer sein");
		}
		
		if(majorVersion<0) {
			throw new IllegalArgumentException("Negative major version: " + majorVersion);
		}
		
		if(minorVersion<0) {
			throw new IllegalArgumentException("Negative minor version: " + minorVersion);
		}
		
		this.name = name;
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		
		System.out.println("im Konstruktor (String, int, int)");
	}
	
	//evtl. getter/setter hier
	
	
	public String toString() {
		return name + " " + majorVersion + "." + minorVersion;
	}
}


public class B07_ConstructorsOverloading {

	public static void main(String[] args) {

		OS os1 = new OS("Mac", 10, 7);
		System.out.println(os1); 
		
		System.out.println("----------------------------------");

		OS os2 = new OS("Windows", 10);
		System.out.println(os2);

		System.out.println("----------------------------------");
		
		OS os3 = new OS("Linux");
		System.out.println(os3);
		
	}

}
