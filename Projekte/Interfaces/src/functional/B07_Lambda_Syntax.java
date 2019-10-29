package functional;

public class B07_Lambda_Syntax {
	
	interface FormatInt {
		String format(int x);
	}
	

	public static void main(String[] args) {
		
		/*
		 * 'normale' Klasse
		 */
		class LocalFormat implements FormatInt {
			public String format(int x) {
				return "<" + x + ">";
			}
		}
		
		FormatInt f1 = new LocalFormat();
		System.out.println("mit f1: " + f1.format(22));
		
		/*
		 * Lambda, ausführlich
		 */
		
		FormatInt f2 = (int x) -> { 
			return "<" + x + ">"; 
		};
		System.out.println("mit f2: " + f2.format(22));
		
		/*
		 * Lambda. Parameterliste ohne Typ
		 */
		FormatInt f3 = (x) -> {
			return "<" + x + ">";
		};
		
		/*
		 * Lambda. Parameterliste ohne Klammer - nur wenn es genau einen Parameter gibt
		 */
		FormatInt f4 = x -> {
			return "<" + x + ">";
		};
		
		/*
		 * Lambda. Rumpf ohne geschw. Klammer - nur wenn der Rumf aus einer einzigen Anweisung besteht 
		 */
		// FormatInt f5 = x ->  return "<" + x + ">"; // Compilerfehler: return muss weg (semikolon auch)
		FormatInt f5 = x ->  "<" + x + ">"; 
		System.out.println("mit f5: " + f5.format(22));
		
		
		useFormatter( f5 );
		
//		useFormatter( x -> "<" + x + ">"; ); // Compilerfehler: eine weitere (leere Anweisung) im Argument
		useFormatter( x -> "<" + x + ">" );
		
	} // end of main
	
	static void useFormatter(FormatInt fmt) {
		System.out.println( fmt.format(22) );
	}

}








































