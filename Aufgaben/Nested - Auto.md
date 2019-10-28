# Aufgabe 'Innere Klassen - Autos'

- Definieren Sie eine Klasse "Rennwagen", die eine innere Klasse "Motor" und eine innere Klasse "Fahrer" beinhaltet.


- Erstellen Sie eine Klasse "Test" mit folgender main-Methode:

		public static void main(String... args) {
		    Rennwagen rw = new Rennwagen("Mercedes");
		
		    Rennwagen .Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
		    rw.setFahrer(f);
		
		    Rennwagen.Motor m = rw.getMotor();
		
		    System.out.println(rw);		//Zeile A
		    System.out.println(m);		//Zeile B
		}

   
- Die Zeile A soll folgende Ausgabe erzeugen:

        Rennwagen Mercedes. Fahrer: M. Schuhmacher

	
- Die Zeile B soll folgende Ausgabe erzeugen:

        Motor Type1 aus dem Rennwagen Mercedes

