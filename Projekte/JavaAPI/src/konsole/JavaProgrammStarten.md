
# Wenn das Programm als Ordner mit Class-Dateien vorliegt
> Gibts eigentlich gar nicht (oder sehr selten)

## Class-Dateien müssen im Classpath zu finden sein

- Entweder den Pfad zu dem Ordner, wo die Packages des Programms liegen in die Umgebungsvariable 'CLASSPATH' eintragen
- Oder beim Start der JVM die Option -cp verwenden und dabei den Pfad setzen zu dem Ordner, wo die Packages des Programms liegen

## java muss es auf dem Rechner geben 

Z.B. bei AdoptOpenJdk herunterladen.

## So startet man das Java-Programm

- Falls die Umgebungsvariable 'CLASSPATH' gesetzt wurde:  

		java packagename.NameDerKlasseMitDerMain


- Mit der Option -cp:  

		java -cp Pfad\zum\Ordner\mit\Packages packagename.NameDerKlasseMitDerMain





# Wenn das Programm als Java-Archive (jar-Datei) vorliegt

## Die jar-Datei muss zu finden sein 

- Entweder den Pfad zu der jar-Datei mit den Packages des Programms in die Umgebungsvariable 'CLASSPATH' eintragen
- Oder beim Start der JVM die Option -cp verwenden und dabei den Pfad setzen zu der jar-Datei mit den Packages des Programms
- Oder (bei der ausführbaren jar-Datei) met der Option -jar den Pfad zu der jar-Datei mit den Packages des Programms übergeben

## So startet man das Java-Programm

- Genauso, wie ohne Jar-Dateien, nur diesmal muss die jar-Datei im Classpath zu finden sein 

		java -cp Pfad\zu\der\Jardatei packagename.NameDerKlasseMitDerMain

- Falls die Jar-Datei 'ausführbar' ist:

		java -jar Pfad\zu\der\Jardatei

