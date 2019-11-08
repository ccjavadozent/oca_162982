package props;

public class ReadAppProperties {

	public static void main(String[] args) {
		
		

		/*
		 * Ein Property lesen:
		 */
		
		String propName = "user-name";
		
		String propValue = System.getProperty(propName); // lesen
		
		System.out.println("Gesucht war die Property " + propName);
		System.out.println("Gefunden: " + propValue);
		
	}

}
