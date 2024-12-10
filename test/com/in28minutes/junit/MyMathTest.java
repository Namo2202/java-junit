package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();

	@Test
	void calculateSum_ThreeMemberArray() {
//		fail("Not yet implemented");
		assertEquals(5, math.calculateSum(new int[] { 1, 2, 3 }));
	}

	@Test
	void test1() {
//		fail("Not yet implemented");
		assertEquals(0, math.calculateSum(new int[] {}));
	}

}
