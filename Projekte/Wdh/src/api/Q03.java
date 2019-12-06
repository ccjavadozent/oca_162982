package api;

import java.util.ArrayList;
import java.util.List;

public class Q03 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(2);
		
		System.out.println(list.size()); // 0
		
		list.add(1);
		list.add(1);

		list.add(1); 
		
		System.out.println(list.size()); // 3

	}

}
