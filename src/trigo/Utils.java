package trigo;

/**
 * The Utils class has several methods to calculate power, PI and also for angleDeg and angleRad.
 */

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 14 Nov 2020
 *
 */

//construct Utils Class
public class Utils {
	
	/**
	 * Calculate and return a^b. It assumes exponent to be in range 0 to Integer.MAX_VALUE because the taylor series expansion of sine and cosine does not have negative exponents.
	 * a is the value and b is the exponent
	 * @param value The value to base
	 * @param exponent	The value of exponent
	 * @return	valuse raised to the exponent
	 */
	public static double power(Double value, Integer exponent) {
		Double result = 1.0d;
		for(int i = 0; i < exponent; i++) 	result *= value;
		return result;
	}
	
	public static final double PI = Utils.calculatePI();
			
	public static double calculatePI() { //3.141592653589793
		boolean positive = true;
		int sign = 1;		
		Double term = 0.0d;
		Double result = 0.0d;
		for(Long i = 1L; i < 1000000000L ; i+=2) {

			if(positive) {
				sign = 1;
				positive = false;
			} else {
				sign = -1;
				positive = true;
			}
			term = (sign) * ((1.0d) / i);
			
			result += term;
		}
		
		return result * 4;
		
	}
	
	/**
	 * Calculate angleDeg and return it. 
	 * @param angleRad
	 * @return
	 */
	public static double toDegree(Double angleRad) {
		Double angleDeg = 0.0d;
		angleDeg = (angleRad * 180) / Utils.PI;
		return angleDeg;
	}
	
	/**
	 * calculate angleRad and return it.
	 * @param angleDeg
	 * @return
	 */
	public static double toRadian(Double angleDeg) {
		Double angleRad = (angleDeg * Utils.PI) / 180;
		return angleRad;
	}
	
	/**
	 *
	 * @param args
	 */
	//main method
	public static void main(String[] args) {
		System.out.println(Utils.PI );
		System.out.println(Math.PI);
	}
	
}
