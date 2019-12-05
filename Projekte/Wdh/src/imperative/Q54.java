package imperative;

public class Q54 {

	public static void main(String[] args) {
		if(false) {
			System.out.println("a");
		}
		
//		while(true) ;
//		System.out.println("x");
		
		while(true) break;
		System.out.println("x");
		
		for(;true;) break;
		System.out.println("x");
		
		for(;true;) throw new RuntimeException();
		System.out.println("x"); // unreachable code

	} // 

	
	static int get() {
		
		int x = 3;
		
		switch (x) {
			case 1: return 22;
//			default: return 7;
			default: throw new RuntimeException();
		}
	}
	
}
