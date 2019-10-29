package functional;

public class WdhLambdaSyntax {
	
	interface GetString {
		String get();
	}

	interface UseString {
		void use(String s);
	}
	
	class UseStringImpl implements UseString {
		public void use(String s) {
			new String("hallo");
		}
//		public void use(String s) {
//			"hallo";
//		}
	}
	
	public static void main(String[] args) {
		
		GetString g1 = () -> { return new String("hallo"); };
		GetString g2 = () -> new String("hallo");
		GetString g3 = () -> { return "hallo"; };
		GetString g4 = () -> "hallo";

		UseString u1 = (String s) -> { new String("hallo"); };
		UseString u2 = s -> { new String("hallo"); };
		UseString u3 = s -> new String("hallo");
//		UseString u4 = s -> "hallo";
		
		class PrintTwice implements UseString {
			public void use(String s) {
				System.out.print(s);
				System.out.print(s);
			}
		}

		UseString u5 = new PrintTwice();
		u5.use("di");
		
		UseString u6 = s -> {
			System.out.print(s); 
			System.out.print(s);
		};
		
		
	}

}
