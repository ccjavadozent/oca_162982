# Aufgabe 'Wrapper - Zahlen laden'


###### A1.
Erstellen Sie manuell (mit einem Texteditor) eine Textdatei 'zahlen.txt' die in jeder Zeile eine ganze Zahl beinhaltet. Jede Zeile mit einer Zahl darf keine weiteren Zeichen beinhalten. Außer Zeilen mit Zahlen darf die Datei nur noch Kommentarzeilen beinhalten, die mit dem Symbol '#' starten. So z.B. kann die Datei aussehen:

		# Kommentarzeile
		22
		-3007
		8
		# eine weitere Kommentarzeile
		-23456
		-17
		55

###### A2.
Gegeben ist folgender Code, mit dem der Text aus einer Datei in ein `StringBuilder` geladen werden kann:

		String pathToFile = "C:\\hier\\kommt\\der\\Pfad\\zu\\der\\Datei.txt";
		try(BufferedReader in = new BufferedReader(new FileReader(pathToFile))) {
			
			StringBuilder sb = new StringBuilder();
			String line;
			while( (line = in.readLine()) != null ) {
				sb.append(line).append("\n");
			}
			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Datei nicht lesen", e);
		}

Verwenden Sie den Code um eine Methode `loadArrayFromFile` zu definieren, die eine Textdatei lesen und die Zahlen aus der Datei in einer ArrayList zurück liefern kann:

		String pathToFile = "C:\\hier\\kommt\\der\\Pfad\\zu\\der\\zahlen.txt";
		ArrayList<Integer> zahlen = loadArrayFromFile(pathToFile);

