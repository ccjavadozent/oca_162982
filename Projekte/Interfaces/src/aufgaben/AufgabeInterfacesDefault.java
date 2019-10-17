package aufgaben;

/*ist nicht public*/ interface Sum {
   default int add(int a, int b) {
	   return a + b;
   }
}
	
/*ist nicht public*/ interface Container {
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
   default int add(int x, int y) {
	   add(x);
	   return add(y);
   }
}	



class MyOperation implements Sum {
	
}


/*
 * Keine sinnvolle Realisierung zu erkennen
 */
class MySumContainer implements Sum, Container {
	public int add(int param) {
		return 0;
	}
	
	public int add(int x, int y) { 
		return Container.super.add(x, y); // Test des Aufrufes
	}
}



public class AufgabeInterfacesDefault {

	public static void main(String[] args) {

		System.out.println( new MyOperation().add(2, 3) );
		
	}

}
