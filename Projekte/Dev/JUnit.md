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

## JUnit Tests starten

### Eine Test-Klasse aktivieren:
- Wenn eine Testklasse im Editor im Fokus ist: Alt+Shift+X, danach T
- Alternativ: Unter Package-Explorer rechts auf die Testklasse, dann Ran As -> JUnit Test

### Mehrere Test-Klassen aktivieren:

- Alle aus einem Package: Unter Package-Explorer rechts auf das Package mit Testklassen, dann ran As-> JUnit Test
- Alle aus dem projekt Package: Unter Package-Explorer rechts auf das Verzeichnis 'test', dann ran As-> JUnit Test

