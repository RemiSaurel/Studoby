public interface MaPile {

    /**
     * Push a value on the stack
     * @param value value to push
     */
    public void push(int value);

    /**
     * Pop a value from the stack
     * @return value
     */
    public int pop();

    /**
     * Peek the value on the top of the stack
     * @return value
     */
    public int peek();

    /**
     * Check if the stack is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Get the size of the stack
     * @return size
     */
    public int size();

    /**
     * Clear the stack
     */
    public void clear();
}
