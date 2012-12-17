
public class Calculator {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}

		for (String token : args[0].split(" ")) {
			try {
				//    - if it's a number, push it on the stack
				int number = Integer.parseInt(token);
				System.out.println(number + " is a number");
			} catch (NumberFormatException e) {
				//    - if it's an operator:
				//        pop two operands off the stack
				//        do the operation
				//        push the result back on the stack
				switch (token) {
				case "+":
				case "-":
				case "*":
				case "/":
					System.out.println(token + " is an operator");
					break;
				default:
					System.out.println(token + " is garbage");
				}
			}
		}

		// 4. print out whatever is left on the stack
	}

}
