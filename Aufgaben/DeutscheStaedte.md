#Aufgabe 'Deutsche Städte'

#### A1.
Eine neue Java-Lösung starten (ein neues Projekt oder ein neues Package im Projekt für Aufgaben).


#### A2.

Gegeben ist die URL:

[https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland]( https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland )


Laden Sie den HTML-Text von der Internetseite in den Arbeitsspeicher (in ein String oder in ein StringBuilder).


> Tipp zum Lesen:

		java.net.URL url = new java.net.URL( hier die Url );   
		InputStream is = url.openStream();   
		Reader r = new InputStreamReader(is);   
		try(BufferedReader in = new BufferedReader( r )) {
			
			StringBuilder sb = new StringBuilder();
			String line;
			while( (line = in.readLine()) != null ) {
				sb.append(line).append("\n");
			}
			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
		}

#### A3.
Parsen Sie den Text mit den Städte-Daten und finden Sie zu jeder Stadt aus der Tabelle:
 
    - den Stadnamen
    - die Einwohnerzahl (nur die frischesten Daten)
    - das Bundesland (den Namen)

>Tipp: Sie können eine externe Lösung einsetzen. S. Jsoup-Bibliothek: [http://jsoup.org/]( http://jsoup.org/ )

#### A4.
Erstellen Sie eine Liste (ArrayList) mit den Elementen vom Typ "Stadt" und geben Sie die Liste aus. 


#### A5.
Optional. Integrieren Sie die Lösung in eine Swing- oder JavaFX-Anwendung, die folgendes hat:

    - Button "Laden" (Aufgabe 2)
    - Button "Parsen" (Aufgabe 3 und 4)
