package test.trigonometryTest;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

/**
 * Interface ValueProvider class has following methods.
 */

/**
 * @author Rushabh Rathod, 110031267
 * @author Parthiv Vanani, 110029375
 * @author Mili Shah, 110026108	
 * @author Gurprett Dhaliwal, 110039329
 * @version 15 Nov 2020
 */

public interface ValueProvider {
	static Stream<Arguments> provideAnglesForQuadrant1() 	{
		return Stream.of(
				Arguments.of(Math.PI / 3),
				Arguments.of(Math.PI / 10),
				Arguments.of(Math.PI / 100),
				Arguments.of(1.5707963267948956345351385413854168543134512), //Max Boundary value 
				Arguments.of(0.000000000000000000000000000000000000000000000000000001) //Min boundary value
			);
	}
	
	static Stream<Arguments> provideAnglesForQuadrant2() {
		return Stream.of(
				Arguments.of((2 *Math.PI) / 3),
				Arguments.of((11 *Math.PI) / 21),
				Arguments.of((21 *Math.PI) / 20),
				Arguments.of(3.14159265358979239864516845986541298456198451298), //Max Boundary value 
				Arguments.of(1.57079632679489679854618945616985432196873216898) //Min boundary value
			);
	}
	
	static Stream<Arguments> provideAnglesForQuadrant3() {
		return Stream.of(
				Arguments.of((5 *Math.PI) / 4),
				Arguments.of((4 *Math.PI) / 3),
				Arguments.of((3 *Math.PI) / 4),
				Arguments.of(4.71238898038468986542168741354985461685416856835), //Max Boundary value 
				Arguments.of(3.14159265358979413549865498745132987945121987465) //Min boundary value
			);
	}
	
	static Stream<Arguments> provideAnglesForQuadrant4() {
		return Stream.of(
				Arguments.of((21 *Math.PI) / 11),
				Arguments.of((7 *Math.PI) / 4),
				Arguments.of((8 *Math.PI) / 5),
				Arguments.of(6.28318530717957845312684531232168541683516985943), //Max Boundary value 
				Arguments.of(4.71238898038470135416845321867983118978465168983) //Min boundary value
			);
	}
	
	static Stream<Arguments> provideAnglesForAxis() {
		return Stream.of(
				Arguments.of(0),
				Arguments.of(Math.PI / 2),
				Arguments.of((3 *Math.PI) / 2),
				Arguments.of(2 * Math.PI)
			);
	}
	
	static Stream<Arguments> provideAnglesForNormalization() {
		return Stream.of(
				Arguments.of(0),
				Arguments.of(Math.PI * 3),
				Arguments.of((7 *Math.PI)),
				Arguments.of(5 * Math.PI / 2),
				Arguments.of(500 * Math.PI / 2),
				Arguments.of(1000 * Math.PI)
			);
	}
	
}
