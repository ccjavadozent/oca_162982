package aufgabe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AufgabeArrayList {

	private static List<Integer> getZahlenVon10Bis80() {
		List<Integer> list = new ArrayList<>();
		for (int value = 10; value <= 80; value += 10) {
			list.add(value);
		}
		return list;
	}

	private static List<Integer> createRandomList(int size, int min, int max) {

		ArrayList<Integer> list = new ArrayList<>();

		Random random = new Random();
		for (int i = 0; i < size; i++) {
			int x = random.nextInt(max - min + 1) + min;
			list.add(x);
		}

		return list;
	}

	public static void main(String[] args) {
//		a1();
//		a2();
//		a3();
//		a4();
//		a5();
//		a6();
//		a7();
//		a8();
//		a9();
		// A10 ist in AufgabeSportart.java gelöst
		// A11 im Unterricht gelöst
		a12();
	}

	static void a12() {
		System.out.println("*** A12");

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { -7, -5 };
		int[] a3 = { 101, 202, 303 };

		List<int[]> list = new ArrayList<>();

		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		for(int[] element : list) {
			System.out.println( Arrays.toString(element) );
		}
	}

	static void a9() {
		System.out.println("*** A9");

		List<Integer> list = createRandomList(10, 0, 50);

		System.out.println("list = " + list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				list.set(i, 0);
			}
		}
		System.out.println("list = " + list);
	}

	static void a8() {
		System.out.println("*** A8");

		List<Integer> list = createRandomList(10, 0, 50);

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("i = %d, list = %s %n", i, list);

			if (list.get(i) % 2 == 0) {
				System.out.println("Enttferne gleich das Element " + i);
				list.remove(i);
				i--;
			}
		}

		System.out.println("Nach der Schliefe: " + list);
	}

	static void a7() {
		System.out.println("*** A7");

		List<Integer> list = createRandomList(10, 0, 50);

		Collections.sort(list);

		System.out.println("list: " + list);

		int index = Collections.binarySearch(list, 12);

		System.out.println("index of 12: " + index);
	}

	static void a6() {
		System.out.println("*** A6");

		List<Integer> list = createRandomList(10, 10, 15);
		System.out.println("list: " + list);

		int index = list.indexOf(12);
		System.out.println("indexOf 12: " + index);
	}

	static void a5() {
		System.out.println("*** A5");

		List<Integer> list = createRandomList(20, -100, 100);
		System.out.println("list = " + list);

		Collections.sort(list);

		System.out.println("list = " + list);
	}

	static void a4() {
		System.out.println("*** A4");

		List<Integer> list = getZahlenVon10Bis80();

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}

	static void a3() {
		System.out.println("*** A3");

		List<Integer> list = getZahlenVon10Bis80();

		System.out.println(list);
		for (int i = 1; i < list.size(); i += 2) {
			System.out.println(list.get(i));
		}
	}

	static void a2() {
		System.out.println("*** A2");
		Collection<String> wochentage = new ArrayList<>();
//		List<String> wochentage = new ArrayList<>();
//		ArrayList<String> wochentage = new ArrayList<>();

		wochentage.add("mo");
		wochentage.add("di");
		wochentage.add("mi");
		wochentage.add("do");
		wochentage.add("fr");

		for (String tag : wochentage) {
			System.out.println(tag);
		}
	}

	static void a1() {
		System.out.println("*** A1");

		List<Integer> list = createRandomList(20, -100, 100);
		// System.out.println("list: " + list);

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%02d. %3d %n", i, list.get(i));
		}

	}

}
