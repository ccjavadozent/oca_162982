package tiere;

public class Tier {

	private String name;

	public Tier(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

//	static String basicName = "Bello";
//	
//	public static void main(String[] args) {
//		
//		Tier t = new Tier("Tom");
//		
//		foo(t);
//		
//		String s = t.name;
//		
//		s = s.toUpperCase();
//		
//		System.out.println(s); // ? 
//	}
//	
//	static void foo(Tier t) {
//		t.name = "Jerry";
//	}
	
}
