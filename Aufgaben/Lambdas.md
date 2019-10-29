# Aufgabe 'Lambdas'

###### A1.
Gegeben ist das Interface `IntOperation`:

	public interface IntOperation { 
		int execute(int x, int y); 
	}
	
und folgender Code:

	IntOperation op1 = new Sum();	// Kann Summe bilden
	System.out.println( op1.execute(2, 3) ); // 5
	
	IntOperation op2 = null;	// hier eine Lambda zum Bilden der Summe
	System.out.println( op2.execute(2, 3) ); // 5
	
	IntOperation op3 = new Max(); // Kann den größeren Wert ermitteln
	System.out.println( op3.execute(-6, 17) ); // 17
	
	IntOperation op4 = null; // hier eine Lambda um den größeren Wert zu ermitteln
	System.out.println( op4.execute(-6, 17) ); // 17
	

Realisieren Sie zuerst die Klassen `Sum` und `Max` so, dass mit `op1.execute` die Summe zwei Zahlen ermittelt werden kann `op3.execute` die größere aus zwei Zahlen zurückliefern kann.

Für `op2` und `op4` verzichten Sie bitte auf die Klassen `Sum` und `Max`. Stattdessen definieren Sie die gleichwertigen Lambda-Funktionen, die die Funktionalität der Klassen `Sum` und `Max` nachbilden.
 
	
###### A2.
Bilden Sie eine ArrayList mit 4-5 Strings und sortieren Sie sie mit `Collections.sort(List, Comparator)` nach Länge. Verwenden Sie zum erzeugen vom Comparator eine Lambda-Funtion. 

###### A3.
gegeben ist das Interface `ListCombiner`: 
	
	public interface ListPair {
		List<Integer> accept(List<Integer> list1, List<Integer> list2);   
	}

Definieren Sie mit einer Lambda-Funktion eine ListCombiner-Realisierung, mit der zwei Listen zu einer neuen kombiniert werden. Testen Sie Ihre Lösung:

	List<Integer list1 = new ArrayList<>();
	// 2-3 Integer zur list1 hinzufügen...
	
	List<Integer list2 = new ArrayList<>();
	// 2-3 Integer zur lisr2 hinzufügen...
	
	ListPair combiner = null; // hier die Lambda-Funktion
	List<Integer> list3 = combiner.accept(list1, list2);
	//list3 hat alle Elemente aus list1 und list2

###### A4. Optional.
Die Klasse `CPU` definiert Instanz-Attribute `int anzahlKerne` und `String hersteller`. Erzeugen Sie eine ArrayList mit 3-4 Elementen von Typ `CPU`. 

Geben Sie alle Hersteller-Namen der Elemente der Liste aus, verwenden Sie dafür die Methode `forEach` der Klasse `ArrayList` und eine Lambda-Funktion, die das Interface realisiert.  

