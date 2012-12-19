import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculator {

	private static final Map<String, Operator> ops;
	static {
		ops = new HashMap<>();
		ops.put("+", Operator.ADD);
		ops.put("-", Operator.SUBTRACT);
		ops.put("*", Operator.MULTIPLY);
		ops.put("/", Operator.DIVIDE);
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}
		System.out.println(calculate(args[0]));
	}

	/**
	 * Calculate the result of a postfix expression.
	 * @param expression
	 * @return result
	 */
	public static int calculate(String expression) {
		Stack<Integer> stack = new Stack<>();
		for (String token : expression.split(" ")) {
			if (!handleNumber(token, stack) && !handleOperator(token, stack)) {
				throw new IllegalArgumentException("garbage in input: " + token);
			}
		}
		return stack.pop();
	}

	/**
	 * If the token is a number, push it on the stack and return true,
	 * otherwise do nothing and return false.
	 * @param token
	 * @param stack
	 * @return whether the token was a number or not
	 */
	public static boolean handleNumber(String token, Stack<Integer> stack) {
		try {
			stack.push(Integer.parseInt(token));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * If the token is an operator, pop two operands off the stack,
	 * perform the operation, push the result on the stack and return true;
	 * otherwise do nothing and return false.
	 * @param token
	 * @param stack
	 * @return whether the token was an operator or not
	 */
	public static boolean handleOperator(String token, Stack<Integer> stack) {
		Operator op = ops.get(token);
		if (op == null)
			return false;

		int rhs = stack.pop(), lhs = stack.pop();
		stack.push(op.operate(lhs, rhs));
		return true;
	}

}
