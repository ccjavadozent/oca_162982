:: der Pfad zum Compiler-Ordner bzw. JVM-Ordner auf dem Dozentenrechner
set PATH_JAVA=C:\Locale\jdk-11.0.4+11\bin

:: *****************************
:: den Compiler starten:
:: %PATH_JAVA%\javac

:: Dem javac den relativen Pfad zu einer Java-Datei übergeben.
:: Der Compiler erstellt die Class-Datei im demselben Verzeichnis, wo auch die java-Datei liegt.
:: %PATH_JAVA%\javac src\BadAuto.java

:: Den javac startun und mit der Option -d den Pfad zum Zielverzeichnis für die erzeugten class-Dateien übergeben.
:: Hier ist das Zielverzeichnis ein Unterordner namens 'bin' in dem Arbeitsverzeichnis.
%PATH_JAVA%\javac -d bin src\autos\Auto.java src\personen\Person.java

:: *****************************
:: die JVM starten
::%PATH_JAVA%\java

:: der JVM den vollqualifizierten Klassennamen übergeben
:: %PATH_JAVA%\java autos.Auto

:: der JVM mit der Option -cp sagen in welchen Verzeichnissen nach Packages zu suchen ist:
%PATH_JAVA%\java -cp bin autos.Auto



pause
