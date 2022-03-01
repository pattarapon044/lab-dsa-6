package lab.exercise;

class ArrayStack {
	// Note that this is only for an integer stack
	// ------------ Data -------------------
	private final static int CAPACITY = 10; // default size
	private int[] data; // array for stack data
	private int size = 0; // stack's size

	// ------------ Method -------------------
	// constructor with default capacity
	public ArrayStack() {
		data = new int[CAPACITY];
	}

	// constructor with a given capacity
	public ArrayStack(int capacity) {
		data = new int[capacity];
	}

	// current stack's size, not a capacity
	public int getSize() {
		return size;
	}

	// empty?
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		
		return false;
	}

	// push
	public void push(int e) {
		if (size == data.length) {
			resize();
		}
		
		data[size] = e;
		size ++;
	}

	// peek
	public int peek() {
		if (size == 0) {
			return -1;
		}
		
		return data[size-1];
	}

	// pop
	public int pop() {
		if (size == 0) {
			return -1;
		}
		
		size--;
		return data[size];
	}

	// resize
	public void resize() {
		System.out.println("Double stack's size");
		// create a new array of double size
		int[] temp = new int[2 * data.length];
		// copy old array data to new array
		System.arraycopy(data, 0, temp, 0, data.length);
		// assign the stack to new array
		data = temp;
	}
}
