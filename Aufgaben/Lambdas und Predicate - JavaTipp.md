# Aufgabe 'Lambdas, Predicate - JavaTipp'

*Analysieren Sie bitte die gesamte Aufgabestellung, bevor Sie mit der Lösung anfangen.*

*Überlegen Sie, ob bei der Lösung das Interface `Predicate` eingesetzt werden kann.*

###### A1.
In einem Java-Tipp-Objekt soll sowohl sein Tipp-Text als auch maximal 3 Themen gespeichert werden.
Erzeugen Sie ein Array mit folgenden Java-Tipps:

	Text: Mit dem Schlüsselwort 'implements' kann eine Klasse ein Interface realisieren.
	Themen: Vererbung, Klassen, Interfaces
	
	Text: Eine Klasse kann nur eine andere Klasse erweitern. 
	Themen: Vererbung, Klassen
	
	Text: Statische Methoden werden mit dem Klassennamen aufgerufen.
	Themen: Klassen, Methoden, static
	
	Text: Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.
	Themen: Klassen, Konstruktoren, Attribute
	
	Text: Beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.
	Themen: Klassen, Methoden, Überschreiben
	
	Text: Alle Elemente in einem Interface sind immer 'public'
	Themen: Interfaces, Sichtbarkeiten


###### A2.
Realisieren Sie eine universelle Komponente, die ein Array mit Java-Tipps nach Java-Tipps mit besonderen Eigenschaften durchsucht. Die gefundenen Java-Tipps werden direkt ausgegeben.

> Optional. Statt die gefundenen Java-Tipps auszugeben, soll eine ArrayList gebildet werden in der die gefundenen Java-Tipps gespeichert und zurückgeliefert werden.

> Optional. Statt die gefundenen Java-Tipps auszugeben oder in einer neuen ArrayList zu speichern, soll die zu entwickelnde Komponente jedes gefundene Element einem (abstrakten) Verbraucher übergeben. Testen Sie die Lösung mit einem 'konkreten' Verbraucher, der die übergebenen gefundenen Java-Tipps auf der Konsole ausgibt. 

*Im weiteren wird die Lösung getestet. Überlegen Sie, wie bei den Tests Lambda-Funktionen eingesetzt werden können.*

###### A3.
Verwenden Sie die Lösung aus dem Punkt A2 um alle vorhandenen Java-Tipps zu finden. 

###### A4.
Verwenden Sie die Lösung aus dem Punkt A2 um die Java-Tipps zu finden, die im Tipp-Text den Unterstring 'Klasse' haben. 

###### A5.
Verwenden Sie die Lösung aus dem Punkt A2 um die Java-Tipps zu finden, die genau zwei Themen haben.

###### A6.
Verwenden Sie die Lösung aus dem Punkt A2 um die Java-Tipps zu finden, die das Thema 'Klassen' haben.

###### A7.
Verwenden Sie die Lösung aus dem Punkt A2 um die Java-Tipps zu finden, die das Thema 'Klassen' haben aber dabei kein Thema 'Vererbung'.

###### A8.
Überlegen Sie sich zwei-drei weitere Beispiele für den Einsatz der entwickelten Komponente.
