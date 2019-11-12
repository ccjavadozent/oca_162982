package forjunit.mymath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerListTest {
	
	IntegerList instance;
	
	@BeforeAll
	static void setupAll() {
		System.out.println("Vorbereitungen für alle Tests der Klasse IntegerListTest");
	}
	
	@AfterAll
	static void clearupAll() {
		System.out.println("Aufräumen nach allen Tests der Klasse IntegerListTest");
	}

	@BeforeEach
	void setupEach() {
		System.out.println("Vorbereitungen vor JEDEM Test der Klasse IntegerListTest");
		
		instance = new IntegerList();
		instance.add(1);
		instance.add(2);
		instance.add(3);
		instance.add(-6);
	}
	
	@AfterEach
	void clearupEach() {
		System.out.println("Aufräumen nach JEDEM Test der Klasse IntegerListTest");
	}
	

	@Test
	void testSum() {
		System.out.println("*** testSum");
		
		int expected = 0;
		int actual = instance.sum();
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testSize() {
		System.out.println("*** testSize");
		
		assertEquals(4, instance.size());
	}
	
}
