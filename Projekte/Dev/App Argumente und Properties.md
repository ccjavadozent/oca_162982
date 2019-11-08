# Argumete und Properties einer App


## Argumente für das String[] der main-Methode übergeben

#### in der Console:

	java -cp bin zoo.Zoo Rex Woffy Speedy  

#### unter Eclipse:

im Menü unter 'Run/Run Configurations.../Java Application' die Main-Klasse finden und dann im Tab 'Arguments' unter 'Program arguments' die Argumente eintragen

## Properties für die Anwendung (nicht in der Prüfung)
 
#### in der Console:

	java -cp bin -Duser-name=Tom zoo.Zoo  
	java -cp bin -Duser-name=Tom -Duser.day=Freitag zoo.Zoo  
	java -cp bin -Duser-name="Tom Cruise" zoo.Zoo  

#### unter Eclipse:

im Menü unter 'Run/Run Configurations.../Java Application' die Main-Klasse finden und dann im Tab 'Arguments' unter 'Vm arguments' die Argumente eintragen

> Tipp: Klasse java.util.Properties kann auch solche Properties aus einer Datei laden.

