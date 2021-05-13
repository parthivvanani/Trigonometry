package test.trigonometryTest;

import trigo.Trigonometry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test class to test the Trigonometry class sine functions for different quadrants.
 */

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 14 Nov 2020
 *
 */

@TestInstance(Lifecycle.PER_CLASS)
//construct TrigonometrySinTest class
class TrigonometrySinTest {

	/**
	 * Test method for {@link Trigonometry#sin(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant1")
	@DisplayName("Testing sin for quadrant 1")
	final void testSine_Quadrant1(double angle) {
		double result = Trigonometry.sin(angle);
		double expected = Math.sin(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	

	
	
	/**
	 * Test method for {@link Trigonometry#sin(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant2")
	@DisplayName("Testing sin for quadrant 2")
	final void testSine_Quadrant2(double angle) {
		double result = Trigonometry.sin(angle);
		double expected = Math.sin(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	
	

	/**
	 * Test method for {@link Trigonometry#sin(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant3")
	@DisplayName("Testing sin for quadrant 3")
	final void testSine_Quadrant3(double angle) {
		double result = Trigonometry.sin(angle);
		double expected = Math.sin(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	

	
	/**
	 * Test method for {@link Trigonometry#sin(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant4")
	@DisplayName("Testing sin for quadrant 4")
	final void testSine_Quadrant4(double angle) {
		double result = Trigonometry.sin(angle);
		double expected = Math.sin(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	

	
	/**
	 * Test method for {@link Trigonometry#sin(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForAxis")
	@DisplayName("Testing sin at axis")
	final void testSine_Axis(double angle) {
		double result = Trigonometry.sin(angle);
		double expected = Math.sin(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	

	
	/**
	 * Test method for {@link Trigonometry#sin(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForNormalization")
	@DisplayName("Testing sin for values greater than 2 * PI")
	final void testSine_NormalizeAngle(double angle) {
		double result = Trigonometry.sin(angle);
		double expected = Math.sin(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}

}
