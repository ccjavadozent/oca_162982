package exceptions;

public class WdhWerfenUndAbfangen {

	static void m1() {
		System.out.print("a ");
		System.out.println(5/0);
		System.out.print("b ");
	}
	
	static void m2() {
		System.out.print("c ");
		try {
			m1();
		} catch (Exception e) {
			System.out.print("e2 ");
		}
		System.out.print("d ");
	}
	
	static void m3() {
		System.out.print("e ");
		m2();
		System.out.print("f ");
	}
	
	
	public static void main(String[] args) {
		try {
			m3();
		} catch (Exception e) {
			System.out.println("e4");
		}
	}

}

/*
 	Skizze der Methodenaufrufe (ohne try-catch-Blöcke)
 
	main {
		m3 {
			System.out.print("e ");
			m2 {
				System.out.print("c ");
				m1 {
					System.out.print("a ");
					System.out.println(5/0);
					System.out.print("b ");
				}
				System.out.print("d ");
			}
			System.out.print("f ");
		}
	}

*/