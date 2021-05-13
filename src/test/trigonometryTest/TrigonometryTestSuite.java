/**
 * 
 */
package test.trigonometryTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 15 Nov 2020
 */


@RunWith(JUnitPlatform.class)
@SelectClasses( {TrigonometrySinTest.class, TrigonometryCosTest.class, TrigonometryTanTest.class})
@DisplayName("Trigonometry Test Suite")
//construct TrigonometryTestSuite class
class TrigonometryTestSuite {

	@Test
	final void test() {
//		fail("Not yet implemented"); // TODO
	}

}
