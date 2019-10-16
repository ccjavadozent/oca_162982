 # Aufgabe 'Interfaces - default'
 
 Gegeben ist:
 
		public interface Sum {
		   int add(int a, int b);
		}
		
		public interface Container {
		   /* 
		    * Speichert x im Container.
		    * Liefert die neue Containergröße zurück.
		    */
		   int add(int x);
		   
		   
		   /*
		    * Überladen. 
		    * Speichert im Container x, danach y.
		    * Liefert die neue Containergröße zurück.
		    */
		   int add(int x, int y);
		}	
		
###### A1.
Definieren Sie die Methode `add` im Interface `Sum` als default-Methode. In dieser Standardrealisierung berechnet die Methode die Summe von a und b und liefert sie zurück. Testen Sie die Methode.

###### A2.
Definieren Sie die Methode `add(int, int)` im Interface `Container` als default-Methode.  

###### A3.
Realiseren Sie eine Klasse, die die beiden Interfaces implementiert. Die beiden gegebenen Interfaces dürfen nicht voneinader erben.
