package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class B10_Predicate_und_ArrayList {
	
	static class IsNegative implements Predicate<Integer> {
		public boolean test(Integer x) {
			return x < 0;
		}
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(-3);
		list.add(55);
		list.add(-17);
		list.add(100);

		System.out.println("list: " + list);
		
		List<Integer> listCopy = new ArrayList<Integer>( list );
		System.out.println("1. listCopy: " + listCopy);
		
		Predicate<Integer> filter = new IsNegative();
		
		/*
		 * removeIf(Predicate)
		 * 	entfernt alle Elemente aus der List, für die die test-Methode des Parameters (Predicate) true liefert
		 * 
		 */
		listCopy.removeIf(filter);
		System.out.println("Negative entfernt: " + listCopy ); // [12, 55, 100]
		
		
		listCopy = new ArrayList<Integer>( list );
		System.out.println("2. listCopy: " + listCopy);
		
		listCopy.removeIf( x -> x > 0 );

		System.out.println("Positive entfernt: " + listCopy ); // [-3, -17]
		
		System.out.println("---------------------");
		/*
		 * Predicates ableiten/kombinieren
		 */
		
		Predicate<Integer> isGerade = x -> x % 2 == 0;
		Predicate<Integer> isUngeradeA = x -> !isGerade.test(x); 
		Predicate<Integer> isUngeradeB = isGerade.negate(); 
		
		System.out.println("ist 12 gerade: " + isGerade.test(12));
		System.out.println("ist 12 ungerade: " + isUngeradeA.test(12));
		System.out.println("ist 12 ungerade: " + isUngeradeB.test(12));
		System.out.println("ist 12 ungerade: " + isGerade.negate().test(12));
		
		Predicate<Integer> isZero = x -> x==0;
		
		Predicate<Integer> isUngeradeOderZero = isUngeradeA.or(isZero);
		
		System.out.println( "ist 33 ungerade oder 0: " + isUngeradeOderZero.test(33) );	// true
		System.out.println( "ist 0 ungerade oder 0: " + isUngeradeOderZero.test(0) );	// true
		System.out.println( "ist -12 ungerade oder 0: " + isUngeradeOderZero.test(-12) ); // false
		
		listCopy = new ArrayList<Integer>(list);
		listCopy.add(2, 0);
		System.out.println("neue Liste: " + listCopy); // [12, -3, 0, 55, -17, 100]
		
		listCopy.removeIf( isUngeradeOderZero );
		System.out.println("neue Liste ohne 0 und ohne ungeraden: " + listCopy); // [12, 100]
		
		System.out.println("-------------------------");
		
		/*
		 * Evtl. in einfachen Fragen: forEach(Consumer).
		 * 
		 * Z.B.: alle Elemente einer ArrayList einem Consumer fürs Ausgeben übergeben:
		 */
		Consumer<Integer> action = element -> System.out.println(element);
		listCopy.forEach(action);
		
	} 

}
