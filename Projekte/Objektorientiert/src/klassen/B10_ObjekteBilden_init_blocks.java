package klassen;

/*
 *  - init-Blöcke werden vom Compiler in jeden Konstruktor automatisch (intelligent) integriert
 *  
 *  - Der Compiler sorgt (intelligent) dafür, dass in jedem Konstruktor als erstes ein 
 *         anderer Konstruktor mit this oder super aufgerufen wird 
 *         
 *  - Der Compiler sorgt (intelligent) dafür, dass in jedem Konstruktor alle Attribute initialisiert wurden 
 */


class K1 {
	int x = -172, y;
	
	/*
	 * So sieht der default-Constructor aus:
	 * 
	 * K1() {
	 * 	super();
	 * 	this.x = -172;
	 *  // hier alle init-Blöcke integriert 
	 *  this.y = 0;
	 * }
	 */
	
	
	// init-Block (nicht static!)
	{
		System.out.println("K1 / init 1. x = " + this.x);
	}
	
	// noch ein init-Block (nicht static!)
	{
		System.out.println("K1 / init 2");
	}
	
}

class K2 {
	int x, y;

	K2() {
		// super();     <- generiert vom Compiler
		// this.x = 0;	<- generiert vom Compiler
		// this.y = 0;	<- generiert vom Compiler
	}
}



class K3 {
	int x, y = 13;
	
	K3() {
		// super();     <- generiert vom Compiler
		// hier init-Block integriert
		this.x = -2;
		// this.y = 13;	<- generiert vom Compiler
	}
	
	K3(int x) {
		// super();     <- generiert vom Compiler
		// hier init-Block integriert
		// this.y = 13;	<- generiert vom Compiler
		System.out.println("y = " + y);
		this.x = x;
	}
	
	K3(int x, int y) {
		this(x); // Nichts mehr vom Compiler generiert: alles nötige wird in this(int) schon gemacht
	}
	
	
	
	{
		System.out.println("K3 / init ");
	}
	
} // end of K3





public class B10_ObjekteBilden_init_blocks {

	public static void main(String[] args) {

		System.out.println("** K1");
		new K1();
		System.out.println("** noch ein K1");
		new K1();
		
		System.out.println("** K3");
		new K3();
		
		System.out.println("** noch ein K3");
		new K3(2);
		
		System.out.println("** noch ein weiteres K3");
		new K3(2, 3);
	}

}
