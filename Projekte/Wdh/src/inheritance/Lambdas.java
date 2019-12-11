package inheritance;

@FunctionalInterface
interface Tankbar {
	void tanken();
}

//class A1 implements Tankbar { }

//class A2 implements Tankbar {
//	void tanken() {}
//}

class A2 implements Tankbar {
	public void tanken() {
		System.out.println("tanken");
	}
}


public class Lambdas {

	public static void main(String[] args) {

//		mit einer anonymen Klasse:
		Tankbar t1 = new Tankbar() { 
			public void tanken() {
				System.out.println("tanken");
			}
		};
		
		Tankbar t2 = () -> {
			System.out.println("tanken");
		};
		
		
		Tankbar t3 = () -> System.out.println("tanken");
		
		System.out.println( "main" );
		
		new String("");
	}

}
