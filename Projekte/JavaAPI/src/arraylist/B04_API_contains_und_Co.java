package arraylist;

import java.util.ArrayList;
import java.util.List;

public class B04_API_contains_und_Co {
	
	static class Kreis {
		int radius;

		public Kreis(int radius) {
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Kreis. R = " + radius;
		}
		
		@Override
		public boolean equals(Object obj) {
//			return super.equals(obj);
			if( !(obj instanceof Kreis) ) {
				return false;
			}
			
			Kreis k2 = (Kreis) obj;
			return radius == k2.radius;
		}
	}
	

	/*
	 * contains, indexOf, lastIndexOf, remove 
	 * verwenden für den Vergleich der Elemente der Liste mit dem Parameter die Methode 'equals'!
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("mo");
		list.add("mi");
		list.add("fr");
		
		System.out.println("1: " + list);
		
		/*
		 * boolean contains(Object element)
		 */
		boolean gefunden = list.contains("di");
		System.out.println("di gefunden: " + gefunden); // false
		
		gefunden = list.contains("mi");
		System.out.println("mi gefunden: " + gefunden); // true
		gefunden = list.contains(new String("mi"));
		System.out.println("mi gefunden: " + gefunden); // true
		
		/*
		 * 
		 */
		System.out.println( "indexOf di: " + list.indexOf("di") ); // -1
		System.out.println( "indexOf mi: " + list.indexOf("mi") ); // 1
		System.out.println( "indexOf mi: " + list.indexOf(new String("mi")) ); // 1
		
		/*
		 * 
		 */
		System.out.println( "remove di: " + list.remove("di") ); // false
		
		System.out.println("** List mit Kreisen");
		
		ArrayList<Kreis> figuren = new ArrayList<>();
		figuren.add(new Kreis(2));
		figuren.add(new Kreis(5));
		
		Kreis k = new Kreis(12);
		figuren.add(k);

		System.out.println("Kreise: " + figuren);
		
		System.out.println("Suche nach " + k);
		System.out.println( "contains(k): " + figuren.contains(k) ); // true
		
		Kreis key = new Kreis(3000);
		System.out.println("Suche nach " + key);
		System.out.println( "contains(key): " + figuren.contains(key) ); // false
		
		key = new Kreis(5);
		System.out.println("Suche nach " + key);
		System.out.println( "contains(key): " + figuren.contains(key) ); // true
		
	}

}







