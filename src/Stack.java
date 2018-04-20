public interface Stack {
	/**
	 * Reinitialize the stack. The user is responsible for reclaiming the storage used by the stack elements.
	 */
	public void clear();
	/**
	 * * Push an element onto the top of the stack.
	 * 
	 * @param it
	 *            The element being pushed onto the stack
	 */
	public void push(String it) throws StringTooLongException;
	/**
	 * Remove and return the element at the top of the stack.
	 * 
	 * @return The element at the top of the stack.
	 */
	public String pop() throws StackIsEmptyException;
	/** @return A copy of the top element. */
	public String topValue();
	/** @return The number of elements in the stack. */
	public int length();
};
