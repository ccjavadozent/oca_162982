package kontrollstrukturen;

public class DoWhileSchleife {

	public static void main(String[] args) {
		
//		Endlose Schleife:
//		
//		do {
//			System.out.println("laufe...");
//			
//		} while(true); // <- Semikolon muss sein!

		
		int x = 3;
		
		do {
			System.out.println("x = " + ++x);
		} while(x < 5);
		
		
	}

}
