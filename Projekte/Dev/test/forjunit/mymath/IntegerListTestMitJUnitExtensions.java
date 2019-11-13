package forjunit.mymath;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import junit.extensions.ExtensionEmptyList;



public class IntegerListTestMitJUnitExtensions {
	
	@Test
	@ExtendWith(ExtensionEmptyList.class)
	void testAdd(IntegerList list) {
		
		assertTrue( list.isEmpty() );
		
		list.add(12);
		
		assertEquals(1, list.size());
	}

}
