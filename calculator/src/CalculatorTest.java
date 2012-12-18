import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void handleNumberMustHandleNumbers() {
		Stack<Integer> stack = new Stack<>();
		assertTrue(Calculator.handleNumber("5", stack));
		assertEquals(1, stack.size());
		assertEquals(5, (int) stack.peek());
	}

	@Test
	public void handleNumberMustNotHandleNonNumbers() {
		Stack<Integer> stack = new Stack<>();
		assertFalse(Calculator.handleNumber("garbage", stack));
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustHandlePlus() {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		assertTrue(Calculator.handleOperator("+", stack));
		assertEquals(1, stack.size());
		assertEquals(8, (int) stack.peek());
	}

	@Test
	public void handleOperatorMustNotHandleNonOperators() {
		Stack<Integer> stack = new Stack<>();
		assertFalse(Calculator.handleOperator("garbage", stack));
		assertTrue(stack.isEmpty());
	}

	@Test
	public void onePlusOneMustEqualTwo() {
		assertEquals(2, Calculator.calculate("1 1 +"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatorMustThrowIAEOnGarbage() {
		Calculator.calculate("garbage");
	}

}
