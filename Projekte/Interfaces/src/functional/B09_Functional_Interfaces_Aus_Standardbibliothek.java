package functional;

import java.util.function.Predicate;

public class B09_Functional_Interfaces_Aus_Standardbibliothek {

	public static void main(String[] args) {
		testPredicate();
	}
	
	/*
	 * Achtung! Predicate ist sehr oft in der Prüfung
	 */
	static void testPredicate() {
		
		System.out.println("*** Predicate");
		
		// mit der anonymen Klasse
		Predicate<Integer> p1 = new Predicate<Integer> () {
			public boolean test(Integer value) {
				return value > 0;
			}
		};
		
		Predicate<Integer> p2 = value -> value > 0;
		
		System.out.println( p2.test(22) ); // 
	}

}
