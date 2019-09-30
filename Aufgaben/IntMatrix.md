# Aufgabe 'IntMatrix'

> Erstellen Sie eine Klasse 'IntMatrix', die eine Matrix von int-Elementen definiert. Beim Testen in einer main-Methode sollen folgende Aufgaben mit Hilfe der Klasse 'IntMatrix' gelöst werden:

- Erstellt eine IntMatrix mit 2 Zeilen und 3 Spalten:
   
        IntMatrix m1 = new IntMatrix(2, 3);


- Erstellt eine IntMatrix mit 5 Zeilen und 3 Spalten. Alle Elemente der IntMatrix sind mit dem Wert 100 initialisiert:
   
        IntMatrix m2 = new IntMatrix(5, 3, 100);


- System.out.println(m1) gibt auf der Konsole die IntMatrix m1 in folgender Form aus:

        0, 0, 0
        0, 0, 0


- Liefert den Wert an der Stelle (1, 2) der IntMatrix (Zeile 1, Spalte 2):
  
        int i = m1.get(1, 2);


- Erstellt eine IntMatrix mit 4 Zeilen und 6 Spalten. Alle Elemente werden zufällig initialisiert. Der erlaubte Wertebereich für die Elemente: 0 bis 200:
   
        IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);


- Liefert true, falls die Matrizen die gleichen Werte an den entsprechenden Stellen gespeichert haben. Die Matrizen mit ungleichen Dimensionen sind ungleich:
    
        m1.equals(m2);


- Optional. Überlegen Sie sich weitere Operationen, die mit Matrizen möglich sind. Z.B.: Matrix transponieren, Matrizen addieren, Matrizen multiplizieren u.s.w.


- Optional. Erzeugen Sie ein Array aus Matrizen mit unterschiedlichen Dimensionen
