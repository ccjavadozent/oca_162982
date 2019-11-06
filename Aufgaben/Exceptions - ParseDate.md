# Aufgabe 'Exceptions - Parse Date'

- Lassen Sie bitte den User in die Console ein Datum als String eingeben:
  
		String dateAsString = getUserInput();

> Tipp: java.io.Console oder java.util.Scanner zum Lesen der User-Eingaben können eingesetzt werden


- Parsen Sie bitte den String zum `java.time.LocalDate` (Java 8) oder `java.util.Date` (Java 6). Bitte die Exception bei ungültigen User-Eingaben sinnvoll behandeln. Erlauben Sie bitte dabei dem User die Eingaben zu wiederholen.

- Wenn das Parsen erfolgreich war, geben Sie das Datum aus.


- Optional. Wenn das Parsen erfolgreich war, geben Sie das Datum in deutsch und englisch aus.

> Tipp: Benutzen Sie bitte für die Formattierung die Klasse `java.time.format.DateTimeFormatter` (Java 8) oder `java.text.DateFormat` (Java 6)

