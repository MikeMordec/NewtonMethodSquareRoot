import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	
	@Test
	// test method with a positive number and assert sqrt(10) = 3.1623
	public void testComputePositive() {
		float a = 10.0f;
		// check difference between Java Math sqrt() and the class' Newton method
		assertTrue(Math.abs(Math.sqrt(a) - Newton.Compute(a)) < 1E-5, "Positive Number");
	}

	@Test
	// test method with a negative number
	// output should be a Float, not a Number as you can’t do negative sqrt’s
	public void testComputeNegative() {
		float a = -10.0f;
		// check difference between Java Math sqrt() and the class' Newton method
		assertEquals(Math.abs(Math.sqrt(a) - Newton.Compute(a)),Float.NaN, "Negative Number");
	}

	@Test
	// test method with zero - output should be just zero
	public void testComputeZero() {
		float a = 0.0f;
		// check difference between Java Math sqrt() and the class' Newton method
		assertTrue(Math.abs(Math.sqrt(a) - Newton.Compute(a)) == 0, "Zero");
	}
}
