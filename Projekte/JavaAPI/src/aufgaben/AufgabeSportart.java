package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public?
class Sportart implements Comparable<Sportart> {
	private String name;
	private boolean olympisch;
	
	public Sportart(String name, boolean olympisch) {
		this.name = name;
		this.olympisch = olympisch;
	}
	
	@Override
	public String toString() {
		return name + ". Olympisch: " + olympisch;
	}
	
	@Override
	public int compareTo(Sportart sa2) {
		int erg = name.compareTo(sa2.name);
		
		if(erg==0) {
//			erg = Boolean.valueOf(olympisch).compareTo(Boolean.valueOf(sa2.olympisch));
			erg = Boolean.compare(olympisch, sa2.olympisch);
		}
		
		return erg;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Sportart) ) {
			return false;
		}
		
		Sportart sa2 = (Sportart)obj;
		
		return name.equals(sa2.name) && olympisch==sa2.olympisch;
	}
	
}

public class AufgabeSportart {

	public static void main(String[] args) {

		List<Sportart> list = new ArrayList<>();
		
		list.add( new Sportart("Turnen", true) );
		list.add( new Sportart("Reiten", true) );
		list.add( new Sportart("Bowlen", false) );
		list.add( new Sportart("Ringen", true) );
		list.add( new Sportart("Spatzieren", false) );
		list.add( new Sportart("Fechten", true) );
		
		for (Sportart sportart : list) {
			System.out.println(sportart);
		}
		
		System.out.println("*** Ringen: ");
		Sportart ringen = new Sportart("Ringen", true);
		
		System.out.println("Ist Ringen in der Liste: " + list.contains(ringen)); // ?
		
//		System.out.println( new Sportart("Ringen", true).equals(ringen) );
		
		Sportart fechten = new Sportart("Fechten", true);
		
		Collections.sort(list);
		System.out.println("*** Sortiert: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i));
		}
		
		int index = Collections.binarySearch(list, fechten);
		System.out.println("Position von Fechten: " + index);
		
	}

}
