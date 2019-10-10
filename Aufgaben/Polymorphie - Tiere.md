# Aufgabe 'Polymorphie - Tiere'

- Erstellen Sie eine Klasse "Tier" mit den Attributen "name" (String), "alter" (int) und "gesund" (boolean). Definieren Sie die dazugehörigen Getter- und Setter-Methoden nach JavaBeans Standard.


- Deklarieren Sie in der Klasse "Tier" eine abstrakte Methode "laufen" mit der leeren Parameterliste und dem Rückgabetyp "void".


- Erstellen Sie eine Klasse "Hund", die die Klasse "Tier" erweitert. Definieren Sie einen Konstruktor, in dem Sie alle geerbten Attribute initialisieren. Die Initialisierungswerte für die Attribute sollen dabei als Argumente an den Konstruktor übergeben werden können.


- Definieren Sie eine Klasse "Katze", die von der Klasse "Tier" erbt. Die Klasse soll auch einen Konstruktor haben, in dem die geerbten Attribute initialisiert werden können (ähnlich wie bei der Klasse Hund).


- Definieren Sie in den Klassen "Hund" und "Katze" die Methode "laufen" so, dass es beim Aufruf der Methode folgende Ausgabe auf der Konsole erfolgt (Bsp. Für Hund mit dem Namen Rex): "Hund Rex läuft".


- Erstellen Sie eine Klasse "Test" mit der statischen main-Methode. In der Klasse "Test" implementieren Sie eine statische Methode "print", an die man als Argument sowohl ein Objekt von Typ "Hund" als auch ein Objekt von Typ "Katze" übergeben kann. Die Methode soll folgende Ausgabe erzeugen, wenn ein Hund mit dem Namen "Rex" als Argument übergeben wurde: "Hund. Name: Rex". Wenn man eine Katze mit dem Namen "Tom" als Argument an die Methode "print" übergibt, soll auf der Konsole "Katze. Name: Tom" ausgegeben werden.
