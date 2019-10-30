package aufgaben.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Kreis {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. R = " + radius;
	}
}



public class KleineAufgabePredicate {

	public static void main(String[] args) {

		/*
		 * A1.
		 * 
		 * Folgende Kreise in einer ArrayList speichern:
		 * 		R = 3, R = 17, R = 2, R = 22, R = 8
		 * 
		 * A2.
		 * 	Definieren Sie ine Predicate für Kreise, mit dem die Kreise mit dem Radius > 10 akzeptiert werden.
		 * 
		 *  Testen Sie das Predicate in einer foreach-Schleife, die nur die Kreise ausgibt, 
		 *    die das Predicate akzeptiert
		 * 
		 */
		
		List<Kreis> list = new ArrayList<>();
		list.add(new Kreis(3));
		list.add(new Kreis(17));
		list.add(new Kreis(2));
		list.add(new Kreis(22));
		list.add(new Kreis(8));
		
		Predicate<Kreis> p = kreis -> kreis.getRadius() > 10;
		
		for (Kreis kreis : list) {
			if( p.test(kreis) ) {
				System.out.println(kreis);
			}
		}
		
	} // end of main

}
