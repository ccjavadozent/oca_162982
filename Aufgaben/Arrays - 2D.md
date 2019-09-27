# Aufgabe 'Arrays - 2D'

- Bitte definieren Sie eine Methode 'createArray', die ein zweideminseonales int-Array erzeugt. Die neue Methode soll aus der main-Methode folgendermassen aufgerufen werden koennen:

		int[][] arr = createArray(4, 5);

> In diesem Beispiel wird ein 2D-Array 4 x 5 erzeugt.


- Bitte geben Sie das erzeugte Array aus. Dafür definieren Sie eine weitere Methode 'printArray', an die Sie das Array übergeben. Für das Array aus dem Beispiel soll die Konsolenausgabe so aussehen:

        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0

- Speichern Sie in dem Array auf der Stelle (1,1) den Wert 5 und geben Sie das Array erneut auf dem Bildschirm aus.


- Belegen Sie alle Positionen in dem Array mit dem Wert 2. Benutzen Sie dazu die verschachtelten for-Schleifen.


- Bitte überladen Sie die Methode 'createArray' durch eine weitere Methode, die ein zweideminseonales int-Array erzeugt und mit dem gewünschten Wert belegt. Die neue Methode soll aus der main-Methode folgendermassen aufgerufen werden koennen:

        int[][] arr = createArray(4, 5, 2);

> In diesem Beispiel wird ein 2D-Array 4 x 5 erzeugt, alle Elemente haben den Wert 2:

        2 2 2 2 2
        2 2 2 2 2
        2 2 2 2 2
        2 2 2 2 2

- Optional: ändern Sie die Methode 'printArray' so, dass die ausgegebenen Elemente durch Kommas getrennt sind.
Z. B. für ein Array 4x5, das mit 0-Werten belegt ist:

        0, 0, 0, 0, 0
        0, 0, 0, 0, 0
        0, 0, 0, 0, 0
        0, 0, 0, 0, 0


- Optional. Definieren Sie bitte in einer neuen Klasse die Methode 'createBorderedArray', die ein neues 2D-char-Array erzeugt, das die Dimensionen 'dim' X 'dim' hat. Das Array ist mit Leerzeichen gefuellt, nur der Rand besteht aus dem Zeichen 'ch'. 
Wird ein Array z.B. durch den Aufruf createBorderedArray(5, 'X') erzeugt und dann ausgegeben, sieht die Ausgabe etwa so aus: 

        XXXXX
        X   X
        X   X
        X   X
        XXXXX


*Testen Sie die erstellten Methoden*