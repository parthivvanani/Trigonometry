package test.trigonometryTest;

import trigo.Trigonometry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test class to test the Trigonometry class cosine functions for different quadrants. 
 */

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 15 Nov 2020
 *
 */

@TestInstance(Lifecycle.PER_CLASS)
// construct TrigonometryCosTest class
class TrigonometryCosTest {
	
	/**
	 * Test method for {@link Trigonometry#cos(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant1")
	@DisplayName("Testing cos for quadrant 1")
	final void testCosine_Quadrant1(double angle) {
		double result = Trigonometry.cos(angle);
		double expected = Math.cos(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	
	
	/**
	 * Test method for {@link Trigonometry#cos(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant2")
	@DisplayName("Testing cos for quadrant 2")
	final void testCosine_Quadrant2(double angle) {
		double result = Trigonometry.cos(angle);
		double expected = Math.cos(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
		

	/**
	 * Test method for {@link Trigonometry#cos(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant3")
	@DisplayName("Testing cos for quadrant 3")
	final void testCosine_Quadrant3(double angle) {
		double result = Trigonometry.cos(angle);
		double expected = Math.cos(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}


	/**
	 * Test method for {@link Trigonometry#cos(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForQuadrant4")
	@DisplayName("Testing cos for quadrant 4")
	final void testCosine_Quadrant4(double angle) {
		double result = Trigonometry.cos(angle);
		double expected = Math.cos(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	
	
	/**
	 * Test method for {@link Trigonometry#cos(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForAxis")
	@DisplayName("Testing cos at axis")
	final void testCosine_Axis(double angle) {
		double result = Trigonometry.cos(angle);
		double expected = Math.cos(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}
	
	
	/**
	 * Test method for {@link Trigonometry#cos(double)}.
	 */
	@ParameterizedTest
	@MethodSource("ValueProvider#provideAnglesForNormalization")
	@DisplayName("Testing cos for values greater than 2 * PI")
	final void testCosine_NormalizeAngle(double angle) {
		double result = Trigonometry.cos(angle);
		double expected = Math.cos(angle);
		double delta = 0.001;
		assertEquals(expected, result, delta, "\nFailed for angle: " + angle);
	}

	
}
