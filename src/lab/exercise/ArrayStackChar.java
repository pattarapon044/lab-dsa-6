package lab.exercise;

class ArrayStackChar {
	// ------------ Data -------------------
	private final static int CAPACITY = 10; // default size
	private char[] data; // array for stack data
	protected int size = 0; // stack's size

	// ------------ Method -------------------
	// constructor with default capacity
	public ArrayStackChar() {
		data = new char[CAPACITY];
	}

	// constructor with a given capacity
	public ArrayStackChar(int capacity) {
		data = new char[capacity];
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
	public void push(char e) {
		if (size == data.length) {
			resize();
		}
		
		data[size] = e;
		size ++;
	}

	// peek
	public char peek() {
		if (size == 0) {
			return ' ';
		}
		
		return data[size-1];
	}

	// pop
	public char pop() {
		if (size == 0) {
			return ' ';
		}
		
		size--;
		return data[size];
	}

	// resize
	public void resize() {
		System.out.println("Double stack's size");
		// create a new array of double size
		char[] temp = new char[2 * data.length];
		// copy old array data to new array
		System.arraycopy(data, 0, temp, 0, data.length);
		// assign the stack to new array
		data = temp;
	}
	
	@Override
	public String toString() {
		String format = new String();
		for (char c : data) {
			format += c + " ";
		}
		return format;
	}

}