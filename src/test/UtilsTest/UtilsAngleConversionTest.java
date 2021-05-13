package test.UtilsTest;

import trigo.Utils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test class to test the Utils class functions like conversions.
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
//construct UtilsAngleConversionTest class
class UtilsAngleConversionTest {

	@ParameterizedTest
	@MethodSource("provideAnglesInDegree")
	@DisplayName("Testing toDegree Method")
	final void testToDegree(double angleRad) {
		double expected = Math.toDegrees(angleRad);
		double result = Utils.toDegree(angleRad);
		double delta = 0.001;
		assertEquals(expected, result, delta, "Failed to convert " + angleRad + " radian to degree" );		
	}
	
	public static Stream<Arguments> provideAnglesInDegree() {
		return Stream.of(
					Arguments.of(0),
					Arguments.of(30),
					Arguments.of(60),
					Arguments.of(180),
					Arguments.of(360),
					Arguments.of(1070),
					Arguments.of(Math.PI),
					Arguments.of(Math.PI/180)
				);
	}
	
	@ParameterizedTest
	@MethodSource("provideAnglesInRadian")
	@DisplayName("Testing toRadian Method")
	final void testToRadian(double angleDeg) {
		double expected = Math.toDegrees(angleDeg);
		double result = Utils.toDegree(angleDeg);
		double delta = 0.001;
		assertEquals(expected, result, delta, "Failed to convert " + angleDeg + " degree to radia" );		
	}
	
	public static Stream<Arguments> provideAnglesInRadian() {
		return Stream.of(
					Arguments.of(0.523),
					Arguments.of(0.785),
					Arguments.of(1.047),
					Arguments.of(1.571),
					Arguments.of(Math.PI),
					Arguments.of(6.283),
					Arguments.of(Math.PI),
					Arguments.of(Math.PI/180)
				);
	}
}
