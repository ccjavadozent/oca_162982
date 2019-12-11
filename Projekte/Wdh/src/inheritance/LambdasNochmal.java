package inheritance;


interface I22 {
	int get(int a, int b);
}


class I22Impl implements I22 {
	public int get(int a, int b) { 
		return 1; 
	}
}

public class LambdasNochmal {

	public static void main(String[] args) {

		I22 i1 = (int a, int b) -> { 
			return 1; 
		};
		
		
//		I22 i2 = (a, b) -> return 1;
		I22 i2 = (a, b) -> 1;
//		I22 i3 = a, b -> 1;
		
	} // end of main

}
