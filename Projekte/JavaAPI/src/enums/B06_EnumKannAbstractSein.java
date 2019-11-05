package enums;

enum Namen implements Runnable { // Runnable deklariert eine abstrakte Methode 'run()'
	TOM {
		@Override
		String displayName() {
			return "Tom";
		}
		
		@Override
		public void run() {
			System.out.println(displayName() + " läuft");
		}
	},
	JERRY {
		@Override
		String displayName() {
			return name();
		}
		
		@Override
		public void run() {
			System.out.println("Jerry rennt");
		}
	};

	
	
	abstract String displayName(); // muss für jede Konstante realisiert werden
	
	void test() {
		displayName();
		run();
	}
	
} // end of Namen


public class B06_EnumKannAbstractSein {

	public static void main(String[] args) {

	}

}
