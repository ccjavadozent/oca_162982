package aufgaben.lambdas;

import java.util.ArrayList;
import java.util.List;

interface ListPair {
	List<Integer> accept(List<Integer> list1, List<Integer> list2);   
}


public class AufgabenLambdas_A3 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		// 2-3 Integer zur list1 hinzufügen...
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<>();
		// 2-3 Integer zur lisr2 hinzufügen...
		list2.add(4);
		list2.add(5);
		
//		class Tmp1 implements ListPair {
//			public List<Integer> accept(List<Integer> list1, List<Integer> list2) {
//				System.out.println(list1);
//				return null;
//			}
//		}
//		class Tmp2 implements ListPair {
//			public List<Integer> accept(List<Integer> listA, List<Integer> listB) {
//				List<Integer> listBack = new ArrayList<>();
//				listBack.addAll(listA);
//				listBack.addAll(listB);
//				return listBack;
//			}
//		}
		
		ListPair combiner = (listA, listB) -> {
			List<Integer> listBack = new ArrayList<>();
			listBack.addAll(listA);
			listBack.addAll(listB);
			
//			listBack.addAll(list1); // Zugriff auf Variable der main-Methode. hier nicht nötig 
//			listBack.addAll(list2);
			return listBack;
		}; 
		
		List<Integer> list3 = combiner.accept(list1, list2);
		//list3 hat alle Elemente aus list1 und list2
		
		System.out.println(list3); // 2, 3, 4, 5 

		
		List<Integer> listTmp = new ArrayList<>();
		listTmp.add(-7);
		listTmp.add(-8);
		
		list3 = combiner.accept(list1, listTmp);
		
		System.out.println( list3 ); //
		
	}

}
