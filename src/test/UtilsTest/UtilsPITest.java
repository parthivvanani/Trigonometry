package test.UtilsTest;

import trigo.Utils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * Test class to test the Utils class of PI functions.
 */

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 16 Nov 2020
 *
 */

@TestInstance(Lifecycle.PER_CLASS)
//construct UtilsPITest class
class UtilsPITest {

	@Test
	@DisplayName("Testing Utils.PI")
	final void testPI() {
		double expected = Math.PI;
		double result = Utils.PI;
		double delta = 0.00000001d;
		assertEquals(expected, result, delta, "Incorrect value of PI");
	}

}
