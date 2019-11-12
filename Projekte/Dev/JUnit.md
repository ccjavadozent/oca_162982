# JUnit

> https://junit.org/junit5/

## Vorbereitung im 'normalen' Eclipse-Java-Projekt

> Trennen von Anwendungs-Dateien und Test-Dateien

- Ein Verzeichnis mit dem Namen 'test' im Projekt erzeugen
- Unbeding als 'Source Folder' im Projekt registrieren (z.B. über Build Path-Menu, dann 'Use as Source Folder')

## JUnit 5 im Projekt einbinden

> Am einfachsten beim Erzeugen vom ersten Test-Case:

- Im Package-Explorer rechts auf den Namen eine Klasse klicken, für die eine neue Testklasse erzeugt werden soll.  
- Im Kontextmenu: New->JUnit Test Case
- Im Fenster 'New JUnit Test Case':
    - 'JUnit Jupiter' wählen
    - Als 'Source Folder' den Ordner 'test' setzen
    - Finish
- Falls noch nicht geschehen, wird es angeboten JUnit 5 einzubinden (Bestätigen)

## Ein JUnit-Test-Case definieren (neue Testklasse erzeugen)

- Im Package-Explorer rechts auf den Namen eine Klasse klicken, für die eine neue Testklasse erzeugt werden soll.  
- Im Kontextmenu: New->JUnit Test Case
- Im Fenster 'New JUnit Test Case':
    - 'JUnit Jupiter' wählen
    - Als 'Source Folder' den Ordner 'test' setzen
    - evtl. weitere Hacken aktivieren
    - Finish
    
> nur die Methoden mit der Annotation @Test werden als Testmethoden erkannt und gestartet


