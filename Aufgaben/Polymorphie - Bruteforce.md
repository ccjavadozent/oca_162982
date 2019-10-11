# Aufgabe 'Polymorphismus - Bruteforce'

> Achtung! Bei der Lösung dürfen/sollten Sie die vorgegebenen Algorithmen und Klassen nach Ihren Wünschen modifizieren 

- Gegeben ist folgende Klasse:

		public class Safe {
			private char[] password;
			
			public Safe(char[] password) {
				...
			}
			
			public boolean open(char[] passwordToTry) {
				...
			}
		}

Mit der Klasse simuliert man einen geschlossenen Tresor, zu dem das Passwort geknackt werden muss. Zur Vereinfachung darf davon ausgegangen werden, dass das Passwort __aus unterschiedlichen englischen Kleinbuchstaben besteht und die Länge 4 hat__. Die Methode `open` vergleicht das Argument `passwordToTry` mit dem Attribut `password` und liefert `true` wenn die beiden Arrays nach ihren Inhalten gleich sind. 

> Erzeugen Sie ein Safe-Objekt, setzen Sie dabei ein einfaches Passwort ein und versuchen Sie im Weiteren das Passwort mit Bruteforce zu knacken. Überlegen Sie sich eine Lösung mit folgenden Vorgaben  


- Unterschiedliche Bruteforce-Strategien sollen in der Lösung einfach austauschbar sein.


- Jede Bruteforce-Strategie kann jeden weiteren Versuch protokollieren (loggen). Dabei werden das nächste Passwort und die Nummer des Versuches geloggt. 


- Keine Bruteforce-Strategie darf festlegen, wie das Protokollieren aussieht. Eine weitere Komponente wird damit beauftragt.


- Unterschiedliche Logging-Strategien sollen in der Lösung einfach austauschbar sein.


- Um eine einfache Bruteforce-Strategie zu realisieren, können Sie sich an folgende Lösung orientieren:

		public static void permutationByHeap(char[] arr, int pointer) {
			
	        if (pointer == 1) {
	        	System.out.println("Kombination: " + java.util.Arrays.toString(arr));
	            return;
	        }
	
	        for (int i = 0; i < pointer - 1; i++) {
	        	permutationByHeap(arr, pointer - 1);
	
	            if (pointer % 2 == 0) {
	                char tmp = arr[pointer - 1];
	                arr[pointer - 1] = arr[i];
	                arr[i] = tmp;
	            } else {
	                char tmp = arr[pointer - 1];
	                arr[pointer - 1] = arr[0];
	                arr[0] = tmp;
	            }
	        }
	
	        permutationByHeap(arr, pointer - 1);
	    }
	    
	    public static void main(String[] args) {
	    	char[] arr = { 'a', 'b', 'c' };
	    	permutationByHeap(arr, arr.length);
	    }
	    
>  https://en.wikipedia.org/wiki/Heap%27s_algorithm
	    