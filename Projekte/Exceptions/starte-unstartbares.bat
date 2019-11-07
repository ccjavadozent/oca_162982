:: der Pfad zum Compiler-Ordner bzw. JVM-Ordner auf dem Dozentenrechner
set PATH_JAVA=C:\Locale\jdk-11.0.4+11\bin


:: der JVM mit der Option -cp sagen in welchen Verzeichnissen nach Packages zu suchen ist:
%PATH_JAVA%\java -cp bin exceptions.Unstartbar
%PATH_JAVA%\java -cp bin KlasseDieEsNichtGibt


::pause
