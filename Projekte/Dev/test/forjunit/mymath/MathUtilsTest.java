package forjunit.mymath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MathUtilsTest {

	@Test
	void testAdd() {
		
		int expected = 5; // mit einem Taschenrechner
		
		int actual = MathUtils.add(2, 3);
		
//		assertEquals(expected, actual); // geht auch
		
		assertEquals(expected, actual, "2 + 3 muss doch 5 ergeben");
	}

	
	@Test
	void testAddfailOnIntegerOverflow() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			MathUtils.add(1, Integer.MAX_VALUE);
		});
		
	}
	
	@Test
	void testIsInteger() {
		
		boolean expected = false;
		boolean actual = MathUtils.isInteger("hallo");
		assertEquals(expected, actual);
		
		actual = MathUtils.isInteger("10");
		assertEquals(true, actual);
		
		actual = MathUtils.isInteger("+1213");
		assertEquals(true, actual);
	}
	
	
	@ParameterizedTest(name = "Test Nr. {index}. Text zum überprüfen: {0}, Erwartet: {1} ")
	@CsvSource( {
		"10, true",
		"-10, true",
		"+10, true",
		"hallo, false",
	} )
	void parameterizedTestIsInteger(String zahlAlsText, boolean expected) {
		boolean actual = MathUtils.isInteger(zahlAlsText);
		assertEquals(expected, actual);
	}
	
}
