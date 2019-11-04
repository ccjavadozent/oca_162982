package aufgaben.lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

class JavaTipp {
	
	private static final int MAX_THEMEN = 3;
	
	private String text;
	
	private final ArrayList<String> themen = new ArrayList<>();
	
	public JavaTipp(String text) {
		this.text = text;
	}

	public void addThema(String thema) {
		if( themen.contains(thema)  ) {
			System.out.println("Das Thema ist bereits gespeichert: " + thema);
			return; 
		}
		
		if(themen.size()==MAX_THEMEN) {
			System.out.println("Maximale Anzahl der Themen erreicht");
			return; 
		}
		
		themen.add(thema);
	}
	
	public void addThemen(String... themen) {
		for (String thema : themen) {
			addThema(thema);
		}
	}
	
	public String getText() {
		return text;
	}
	
	public ArrayList<String> getThemen() {
		return new ArrayList<>( themen );
	}
	
} // end of JavaTipp


public class AufgabeLambdasPredicateJavaTipp {

	public static void main(String[] args) {
		
		System.out.println("start of main");
		
		JavaTipp t1 = new JavaTipp("Mit dem Schlüsselwort 'implements' kann eine Klasse ein Interface realisieren.");
		t1.addThema("Vererbung");
		t1.addThema("Klassen");
		t1.addThema("Interfaces");

		JavaTipp t2 = new JavaTipp("Eine Klasse kann nur eine andere Klasse erweitern.");
		t2.addThemen("Vererbung", "Klassen");
		
		JavaTipp t3 = new JavaTipp("Statische Methoden werden mit dem Klassennamen aufgerufen.");
		t3.addThemen("Klassen", "Methoden", "static");
		
		JavaTipp t4 = new JavaTipp("Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.");
		t4.addThemen("Klassen", "Konstruktoren", "Attribute");
		
		JavaTipp t5 = new JavaTipp("Beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.");
		t5.addThemen("Klassen", "Methoden", "Überschreiben");
		
		JavaTipp t6 = new JavaTipp("Alle Elemente in einem Interface sind immer 'public'");
		t6.addThemen("Interfaces", "Sichtbarkeiten");
		
		JavaTipp[] tipps = {
			t1, t2, t3, t4, t5	
		};
		

//		class Tmp implements Predicate<JavaTipp> {
//			public boolean test(JavaTipp param) {
//				return true;
//			}
//		}
		
		printIf(tipps, param -> true);
		
		System.out.println("end of main");
		
	} // end of main 
	
	static void printIf(JavaTipp[] tipps, Predicate<JavaTipp> filter) {
		
		for (JavaTipp tipp : tipps) {
			if( filter.test(tipp) ) {
				System.out.println("Java-Tipp: " + tipp.getText());
				System.out.println("Themen: " + tipp.getThemen());
			}
		}
		
	}

}
