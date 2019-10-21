# Aufgabe 'Personen - Sort - Format'

#### A1.
Erstellen Sie eine Klasse `PersonUtils`.    
Definieren Sie eine Methode 'generiereName(String[], int)', die man so verwenden kann:
   
    String neuerName = generiereName(arrayMitSilben, 4);
   
Die Methode erhält das Array mit Silben und die gewünschte Anzahl der Silben und generiert einen neuen Namen.
Definieren Sie ein Array mit 10-20 unterschiedlichen Silben ihrer Wahl (Z.B.: "pro", "gi", "idre" ...) und testen Sie damit die Methode `generiereName`. 

#### A2.
Erstellen Sie eine Klasse `Person` mit den Attributen 'vorname', 'nachname', 'geburtsjahr'. Im weiteren definieren Sie die Konstruktoren/Mathoden in der Klasse, die bei der Lösung der weiteren Aufgaben helfen.

#### A3.
Definieren Sie eine Methode `printPersonen(Person[])` in der Klasse `PersonUtils`, die ein Array von `Person`-Elementen formattiert auf der Console ausgibt. Die Tabelle soll folgende Spalten haben:

		|  Nr. |   		Vorname |  		Nachname |  		Geburtsjahr |  


> Tipp: Fürs Erzeugen der Spalten können Sie die Methode `System.out.printf` benutzen.


#### A4.
Bilden Sie ein Array mit 10 Elementen von Typ 'Person'. Jede Person bekommt einen zufälligen Namen (dafür Methode `generiereName` verwenden). Die Anzahl der Silben soll für jeden Vornamen und Nachnamen auch zufällig sein (zwischen 1 bis 5 Silben).
Geben Sie das Array mit der Methode `PersonUtils.printPersonen` aus. 

#### A5.
Sortieren Sie das Array aufsteigend nach den Nachnamen (bei gleichen Nachnamen nach den Vornamen, bei auch gleichen Vornamen nach dem Geburtsjahr).
Geben Sie das Array mit der Methode `PersonUtils.printPersonen` aus.
  
#### A6.
Sortieren Sie das Array absteigend.
Geben Sie das Array mit der Methode `PersonUtils.printPersonen` aus.
