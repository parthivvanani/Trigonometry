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
 * Test class to test the Utils class functions.
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
//construct UtilsTest class
class UtilsTest {	
	
	/**
	 * Acceptable range of precision for testing power method
	 */
	public static final double delta = 0.00000000001;
	
	/**
	 * Returns the failure message
	 * @param value	The value for which test failed
	 * @param exponent The exponent for which test failed
	 * @return The error message
	 */
	private static String failureMessage(double value, int exponent) {
		return "\nFailed for value: " + value  + " and exponent: " + exponent;
	}
	
	/**
	 * Testing power method with constant Value 0.0 and positive exponents in range of 0 to {@link Integer#MAX_VALUE}
	 * @param value The Value
	 * @param exponent The Exponent
	 */
	@DisplayName("Testing power method constant value 0.0 and positive exponents")
	@ParameterizedTest
	@MethodSource("ValueZeroAndExponentPositive")
	final void testPower_ValueZeroAndExponentPositive(double value, int exponent) {
		double result = Utils.power(value, exponent);
		double expected = Math.pow(value, exponent);
		assertEquals(expected, result, 
				UtilsTest.delta, UtilsTest.failureMessage(value, exponent));
	}
	
	/**
	 * Agruments for {@link UtilsTest#testPower_ValueZeroAndExponentPositive(double, int)} for testing Value zero and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}.
	 * @return Arguments for Agruments for {@link UtilsTest#testPower_ValueZeroAndExponentPositive(double, int)}
	 */
	private static Stream<Arguments> ValueZeroAndExponentPositive() {
		return Stream.of(				 
				//Const value of 0.0 and variable values of exp from 0 to Int max
				Arguments.of(0.0, 0),
				Arguments.of(0.0, 1),
				Arguments.of(0.0, 10),
				Arguments.of(0.0, 2147483647),
				Arguments.of(0.0, Integer.MAX_VALUE)
			);
	}
	
	/**
	 * Testing the power method with constant Value greated than 0 and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}
	 * @param value The Value
	 * @param exponent The Exponent
	 */
	@DisplayName("Testing power method constant value greater than 0 and positive exponents")
	@ParameterizedTest
	@MethodSource("ValuePositiveAndExponentPositive")
	final void testPower_ValuePositiveAndExponentPositive(double value, int exponent) {
		double result = Utils.power(value, exponent);
		double expected = Math.pow(value, exponent);
		assertEquals(expected, result, 
				UtilsTest.delta, UtilsTest.failureMessage(value, exponent));
	}
	
	/**
	 * Agruments for {@link UtilsTest#testPower_ValuePositiveAndExponentPositive(double, int)} for testing positive Values and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}.
	 * @return Arguments for Agruments for {@link UtilsTest#testPower_ValuePositiveAndExponentPositive(double, int)}
	 */
	private static Stream<Arguments> ValuePositiveAndExponentPositive() {
		return Stream.of(				 
				//Const positive value and variable values of exp from 0 to Int max
				Arguments.of(2.22, 0),
				Arguments.of(2.22, 1),
				Arguments.of(2.22, 10),
				Arguments.of(2.22, 2147483647),
				Arguments.of(2.22, Integer.MAX_VALUE)
			);
	}
	
	/**
	 * Testing the power method for constant value less than 0 and positive exponents  in range of 0 to {@link Integer#MAX_VALUE}
	 * @param value The Value
	 * @param exponent The Exponent
	 */
	@DisplayName("Testing power method constant value less than 0 and positive exponents")
	@ParameterizedTest
	@MethodSource("ValueNegativeAndExponentPositive")
	final void testPower_ValueNegativeAndExponentPositive(double value, int exponent) {
		double result = Utils.power(value, exponent);
		double expected = Math.pow(value, exponent);
		assertEquals(expected, result, 
				UtilsTest.delta, UtilsTest.failureMessage(value, exponent));
	}
	
	/**
	 * Agruments for {@link UtilsTest#testPower_ValueNegativeAndExponentPositive(double, int)} for testing negative Values and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}.
	 * @return Arguments for Agruments for {@link UtilsTest#testPower_ValueNegativeAndExponentPositive(double, int)}
	 */
	private static Stream<Arguments> ValueNegativeAndExponentPositive() {
		return Stream.of(				 
				//Const negative Value and variable values of exp from 0 to Int max
				Arguments.of(-2.22, 0),
				Arguments.of(-2.22, 1),
				Arguments.of(-2.22, 10),
				Arguments.of(-2.22, 2147483647),
				Arguments.of(-2.22, Integer.MAX_VALUE)
			);
	}
	
	/**
	 * Testing power method with Value {@link Double#MAX_VALUE} and positive exponents  in range of 0 to {@link Integer#MAX_VALUE}
	 * @param value
	 * @param exponent
	 */
	@DisplayName("Testing power method Maximum possible value and positive exponents")
	@ParameterizedTest
	@MethodSource("ValueMaximumAndExponentPositive")
	final void testPower_ValueMaximumAndExponentPositive(double value, int exponent) {
		double result = Utils.power(value, exponent);
		double expected = Math.pow(value, exponent);
		assertEquals(expected, result, 
				UtilsTest.delta, UtilsTest.failureMessage(value, exponent));
	}
	
	/**
	 * Agruments for {@link UtilsTest#testPower_ValueMaximumAndExponentPositive(double, int)} for testing Value {@link Double#MAX_VALUE} and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}.
	 * @return Arguments for Agruments for {@link UtilsTest#testPower_ValueMaximumAndExponentPositive(double, int)}
	 */
	private static Stream<Arguments> ValueMaximumAndExponentPositive() {
		return Stream.of(				 
				//Const Max value and variable value of exp from 0 to Int max
				Arguments.of(Double.MAX_VALUE, 0),
				Arguments.of(Double.MAX_VALUE, 1),
				Arguments.of(Double.MAX_VALUE, 10),
				Arguments.of(Double.MAX_VALUE, 2147483647),
				Arguments.of(Double.MAX_VALUE, Integer.MAX_VALUE)
			);
	}
	
	/**
	 * Testing the power method with undefined Values and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}
	 * @param value The Value
	 * @param exponent The Exponent
	 */
	@DisplayName("Testing power method undefined value and positive exponents")
	@ParameterizedTest
	@MethodSource("ValueUndefinedAndExponentPositive")
	final void testPower_ValueUndefinedAndExponentPositive(double value, int exponent) {
		double result = Utils.power(value, exponent);
		double expected = Math.pow(value, exponent);
		assertEquals(expected, result, 
				UtilsTest.delta, UtilsTest.failureMessage(value, exponent));
	}
	
	/**
	 * Agruments for {@link UtilsTest#testPower_ValueUndefinedAndExponentPositive(double, int)} for testing undefined Value and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}.
	 * @return Arguments for Agruments for {@link UtilsTest#testPower_ValueUndefinedAndExponentPositive(double, int)}
	 */
	private static Stream<Arguments> ValueUndefinedAndExponentPositive() {
		return Stream.of(		
				//Undefined values
				Arguments.of(Double.NaN, 2),
				Arguments.of(Double.NEGATIVE_INFINITY, 2),
				Arguments.of(Double.POSITIVE_INFINITY, 10)
			);
	}
	
	/**
	 * Testing the power method with huge random Values and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}
	 * @param value The Value
	 * @param exponent The Exponent
	 */
	@DisplayName("Testing power method Huge Random value and positive exponents")
	@ParameterizedTest
	@MethodSource("ValueRandomAndExponentPositive")
	final void testPower_ValueRandomAndExponentPositive(double value, int exponent) {
		double result = Utils.power(value, exponent);
		double expected = Math.pow(value, exponent);
		assertEquals(expected, result, 
				UtilsTest.delta, UtilsTest.failureMessage(value, exponent));
	}
	
	/**
	 * Agruments for {@link UtilsTest#testPower_ValueRandomAndExponentPositive(double, int)} for testing random huge Value and positive Exponents  in range of 0 to {@link Integer#MAX_VALUE}.
	 * @return Arguments for Agruments for {@link UtilsTest#testPower_ValueRandomAndExponentPositive(double, int)}
	 */
	private static Stream<Arguments> ValueRandomAndExponentPositive() {
		return Stream.of(		
				//Random guessing
				Arguments.of(1234567890123456789012345678901234567890.0, Integer.MAX_VALUE),
				Arguments.of(1234567890123456789012345678901234567890.1234567890123456789012345678901234567890, 2),
				Arguments.of(1234567890123456789012345678901234567890.1234567890123456789012345678901234567890, Integer.MAX_VALUE)
			);
	}
	


}
