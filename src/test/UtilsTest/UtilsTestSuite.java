package test.UtilsTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 14 Nov 2020
 *
 */

@RunWith(JUnitPlatform.class)
@SelectClasses( {UtilsTest.class,  UtilsPITest.class, UtilsAngleConversionTest.class})
@DisplayName("Utils Test Suite")
//construct UtilsTestSuite class
class UtilsTestSuite {

	@Test
	final void test() {
//		fail("Not yet implemented"); // TODO
	}

}
