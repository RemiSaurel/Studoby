public interface MaLinkedList {

    /**
     * Add a value at the end of the list
     * @param value value to add
     */
    public void add(int value);

    /**
     * Add a value at the given index
     * @param index index
     * @param value value to add
     */
    public void add(int index, int value);

    /**
     * Remove the value at the given index
     * @param index index
     */
    public void remove(int index);

    /**
     * Get the value at the given index
     * @param index index
     * @return value
     */
    public int get(int index);

    /**
     * Set the value at the given index
     * @param index index
     * @param value value
     */
    public void set(int index, int value);

    /**
     * Check if the list contains the given value
     * @param value value
     * @return true if contains, false otherwise
     */
    public boolean contains(int value);

    /**
     * Get the index of the given value
     * @param value value
     * @return index
     */
    public int indexOf(int value);

    /**
     * Check if the list is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Get the size of the list
     * @return size
     */
    public int size();

    /**
     * Clear the list
     */
    public void clear();
}
