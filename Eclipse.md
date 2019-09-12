# Eclipse

#### JDK einrichten

Empfohlen: Nach adoptopenjdk im Internet suchen und die letzte für eigenes Betriebssystem passende LTS-Version herunteladen. 

#### Eclipse runterladen und entpacken

- **IDE for JavaEE Developers** <https://www.eclipse.org/downloads/eclipse-packages/> 

- Evtl. in der eclipce.ini den Pfad zu der VM eintragen, mit der Eclipse gestartet werden soll. 
Dazu dann folgene Zeilen am Anfang der ini-Datei hinzufügen: 

	-vm
	Absoluter\Pfad\zu\dem\JDK-Verzeichnis\bin

> Die zweite Zeile soll bitte den echten Pfad auf Ihrem Rechner beschreiben. 

#### Eclipse-Workspace festlegen 

- Beim ersten Start von Eclipse legen sie fest, wo auf der Festplatte das Wokspace-Verzeichnis entstehen soll. 
Falls Sie ein Wokspace von früher haben, können Sie auch dieses finden und auswählen.  

#### Eclipse auf Unicode umstellen
- Menü 'Window/Preferences' öffnen
- Filtern nach 'encoding'
- Zu 'General/Workspace' wechseln
- Bei 'Text file encoding' auf 'Other' umschalten und 'UTF-8' auswählen
- Optional: bei 'General/Content Types' weitere Datei-Typen umstellen

#### Java-Projekt unter Eclipse anzeigen (öffnen, importieren)
- Zu der 'Java-Perspektive' wechseln
- Menü 'File/Import...'
- Im 'Select'-Dialog 'General/Existing Projects into Workspace...'
- Next
- Im 'Import'-Dialog für 'Select root directory' mit 'Browse' das __Wurzelverzeichis__ finden, in dem sich das Projektverzeichnis befindet 
- Unter 'Projects' das Projekt (bzw. mehrere Projekte) auswählen
- 'Finish'


#### Tipps für Eclipse-Einstellungen
- Top 10 Tipps: http://eclipsesource.com/blogs/2012/10/26/top-10-tips-how-to-be-more-productive-with-the-best-ide/

#### Eclipse Icons erklärt
- http://help.eclipse.org/neon/index.jsp?topic=/org.eclipse.jdt.doc.user/reference/ref-icons.htm
