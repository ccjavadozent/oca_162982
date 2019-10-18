package strings;

public class B06_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		System.out.println( "1. StringBuilder / length: " + sb.length() );  // 0
		
		sb.append(22);		// int-Argument
		sb.append(" > ");	// String
		sb.append(7.5);		// double
		sb.append(" = ");	// String
		sb.append(true);	// boolean
		
		String s = sb.toString();
		System.out.println("2. String: " + s);
	
		
		a1();
	} // end of main

	
	static void a1() {
		System.out.println("*** Kleine Aufgabe");
		// bitte alle Zahlen zwischen 0 bis 1000 (exklusive), 
		// mit einem StringBuilder zu einem String sammeln
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			sb.append(i);
		}
		
		System.out.println(sb.length()); 
		System.out.println(sb); 
	}
	
}
