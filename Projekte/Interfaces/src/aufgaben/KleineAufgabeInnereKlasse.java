package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * A1. 
 * 		Jeder Affe soll einen Namen und Größe haben
 * 
 *      Bilden Sie eine ArrayList mit 4 Affen und geben Sie alle untereinander durchnummeriert aus.
 *      
 * A2.
 * 
 *  	Bitte den Comparator 'Affe.CmpGroesse' realisieren (Vergleich nach Größe nur).
 *  	Liste sortieren und ausgeben.
 *  
 * A3. 
 * 		Realisieren Sie das Interface AffeFormat mit einer inneren Klasse (in der Klasse Affe), so 
 * 		dass der Formatierer mit einem Affe-Argument ein String nach folgendem Muster erzeugt:
 * 
 * 			Affe affe = new Affe("Tom", 130);
 * 			AffeFormat fmt = affe.getFormatter(); // liefert den Formatier
 * 			String s = fmt.format(affe); 
 * 			System.out.println(s); // Affe: Tom, Größe: 130 cm.
 * 			
 */


class Affe {
	public static class CmpGroesse implements Comparator<Affe> {
		public int compare(Affe a1, Affe a2){
			return a1.groesse - a2.groesse;
		}
	}
	
	private class FormatImpl implements AffeFormat {
		@Override
		public String format() {
			return "Affe: " + name + ", Größe: " + groesse + " cm.";
		}
	}
	
	private String name;
	private int groesse;

	public Affe(String name, int groesse) {
		this.name = name;
		this.groesse = groesse;
	}
	
	@Override
	public String toString() {
		return name + " " + groesse;
	}
	
	public AffeFormat getFormatter() {
		return new FormatImpl();
	}
	
} // end of Affer




interface AffeFormat {
	String format();
}




public class KleineAufgabeInnereKlasse {

	public static void main(String[] args) {

		ArrayList<Affe> list = new ArrayList<>();
		
		list.add(new Affe("Tom", 130));
		list.add(new Affe("Kong", 5000));
		list.add(new Affe("Bobby", 90));
		list.add(new Affe("Bobby", 110));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println( i + ". " + list.get(i));
		}
		
		Affe.CmpGroesse cmp1 = new Affe.CmpGroesse();
		Collections.sort(list, cmp1);
		
		System.out.println("*** Sortiert nach Größe: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println( i + ". " + list.get(i));
		}
		
		System.out.println("*** Affen formatiert: ");
		
		for (int i = 0; i < list.size(); i++) {
			Affe a = list.get(i);
			
			AffeFormat fmt = a.getFormatter();
			System.out.println( fmt.format() );
		}
		
		
	}

}
