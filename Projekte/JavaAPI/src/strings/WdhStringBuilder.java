package strings;

public class WdhStringBuilder {

	public static void main(String[] args) {

		String s1 = "31.10";
		s1.concat(" ist ").concat("frei");
		
		System.out.println(s1); // 31.10
		
		
		StringBuilder sb1 = new StringBuilder("31.10");
		sb1.append(" ist ").append("frei");
		
		System.out.println(sb1); // 31.10 ist frei

		
		
		
		
		String s2 = "01";
		s2 = s2.concat(".").concat("11");
		
		System.out.println(s2); // 01.11
		
		
		StringBuilder sb2 = new StringBuilder("01");
		sb2 = sb2.append(".").append("11");
		
		System.out.println(sb2); // 01.11

	} // end of main
}
