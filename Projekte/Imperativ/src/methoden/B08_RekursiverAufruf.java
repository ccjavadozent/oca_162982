package methoden;

/*

main(args) {


      main(args) {
      
      	   main(args) {
      	   	
      	   		usw...
      	   
      	   }
      
      }

}

*/

public class B08_RekursiverAufruf {

	public static void main(String[] args) {

		// main(args); // java.lang.StackOverflowError
		
		printAndIncrement(1);
		
	}

	
	static void printAndIncrement(int x) {
		System.out.println(x);
		
//		x++;
		
		if(x++ == 3) {
			return;
		}
		
		printAndIncrement(x);
	}
	
}

