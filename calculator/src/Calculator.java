import java.util.Stack;


public class Calculator {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}

		Stack<Integer> stack = new Stack<>();
		for (String token : args[0].split(" ")) {
			try {
				// if the token is a number, push it on the stack
				stack.push(Integer.parseInt(token));
			} catch (NumberFormatException e) {
				// if the token is an operator, pop two operands and push the result
				switch (token) {
				case "+": {
					int rhs = stack.pop(), lhs = stack.pop();
					stack.push(lhs + rhs);
					break;
				}
				case "-": {
					int rhs = stack.pop(), lhs = stack.pop();
					stack.push(lhs - rhs);
					break;
				}
				case "*": {
					int rhs = stack.pop(), lhs = stack.pop();
					stack.push(lhs * rhs);
					break;
				}
				case "/": {
					int rhs = stack.pop(), lhs = stack.pop();
					stack.push(lhs / rhs);
					break;
				}
				default:
					System.out.println(token + " is garbage");
				}
			}
		}

		System.out.println(stack.pop());
	}

}
