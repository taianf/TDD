import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoney {
	@Test
	public void testMultiplication() {
		Dollar five = Money.dollar(5);
		assertEquals(new Dollar(10),five.times(2));
		assertEquals(new Dollar(15),five.times(3));
	}
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Brr(5).equals(new Brr(5)));
		assertFalse(new Brr(5).equals(new Brr(6)));
		assertFalse(new Dollar(5).equals(new Brr(5)));
	}
	@Test
	public void testBrrMutiplication() {
		Brr five = new Brr(5);
		assertEquals(new Brr(10),five.times(2));
		assertEquals(new Brr(15),five.times(3));
	}
}

