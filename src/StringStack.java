/** Array-based stack implementation */
class StringStack {

	private static final int defaultSize = 10;
	private int maxSize; // Maximum size of stack
	private int top; // Index for top Object
	private char[] listArray;// Array holding stack

	/** Constructors */
	StringStack() {
		this(defaultSize);
	}
	StringStack(int size) {
		maxSize = size;
		top = 0;
		listArray = new char[size]; // Create listArray
	}

	/** Reinitialize stack */
	public void clear() {
		top = 0;
	}

	/** Push "it" onto stack */
	public void push(String it) throws StringTooLongException {

		// Check if there is enough space in the array
		if (top + it.length() + 1 > maxSize) {
			throw new StringTooLongException("Stack is full.");
		}
		// Start storing string in array
		else {
			// loop through string backwards
			int lengthOfString = 0;
			for (int i = it.length() - 1; i >= 0; i--) {
				// store character
				listArray[top] = it.charAt(i);
				++top;
				// store string length
				listArray[top] = (char) (++lengthOfString);
			}
			top++;
		}

	}

	/** Remove and top element */
	public String pop() throws StackIsEmptyException {
		if (top == 0) {
			throw new StackIsEmptyException("Stack is empty.");
		} else {
			String stringToReturn = "";
			char getLength = listArray[top - 1];
			int convertLength = getLength;
			while (convertLength >= 1) {
				top--;
				stringToReturn = stringToReturn + Character.toString(listArray[top - 1]);
				convertLength--;
				listArray[top - 1] = (char) convertLength;

			}
			top--;
			return stringToReturn;
		}
	}

	/** @return Top element */
	public String topValue() {
		assert top != 0 : "Stack is empty";
		String topValue = Integer.toString(top);
		return topValue;
	}

	/** @return Stack size */
	public int length() {
		return top;
	}

	// Extra stuff not printed in the book.

	/**
	 * Generate a human-readable representation of this stack's contents that looks something like this: < 1 2 3 >. This method uses toString() on the individual elements.
	 * 
	 * @return The string representation of this stack
	 */
	public String toString() {
		StringBuffer out = new StringBuffer((length() + 1) * 4);
		out.append("< ");
		for (int i = top - 2; i >= 0; i--) {
			out.append(listArray[i]);
			out.append(" ");
		}
		out.append(">");
		return out.toString();
	}
}
