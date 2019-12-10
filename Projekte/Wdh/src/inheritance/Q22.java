package inheritance;

import java.util.ArrayList;

class C1 {
	void m() {}
}

abstract class C2 extends C1 {
	abstract void m() ;
}

class C3 extends C2 {
	void m() {  }
}


public class Q22 {

	public static void main(String[] args) {
		
		Object obj = new ArrayList<>();

		String s = obj.toString();
		
		System.out.println( s );
		
	}

}
