package lab.exercise;

public class MainArrayStackChar {

	public static void main(String[] args) {
		String opening = "({[";
		String closing = ")}]";
		String expression = "()(()){([()])}";

		// Show input message
		System.out.print("Expression: " + expression);
		System.out.println("\n");

		// Create a char stack
		ArrayStackChar stack = new ArrayStackChar();
		// split String to array of characters
		char[] exp = expression.toCharArray();

		// For each character in the array
		for (char c : exp) {
			// is it opening delimiter?
			// use indexOf() to find character in String, return -1 if not found, otherwise
			// return position
			// if this opening delimiter is found
			if (opening.indexOf(c) != -1) {
				// push to stack
				System.out.println("Input ..... " + c);
				System.out.println("Stack push : " + c);
				stack.push(c);
			}
			// is it closing delimiter?
			else if (closing.indexOf(c) != -1) {
				// is stack empty? --> no matching opening delimiter
				if (stack.isEmpty()) {
					System.out.println("\n ***** MISMATCHED DELIMITER! ***** ");
					// end the program
					return;
				}

				// pop an element
				System.out.println("\nInput .... " + c);
				char p = stack.pop();

				System.out.println("Stack pop : " + p);
				System.out.println("Matching ... " + p + " with " + c);

				// is the pop opening element is equal to the current closing delimiter?
				// here the positions of both delimiters must be equal
				if (opening.indexOf(p) != -1) {
					System.out.println("------------- delimiter matched!");
				} else {
					System.out.println("\n ***** MISMATCHED DELIMITER! ***** ");
					// end the program
					return;
				}
			} // end if else
		} // end of loop

		// ---now all delimiters are checked---
		// is there any delimiter left in stack?
		// if stack is empty
		if (stack.isEmpty()) {
			System.out.println("\n+++++++++++++++++++++++++ ALL ARE MATCHED.");
		} else {
			System.out.println("\n ***** MISMATCHED DELIMITER! ***** ");
			// end the program
			return;
		}

	}// end of main method
}// end of main class
