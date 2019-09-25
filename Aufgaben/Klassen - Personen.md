# Aufgabe 'Klassen - Person'

#### A1.
- Erstellen Sie eine neue Klasse `Person` mit folgenden Attributen: Vorname, Nachname, Geburtsjahr, Postleitzahl. Verwenden Sie für diese Attribute sinnvolle Datentypen und Namen.

#### A2.
- Erstellen Sie mindestens zwei Konstruktoren für die Klasse `Person`.

#### A3.
- Überschreiben Sie die Methode `toString()` sinnvoll.

#### A4.
- Optional: Definieren Sie alle Getter- und Setter-Methoden nach JavaBeans Standard 

<https://www.google.com/search?q=java+insel+javabeans>

#### A5.
- Erzeugen Sie 2 Beispielinstanzen der Klasse `Person` mit unterschiedlichen Konstruktoren.

#### A6.
- Geben Sie die erstellten Personen auf der Konsole aus. 

> Beispiel der Ausgabe: Hans Meyer, Geburtsjahr: 1950, Plz: 12345

#### A7.
- Überschreiben Sie die Methode `equals` und testen Sie sie mit den erstellten Personen.


#### A8.
- Erzeugen Sie bitte eine __statische__ Methode `getMustermann` die eine neue Person 'Max Mustermann, Geburtsjahr: 1960, Plz: 12345' bildet und zurück liefert. Testen Sie die Methode.

#### A8. Optional.

Sorgen Sie dafür, dass auch folgender Code ein neues Person-Objekt erzeugt:


		Person p = new PersonBuilder()
								.forname("John")
								.nachname("Doe")
								.geburtsjahr(1987)
								.build();


> Tipp: <https://www.google.com/search?q=builder+design+pattern>
