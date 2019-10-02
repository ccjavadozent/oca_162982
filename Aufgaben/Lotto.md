# Aufgabe 'Lotto'

- Erstellen Sie eine Klasse "LottoSpielSimulation" mit einer main-Methode, wo Sie die neuen Klassen testen.


- Erstellen Sie eine Klasse "LottoSpiel" mit der Sie in der main-Methode der Klasse "LottoSpielSimulation" ein Lotto-Spiel erzeugen:

        int anzahlKugel = 7;
        int anzahlKugelGesamt = 49;
        LottoSpiel lotto = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);


- Mit dem Aufruf der Methode "ziehen" wird eine Lotto-Ziehung simuliert:

        lotto.ziehen();

> Dabei werden zufällige einzigartige Zahlen im Bereich 1 bis anzahlKugelGesamt generiert. Die Anzahl der generierten Zahlen ist gleich anzahlKugel. 

> Tipp: Sie können die Klasse "java.util.Random" benutzen, um die zufälligen Zahlen zu generieren.


- Geben Sie den aktuellen Zustand des LottoSpiel-Objektes aus:

        System.out.println( lotto );

> Die Ausgabe soll nach folgendem Muster erfolgen:

        Spiel 7 aus 49. [3, 7, 11, 28, 35, 40, 48]

> Tipp: Sie können zum Sortieren die Methode "sort" der Klasse "java.util.Arrays" benutzen.


- Erzeugen Sie eine Klasse "LottoTipp", mit der Sie ein Lotto-Tipp simulieren:

        LottoTipp tipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);


- Beim Aufruf der Methode "abgeben" soll eine Tipp-Abgabe simuliert werden:

        tipp.abgeben();

> Dabei dürfen zufällige einzigartige Zahlen im Bereich 1 bis anzahlKugelGesamt generiert werden. Die Anzahl der generierten Zahlen ist gleich anzahlKugel.   
    
- Optional: den Tipp von der Konsole einlesen.


- Geben Sie den aktuellen Zustand des LottoTipp-Objektes aus:

        System.out.println( tipp );

> Die Ausgabe soll nach folgendem Muster erfolgen:

        Tipp 7 aus 49. [6, 9, 17, 23, 35, 41, 42]


- Definieren Sie eine Methode "vergleichen", die die gezogenen und getippten Zahlen vergleichen kann:
	
        int gewinn = lotto.vergleichen(tipp);

> Dabei soll der Gewinn nach folgendem Muster berechnet werden:

        0 richtige: 0 Euro
        1 richtige: 1 Euro
        2 richtige: 10 Euro
        3 richtige: 100 Euro
        4 richtige: 1000 Euro
   
> usw.

Geben Sie den Gewinn aus.

- Optional. Spielen Sie mit demselben Tipp 100000 unterschiedlichen Lotto-Spiele. Ein Lotto-Spiel kostet 1 Euro. Ermitteln Sie den Gesamtgewinn.

