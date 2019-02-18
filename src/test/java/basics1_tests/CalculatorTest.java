package basics1_tests;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

import basics1.Calculator;

public class CalculatorTest {

	private Calculator testCalculator;
	
	@Before
	public void setUp() {
		testCalculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		int a = 5;
		int b = -1;
		int result = testCalculator.add(a, b);
		assertEquals(4,result);
	}
	
	@Test
	public void subtractTest() {
		int a = 5;
		int b = 4;
		int result = testCalculator.subtract(a, b);
		assertEquals(1, result);
	}
	@Test
	public void addsWhenSubtractedByNegative() {
		int a = 0;
		int b = -4;
		int result = testCalculator.subtract(a, b);
		assertEquals(4,result);
	}
	@Test
	public void staysSameWhenSubtractedByZero() {
		int a = 4;
		int b = 0;
		int result = testCalculator.subtract(a, b);
		assertEquals(4,result);
		
	}
	

}
