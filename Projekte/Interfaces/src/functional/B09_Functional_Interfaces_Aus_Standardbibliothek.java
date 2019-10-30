package functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class B09_Functional_Interfaces_Aus_Standardbibliothek {

	public static void main(String[] args) {
//		testPredicate();
//		testConsumer();
		testSupplier();
		testFunction();
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
		
		// mit Lambda:
		Predicate<Integer> p2 = value -> value > 0;
		
		System.out.println( p2.test(22) ); // 
	}
	
	/*
	 * Consumer ist unwahrscheinlich in der OCA-Prüfung
	 */
	static void testConsumer() {
		
		System.out.println("*** Consumer");
		
		// mit der anonymen Klasse
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};

		// mit Lambda:
		Consumer<String> c2 = s -> System.out.println(s);
		
		c2.accept("Mittwoch");
	}
	
	/*
	 * Supplier ist nicht in der OCA-Prüfung
	 */
	static void testSupplier() {
		
		System.out.println("*** Supplier");
		
		// mit der anonymen Klasse
		Supplier<Double> s1 = new Supplier<> () {
			public Double get() {
				return 22.67;
			}
		};
		
		// mit Lambda:
		Supplier<Double> s2 = () -> 22.67;
		
		System.out.println( s2.get() );

	}
	
	
	/*
	 * Function ist nicht in der OCA-Prüfung
	 */
	static void testFunction() {
		System.out.println("*** Function");
		
		Function<Integer, String> f1 = new Function<> () {
			public String apply(Integer x) {
				return "<" + x + ">";
			}
		};
		
		Function<Integer, String> f2 = x -> "<" + x + ">";
		
		String result = f2.apply(123);
		System.out.println(result);
		
	}

}
