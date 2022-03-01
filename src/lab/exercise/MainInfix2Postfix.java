package lab.exercise;

public class MainInfix2Postfix {

	public static void main(String[] args) {
		String operator = "+-*/";
		String expression = "(a+b-c)*d-(e+f)";

		System.out.println("Infix: " + expression);

		// Create a char stack
		ArrayStackChar stack = new ArrayStackChar();
		// split String to array of characters
		char[] exp = expression.toCharArray();

		System.out.print("\nPostfix: ");
		// For each character in the array
		for (char c : exp) {
			
			// When char c is not operator
			if (operator.indexOf(c) == -1) {
				
				// Check char c is left parenthesis '(' ?
				if (c == '(') {
					stack.push(c);
				}
				
				// Check char is right parenthesis ')' ?
				else if (c == ')') {
					
					// Pop item out until reach ')' or until stack is  empty
					for (char e = stack.pop(); e != '('; e = stack.pop()) {
						
						if (stack.isEmpty()) {	// Stack empty
							System.out.println("expression is not matched");
							break;
						}
						
						System.out.print(e);
					}
				}
				
				// When char c is Alphabet
				else {
					System.out.print(c);
				}
			}
			
			// When char c is operator
			else {
				
				// Check, is stack is empty or not ?
				if (stack.isEmpty()) {
					stack.push(c);
				}
				else {
					// Check top of stack
					char check = stack.peek();
					
					// If top is operator
					if (operator.indexOf(check) != -1) {
						// Pop the exist operator in stack and push new operator to stack.
						char p = stack.pop();
						System.out.print(p);
						stack.push(c);
					}
					
					// If top is left parenthesis '('
					else if (check == '(') {
						stack.push(c);
					}
				}
			}
			
		} // end for each character

		// now all operators and operands are checked
		// is there any operator left in stack?
		// if stack is NOT empty
		if (!stack.isEmpty()) {
			
			// Top is left parenthesis '('
			if (stack.peek() == '(') {
				System.out.print("expression is not matched");
			}
			
			// Top is operator
			else {
				char p = stack.pop();
				System.out.print(p);
			}
			
		} // end if stack is NOT empty

	}// end main method

}// end class
