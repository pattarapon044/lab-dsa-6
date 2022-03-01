package lab.exercise;

public class MainArrayStack {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		System.out.println("### Add Data to Empty stack ###"); // Add data
		System.out.println("Stack empty: " + stack.isEmpty());
		System.out.print("Stack push :");
		for (int i = 1; i <= 5; i++) {
			stack.push(i); // push
			System.out.print(" " + i);
		}
		System.out.println();

		System.out.println("Stack top  : " + stack.peek()); // check Top
		System.out.println("Stack empty: " + stack.isEmpty()); // check Empty
		System.out.println("Stack size : " + stack.getSize()); // check Size

		System.out.println("\n++++++ Add more Data ++++++"); // Add more data
		System.out.print("Stack push :");
		for (int j = 10; j <= 50; j += 10) {
			stack.push(j); // push
			System.out.print(" " + j);
		}
		System.out.println("\nStack size : " + stack.getSize());
		System.out.println("Stack top  : " + stack.peek());

		System.out.println("\n------ Remove the Stack ------"); // Remove Stack
		System.out.print("Stack pop  :");
		int s = stack.getSize(); // get Size
		for (int k = 1; k <= s; k++) {
			System.out.print(" " + stack.pop()); // pop and display
		}
		System.out.println("\nStack size : " + stack.getSize()); // check Size
		System.out.println("Stack empty: " + stack.isEmpty()); // check Empty
	}
}
