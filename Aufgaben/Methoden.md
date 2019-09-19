# Aufgabe 'Methoden' 

### Aufgabe 1.

Definieren Sie eine statische Methode "printFromTo" mit zwei int-Parameter "from" und "to". Die Methode gibt alle int-Werte von "from" bis "to" auf der Konsole in einer Zeile aus. Testen Sie Ihre Lösung.

### Aufgabe 2.

Definieren Sie eine statische Methode "sum", die zwei int-Parameter erhält, die Summe berechnet und das Ergebnis zurück liefert. Testen Sie Ihre Lösung. Wenn die Aufgabe gelöst ist, überlegen Sie ob Ihre Methode immer die korrekten Ergebnisse liefert.

### Aufgabe 3.

Definieren Sie eine statische Methode "sumFromTo", die zwei int-Parameter "from" und "to" hat. Die Methode berechnet die Summe aller int-Werte von "from" bis "to" und liefert das Ergebnis zurück. Testen Sie Ihre Lösung.

### Aufgabe 4.

Definieren Sie eine statische Methode "zeichneRechteck", die zwei int-Parameter "breite" und "hoehe" hat. Die Methode zeichnet ein gefülltes Rechteck auf der Konsole.

Z.B. für den Aufruf `zeichneRechteck(5, 4)` wird folgende Ausgabe erwartet:

        *****
        *****
        *****
        *****

### Aufgabe 5.

Definieren Sie eine statische Methode "zeichneRechteck", die zwei int-Parameter "breite" und "hoehe" und einen boolean-Parameter "fuellen" hat. 
Die Methode zeichnet ein Rechteck auf der Konsole. Wenn der Parameter "fuellen" true ist, wird ein gefülltes Rechteck gezeichnet, sonst ein leeres.

Z.B. für den Aufruf `zeichneRechteck(5, 4, false)` wird folgende Ausgabe erwartet:

        *****
        *   *
        *   *
        *****

Der Aufruf `zeichneRechteck(5, 4, true)` zeichnet ein gefülltes Rechteck:

        *****
        *****
        *****
        *****

### Aufgabe 6.

Definieren Sie eine statische Methode "printRandom", die die N int-Zufallszahlen aus einem Zahlenbereich [VON...BIS] generiert und auf der Konsole ausgibt. Die Anzahl der Zahlen und die Unter- und Obergrenze des Zahlenbereiches sollen beim Aufruf der Methode als Argumente übergeben werden.

Z.B.: `printRandom(5, 10, 20)` gibt 5 int-Zufallswerte aus dem Bereich [10 ... 20] aus.


**Tipp:** zum Generieren einer Zufallszahl kann man die Methode `random` der Klasse `java.lang.Math` ODER die Methode `nextInt(int)` der Klasse `java.util.Random` einsetzen
