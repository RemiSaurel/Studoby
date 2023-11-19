public class LinkedList implements MaLinkedList {
    private int size;
    private Node head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void add(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(value));
        }
        this.size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            this.head = new Node(value, this.head);
        } else {
            Node current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(new Node(value, current.getNext()));
        }
        this.size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            Node current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        this.size--;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void set(int index, int value) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setValue(value);
    }

    public boolean contains(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(int value) {
        Node current = this.head;
        int index = 0;
        while (current != null) {
            if (current.getValue() == value) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = this.head;
        while (current != null) {
            result.append(current.getValue());
            if (current.getNext() != null) {
                result.append(", ");
            }
            current = current.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
