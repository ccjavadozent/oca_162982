## Wissensvermittlung
- 08:00 - 09:30 Uhr
- 09:45 - 11:15 Uhr
- 11:30 - 13:00 Uhr

## Sprechstunden
- 13:30 - 15:00 Uhr (per Chat sich melden)
- 15:15 - 16:45 Uhr (im Skype-Nachmittagsraum)

## Achtung! Mittwoch (20.11) ist frei!

## Allgemein

- Kursinhalte: https://github.com/ccjavadozent/oca_162982.git

- Buch 1 (Insel-Buch). Java ist auch eine Insel 

		Exakte Adresse: http://openbook.rheinwerk-verlag.de/javainsel/
		(es und weitere Bücher: https://www.rheinwerk-verlag.de/openbook/)
- Buch 2 (OCA-Buch). OCA Java SE 8 Programmer I Exam Guide 

- Comcave-Klausur: 27.11.2019, 08:30 Uhr (Multiple-Choice, 90 Min, alle Hilfsmitteln erlaubt)
- Oracle-Prüfung: 12.12.2019	

## Comcave-Klausur-Themen
- primitive Datentypen (auch Variablen, Identifier, Literale)
- Vergleichsoperatoren
- arithmetische Operatoren
- Kontrollstrukturen (alle, break, continue)
- Arrays (maximal 2D-Arrays)
    - Arrays erzeugen
    - Zuweisungen der Array-Referenzen
    - Zugriff auf die Elemente
    - foreach
- Klassen, Objekte, Referenzen, Stack, Heap 
- Sichtbarkeiten
- Konstruktoren (auch 'default')
- IS-A-Beziehungen
- Was dürfen und was müssen abstrakte bzw. 'konkrete' Klassen
- final (s. auch Projekt 'Objektorientiert', Package 'vererbung', B17)
- String-API
- Casting (Compilerfehler/ClassCastException)
- Varargs-Methoden
- Regeln beim Überschreiben
- Verbreitete Exceptions/Errors
- Lambdas-Syntax

## Aufgaben
###### für Dozent: Kovarianz?, Maven + Logging

#### 12.11 - 27.11
- Projekt
    - Git (eigenes Repo für das Projekt) 
    - Klassendiagramme (oder auch andere UML-Diagramme)
    - Konfiguration der Anwendung (s. App Argumente und Properties.md aus dem Projekt 'Dev')
    - Unit-Tests (s. JUnit.md aus dem Projekt 'Dev')
    - GUI (Swing oder Javafx)
    - ...

> Ein mögliches Projekt: Aufgaben/TicTacToe.md

- Klausurvorbereitung

- Optional: s. Maven.md im Projekt 'dev'
- Optional: s. Logging.md im Projekt 'dev'

#### 11.11
- Projekt 'JavaAPI', Package 'datetime'
- Objekte bilden mit statischen Methoden
- Unveränderlichkeit
- Überlegen Sie, welche Methoden die Klassen 'LocalTime' und 'LocalDateTime' haben können im Vergleich zu den Methoden der Klasse 'LocalDate' aus dem Bsp. 'B05'
- Aufgaben/DateAndTime - Calendar.md

#### 08.11
- Projekt 'Dev'
- Argumente für die main-Methode 
- Aufgaben/Taschenrechner.md
- s. die Datei 'App Argumente und Properties.md' aus dem Projektverzeichnis 
- Aufgaben/DeutscheStaedte.md
- s. die Datei 'Externe Libs.md' aus dem Projektverzeichnis und die Klasse `test_ext_lib.UseJSoup`


#### 07.11
- Exceptions (OCA-Buch, Projekt 'Exceptions')
- Optional: Klassendiagramm für Exceptions mit den Klassen aus dem Bsp. 12 erstellen
- Projekt 'Dev'
- Argumente für die main-Methode testen.
- Wdh.: Verzeichnis 'java_javac'

#### 06.11
- Exceptions
- checked/unchecked
- throws-Klausel und Überschreiben
- Aufgaben/Exceptions - ParseDate.md (s. Bsp. im Package 'checked')

#### 05.11
- Projekt 'Exceptions'
- Das Thema 'Exceptions' im Insel-Buch
- Werfen, Propagieren, Abfangen
- Throwable, Exception, RuntimeException, Error. Vererbungshierarchie

#### 04.11
- Projekt 'JavaAPI', Package 'enums'
- OCA-Buch: enums, was braucht man für die OCA-Prüfung von enums zu wissen
- Optional: Aufgaben/Enums - Hunderassen.md (Um die Aufgabe zu lösen, muss man wissen, wie in einer enum-Klasse zusätzlicher Code definiert werden kann)

#### 30.10
- Lambdas
- Aufgaben/Lambdas und Predicate - JavaTipp.md
- Predicate, Consumer, Comparator

#### 29.10
- Lambdas
- Aufgaben/Lambdas.md

#### 28.10
- Projekt 'Interfaces', Package 'functional'
- Innere (nested) Klassen (nicht in der Prüfung, aber empfehlenswert) 
- Aufgaben/Nested - Auto.md

#### 25.10
- Projekt 'Kapselung'
- Sichtbarkeiten 
- Importanweisungen 
- Optional: manuelles Compilieren und Starten: s. das Unterverzeichnis 'java_javac' im Repositorium-Verzeichnis
- Aufgabe aus dem Projekt 'Interfaces' aus src/aufgaben/filtern/AufgabeFiltern.java
- Optional: Aufgaben/Wrapper - Zahlen laden.md
- Optional: Aufgaben/String - StringBuilder.md
- Wdh. Interfaces

#### 24.10
- ArrayList (s. die Beispiele im Projekt 'JavaAPI')
- Sichtbarkeiten (s. das Projekt 'Kapselung')
- Optional: Importanweisungen (s. das Projekt 'Kapselung')
- Aufgaben/ArrayList.md
- Optional: Aufgaben/ArrayList - erweitert.md

#### 23.10
- Suche nach der richtigen überladenen Methode (s. das Projekt 'Imperativ', Package 'methoden', Bsp. 11)
- ArrayList (s. die Beispiele im Projekt 'JavaAPI')
- Aufgaben/ArrayList.md

#### 22.10
- Wrapper-Klassen
- Autoboxing/Autounboxing
- Konstantenpools 
- Wrapper-Klassen-API
- Optional: Testen Sie wann die überladene Methode mit dem Wrapper-Klassen-Parameter ausgewählt wird (Suche nach der richtigen überladenen Methode aus dem Projekt 'Imperativ') 

#### 21.10
- Richtige überladene Methode finden
- Projekt 'Imperativ', Package 'methoden', Bsp. 11
- Projekt 'JavaAPI', Package 'format'
- Aufgabe aus der Datei 'KleineAufgabeFormat.java' (Package 'aufgaben')
- Aufgaben/Personen - Sort - Format.md (Lösung im Projekt 'JavaAPI', Package 'aufgaben.personen')

#### 18.10
- Projekt 'JavaAPI'
- Klasse 'String'
- Diagramme/Strings.pptx
- Klasse 'StringBuilder'
- Bitte die Methoden von StringBuilder testen (s. die Liste im Bsp. 07, Package 'strings')
- Aufgabe aus LesenAusEinerTextdateiIstNichtInDerPruefung.java im Package 'strings'

#### 17.10
- Projekt 'JavaAPI'
- Klasse 'String'
- String-API
- String-Pool
- Aufgaben/String - Methoden.md
- Aufgaben/String - Silben.md
- Optional: Was bedeutet 'Strings are immutable'?

#### 16.10
- Projekt 'Interfaces'
- this/super s. das Projekt 'Objektorientiert', Package 'vererbung', B16
- Aufgaben/Interfaces - default.md
- Projekt 'JavaAPI', String-API

#### 15.10
- Projekt 'Interfaces'
- Interfaces Comparable und Comparator
- Arrays.sort und Arrays.binarySearch
- Aufgaben/Interfaces - Comparable - Comparator - Person.md
- KleineAufgabeComparable.java

#### 14.10
- Interfaces
- Aufgaben/Interfaces - Geometrie.md
- Aufgaben/Vererbung - IS-A .md

#### 11.10
- Vererbung bei den Arrays
- Wiederholung
- Optional: Aufgaben/Polymorphie - Bruteforce.md

#### 10.10
- Polymorphismus (wie ein polimorphischer Aufruf entsteht)
- Überschreiben (Regeln)
- KleineAufgabePolymorphie.java aus dem Package 'aufgaben'
- Aufgaben/Polymorphie - Tiere.md

#### 09.10
- Casting (Referenzen)
- instanceof
- Referenzenzuweisung
- Polymorphismus
- Aufgaben/Polymorphie - Geometrie.md

#### 08.10
- Vererbung
- Konstruktoren
- Regeln bei der Referenzenzuweisung
- Aufgaben/Vererbung - Dozent-Teilnehmer.md (Lösung im Package 'aufgaben.javakurs')
- Aufgaben/GC.md ( Lösung in Diagramme/AufgabeGarbageCollector.pptx )
- Aufgaben/Vererbung - Geometrie.md. 

> Bitte neue Klassen definieren. 
> Danach die neue Lösung mit der alten Lösung vergleichen (Klassen - Geometrie.md). 
> Und (wichtig) die Aufgabestellungen vergleichen 

#### 07.10
- Optional: Klassendiagramm mit Umlet (s. die Datei 'Umlet.md')
- Ein Klassendiagramm für Ihre Lösung der Aufgabe 'Aufgaben/Arrays - Hafen.md'
- Insel-Buch: Vererbung
- Optional: Einfache Vererbungshierearchien sich überlegen und programmieren (s. Bsp. 01 im Package 'vererbung')

#### 02.10 (auch für den 4.10)
- init-Blöcke (statische und nicht-statische)
- Konstanten (Attribute), wann müssen sie spätestens initialisiert werden?
- Garabage Collector (Datei 'GarbageCollector.pptx' aus dem Verzeichnis 'Diagramme')
- Wdh: Themen aus dem Projekt 'Imperativ'
- Wdh: Themen aus dem Projekt 'Arrays'
- Wdh: Themen aus dem Projekt 'Objektorientiert'
- Die früheren Aufgaben, die noch nicht erledigt sind bitte selbständig lösen.
- Aufgaben/Lotto.md
- Optional: zu besprochenen Kontrollfragen formulieren (evtl. mit dem Format wie in der Datei 'Imperativ\src\kontrollfragen\Variablen-q.md')

#### 01.10
- Varargs-Methoden (Projekt 'Imperativ', Package 'methoden')
- Projekt 'Objektorientiert'
- Klasse laden, statische Initblöcke (Projekt 'Objektorientiert', Package 'klassen')
- Aufgaben/Kampfarena.md

#### 30.09
- Projekt 'Arrays'
- Projekt 'JavaAPI'
- Aufgaben/IntMatrix.md (Optional: ein einfaches interaktives Konsolenprogramm sich überlegen, in dem mit Matrizen gearbeitet wird) 

#### 27.09
- Mehrdimensionale Arrays
- Mehrdimensionale Arrays ausgeben
- Optional: die Methode `toString` aus der Klasse `java.util.Arrays`
- Aufgaben/Arrays - 2D.md
- Aufgaben/Arrays - Hafen.md

#### 26.09
- Projekt 'Arrays'
- Array bilden (3 Varianten)
- foreach
- Diagramme/Arrays.pptx
- Aufgaben/Arrays.md
- Optional: Aufgaben/Arrays - test equals.md

#### 25.09
- Projekt 'Objektorientiert'
- Überladen von Methoden/Konstruktoren (s. auch 'src/methoden/B09_Ueberladen.java' im Projekt 'Imperativ')
- this (auch für einen Konstruktoraufruf)
- Aufgaben/Klassen - Personen.md 

#### 24.09
- Projekt 'Objektorientiert'
- Klassen, Methoden, Attribute
- this
- Konstruktoren
- Optional: toString-Überschreiben
- Überladen von Methoden/Konstruktoren (s. auch 'src/methoden/B09_Ueberladen.java' im Projekt 'Imperativ') 
- Aufgaben/Klassen - Geometrie.md (s. Package 'aufgaben.geometrie.klassen')

#### 23.09
- Projekt 'Objektorientiert'
- Diagramme/Scopes.pptx
- Diagramme/Klassen Objekte Referenzen.pptx
- Denken Sie bitte 3-5 Beispiele für Klassen aus. Jede Klasse sollte 2-3 Attribute haben. Bilden Sie Objekte, speichern Sie die Objekt-Adressen in Referenzen, Ändern Sie und lesen Sie die Attribute der Objekte. Versuchen Sie auch Schritt-für-Schritt Bilder zu malen, die die Speicherbelegung präsentieren. 

#### 20.09
- statische Methode (alles)
- Rekursive Aufrufe
- Aufgaben/Methoden - Fakultät.md
- Optional: Aufgaben/Methoden - Zeitspanne.md

#### 19.09
- statische Methoden
- lokale Variablen
- Parameter
- s. auch verzeichnis 'Diagramme', Datei 'Stack und Heap.pptx'
- Optional (als Wiederholung von Kontrollstrukturen): Aufgaben/Kontrollstrukturen.md
- Aufgaben/Methoden.md

#### 18.09
- while / do-while Schleifen
- break, continue
- Marker (Labels)
- switch-Anweisung
- Aufgaben/Kontrollstrukturen - while - do-while.md
- Aufgaben/Kontrollstrukturen - switch.md
- Aufgaben/Kontrollstrukturen - switch - if - Ampelfarben.md

#### 17.09
- Eine statische Methode in einer Klasse definieren. Danach die Methode in einer anderen Klasse in der main aufrufen.
- if / if-else / if-else if...
- for-Schleife
- Verzeichnis 'Aufgaben', Datei 'Kontrollstrukturen - for.md'

#### 16.09
- Bitte die Tabelle mit Operatoren im Insel-Buch finden (nicht auswendig lernen)
- Zuweisungsoperator 
- Arithmetische Operatoren
- Zuweisung mit Operation 
- Inkrement, Dekrement (Post- und Prä-)
- Logische Operatoren
- Vergleichsoperatoren
- Optional: Beim Lernen können Sie für sich Kontrollfragen definieren (s. z.B. das Package 'kontrollfragen', die Datei 'Variablen-q.md')

#### 13.09
- Primitive (elementare) Datentypen
- Literale
- Bezeichner (Identifier)
- Zuweisungsoperator 

> für den Dozenten: D-Literale zeigen

#### 12.09
- [Eclipse.md: Eclipse einrichten](Eclipse.md "Eclipse.md")    
- [Git.md: Git mit Eclipse](Git.md "Git.md")    
- Neues Projekt erzeugen
- Neue Klasse anlegen
- sout und main Templates testen
- Ctrl+F11 zum starten einer main testen
- 'Java ist auch eine Insel'. Einführung lesen
- Optional: Über Git nachschlagen. Evtl. eigenes Repo bit Github anlegen.

#### 11.09
- Am Empfang nach den Büchern fragen.
- jdk herunterladen (https://adoptopenjdk.net/)
    - Empfohlen: OpenJDK 11 (LTS)
    - Die Version für Ihr Betriebssystem (meist Windows x64) wählen
    - Die zip-Datei herunterladen
- jdk entpacken	
- [Eclipse.md: Eclipse einrichten](Eclipse.md "Eclipse.md")    
- 'Java ist auch eine Insel' kennenlernen. (Einführung lesen)
