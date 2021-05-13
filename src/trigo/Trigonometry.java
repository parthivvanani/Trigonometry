package trigo;


/**
 * The Trigonometry class implements sine, cosine and tangent function of mathematics.
 */

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 14 Nov 2020
 *
 */

public class Trigonometry {
	
	/**
	 * sine method takes in angel in radian as input, applies sine function to the input and returns the value.
	 * @param angle	angle in radian
	 * @return sine of the input value
	 */
	public static double sin(double angleInRadian) {
		double angle = angleInRadian % (Utils.PI * 2);
		double  result = 0.0d;
		double termNumerator = 0, termDenominator = 0, term = 0;
		boolean positive = true;
		
		for(int i = 1; i < 200; i+=2) {
			int sign = 0;
			if(positive) {
				sign = 1;
				positive = false;
			}
			else {
				sign = -1;
				positive = true;
			}
			
			termNumerator = Utils.power(angle, i);
		
			if(i == 1) termDenominator = 1;
			else termDenominator = termDenominator * (i-1) * (i);
		
			term = termNumerator / termDenominator;
			
			result = result + (sign * term);
		}
		return result;
	}
	
	
	
	/**
	 * cosine method takes in radian as input, applies cosine function to the input and return the value.
	 * @param angle	angle in radian
	 * @return cosine of the input value
	 */
	public static double cos(double angleInRadian) {
		double angle = angleInRadian % (Utils.PI * 2);
		double  result = 0.0d;
		double termNumerator = 0, termDenominator = 1, term = 0;
		boolean positive = true;
		int sign = 1;
		
		for(int i = 0; i < 200; i+=2) {
			if(positive) {
				sign = 1;
				positive = false;
			} else {
				sign = -1;
				positive = true;
			}
			
			termNumerator = Utils.power(angle, i);
			
			if( i == 0) termDenominator = 1;
			else termDenominator = termDenominator * (i-1) * (i);
			
			term = termNumerator/termDenominator;
			
			result += sign * term;
		}
		return result;
	}
	
	/**
	 * tangent method takes in angel in radian as input, applies tangent function to the input and returns the value.
	 * @param angle	angle in radian
	 * @return tangent of the input value
	 */
	public static double tan(double angleInRadian) {
		double angle = angleInRadian % (Utils.PI * 2);
		double result = 0.0d;
		result = Trigonometry.sin(angle) / Trigonometry.cos(angle);
		return result;
	}
	
	public static void main(String[] args) {
		double angle = Math.toRadians(90);
		System.out.println(Math.sin(angle));
		System.out.println(Math.cos(angle));
		System.out.println(Math.tan(angle));
	}

}
