# Aufgabe 'Interfaces - Comparable/Comparator - Person'

- Erstellen Sie  eine Klasse "Person" mit den Attributen 'vorname' und 'nachname'. 

*Erstellen Sie eine Klasse mit der main-Methode, in der folgende Aufgaben gelöst werden*

- Speichern Sie in einem Array vier Personen (keine Strings):

        Paul Smith
        Paul Black
        John Smith
        John Black


- Geben Sie den Inhalt des Arrays auf der Konsole aus.


- Sortieren Sie das Array mit Hilfe der Methode `java.util.Arrays.sort(Object[])`. Dabei müssen die Personen nach dem Nachnamen und bei gleichen Nachnamen nach dem Vornamen verglichen werden.

> Optional: ein weiteres Attribut 'geburtsjahr' in der Klasse 'Person' definieren und bei der Sortierung berücksichtigen, falls die Nachnamen und Vornamen gleich sind.


- Geben Sie erneut den Inhalt des Arrays auf der Konsole aus.


- Das Array bitte absteigend sortieren und ausgeben.

>Tipp: Interface java.util.Comparator

>Tipp: java.util.Arrays.sort(array, comparator)


- Suchen Sie in dem aufsteigend sortiertem Array nach der Person 'John Black' 

>Tipp: java.util.Arrays.binarySearch(array, key)


- Suchen Sie in dem absteigend sortiertem Array nach der Person 'John Smith'
    
>Tipp: java.util.Arrays.binarySearch(array, key, comparator)
