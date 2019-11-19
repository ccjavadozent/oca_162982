package personen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testNewInstance() {
		
		Person instance = new Person("Tom");
		
		String expected = "Tom";
		
		assertEquals(expected, instance.getName());
		
	}

}
