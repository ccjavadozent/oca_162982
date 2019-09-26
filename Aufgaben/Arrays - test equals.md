# Aufgabe 'Arrays - equals'

> Bemerkung: beachten Sie, dass die Tests in der Aufgabe nur eine grobe Einschätzung liefern und keine exakten Perfomance-Tests darstellen.

- Erstellen Sie eine neue Klasse in der Sie die Aufgabe lösen


- Erstellen Sie in der eine statische int-Konstante `NUMBER_OF_TESTS`


- Definieren Sie eine statische Methode 'boolean equalsMitWhile(int[], int[])  die die Inhalte zwei int-Arrays gleicher Länge vergleicht und dabei mit der while-Schleife durch die Arrays läuft.


- Definieren Sie eine statische Methode 'boolean equalsMitFor(int[], int[])  die die Inhalte zwei int-Arrays gleicher Länge vergleicht und dabei mit der for-Schleife durch die Arrays läuft.


- Rufen Sie für zwei int-Arrays die Methode 'equalsMitWhile' mehrmals auf. Die Anzahl der Aufrufe ist mit `NUMBER_OF_TESTS` definiert. Messen Sie die Gesamtzeit aller Aufrufe. Am Ende berechnen Sie den Mittelwert (Durchschnitt) der Zeit eines einzelnen Aufrufes.

> Tipp: Setzen Sie die Methode System.currentTimeMillis() ein um die Laufzeit des Tests zu messen.

- Rufen Sie für dieselben zwei int-Arrays die Methode 'equalsMitFor' mehrmals auf. Die Anzahl der Aufrufe ist mit `NUMBER_OF_TESTS` definiert. Messen Sie die Gesamtzeit aller Aufrufe. Am Ende berechnen Sie den Mittelwert (Durchschnitt) der Zeit eines einzelnen Aufrufes.
