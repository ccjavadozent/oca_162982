package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * In der Prüfung: nur die Klasse ArrayList, keine weiteren Collections
 */
public class B06_Array_asList_toArray {

	public static void main(String[] args) {

		/*
		 * List<T> Arrays.asList(T... arr)
		 * 
		 *	Die asList liefert an das Array gekoppelte Liste: jede Änderung im Array spiegelt sich auf die Liste ab und umgekehrt 
		 *	Die Größe der Liste kann nicht geändert werden.
		 *  
		 * 
		 */
		Integer[] arr = { 1, 2, 3 };
		List<Integer> list1 = Arrays.asList(arr);
		
		System.out.println("list1: " + list1); // [1, 2, 3]
		arr[1] = -77;
		System.out.println("list1: " + list1); // [1, -77, 3]
		list1.set(2, 333);
		System.out.println("list1: " + list1); // [1, -77, 333]
		System.out.println("arr: " + Arrays.toString(arr)); // [1, -77, 333]
		
		
		
		List<Integer> list2 = Arrays.asList(1, 2, 3); // Autoboxing
		// list2.add(444); // Exception
		
		List<Integer> list3 = new ArrayList<>(list2); // Entkoppelt vom Array
		list3.add(444);
		System.out.println("list3: " + list3); // [1, 2, 3, 444]
		
		/*
		 * Object[] toArray() 
		 */
		Object[] arr3 = list3.toArray(); // kein Integer[] !
		System.out.println("Typ von Objekt hinter arr3: " + arr3.getClass().getName());
		
		// Integer[] tmp = (Integer[]) arr3; // ClassCastException
		
		/*
		 * T[] toArray(T[] a)
		 */
		Object[] arr4 = list3.toArray(new Object[0]);
		Integer[] arr5 = list3.toArray(new Integer[0]);
		
		for (Integer value : arr5) {
			System.out.println( value.intValue() );
		}
	}

}
