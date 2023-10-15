import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorsTest {
	@SuppressWarnings("static-access")
	@Test
	public void caltest() {
		SimpleCalculator cal = new SimpleCalculator();
		assertEquals(cal.performOperation(1, 2, "+"), 3, 0);
		assertEquals(cal.performOperation(3, 2, "-"), 1, 0);
		assertEquals(cal.performOperation(1, 2, "*"), 2, 0);
		assertEquals(cal.performOperation(3, 2, "%"), 1, 0);
		assertEquals(cal.performOperation(2, 2, "/"), 1, 0);
		assertEquals(cal.performOperation(1, 2, "~"), 0, 0);
	}
}
