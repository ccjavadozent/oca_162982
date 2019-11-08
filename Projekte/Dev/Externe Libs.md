# Externe Bibliotheken einbinden

## beim Consolen-Start einer App: 

einfach die externe Libs (ihre Jars) dem Classpath hinzufügen


## unter Eclipse:

> als Beispiel wird die JSoup-Bibliothek genommen: https://jsoup.org/


### Jar-Dateien finden und herunterladen

- Unbedingt jsoup-1.12.1.jar core library von https://jsoup.org/download

- Optional: sources und javadoc Jars  

- Die Jars Z.B. in einem Unterverzeichnis 'lib' im Projektverzeichnis speichern 

### In Classpath eintragen

- Rechts auf den Projektnamen clicken: 
- im Contextmenu: Build Path/Configure Build Path...
- Im neuen Fenster: auf dem Tab 'Libraries' den Eintrag 'Classpath' wählen 
- Mit Schaltfläche 'Add Jars' die Jar-Datei finden

> Im neuen Eintrag (Jar-Datei unter Build Path) kann man optional auch Javadoc und Sourcecode Jars angeben
 
