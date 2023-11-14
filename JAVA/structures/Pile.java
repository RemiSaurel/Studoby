import java.util.ArrayList;
import java.util.List;

public class Pile implements MaPile {

    private final List<Integer> pile; // final because we don't want to change the reference, the values inside the list can be changed

    public Pile(int size) {
        this.pile = new ArrayList<>(size);
    }

    public void push(int value) {
        this.pile.add(value);
    }

    public int pop() {
        int value = this.pile.get(this.pile.size() - 1);
        this.pile.remove(this.pile.size() - 1);
        return value;
    }

    public int peek() {
        return this.pile.get(this.pile.size() - 1);
    }

    public boolean isEmpty() {
        return this.pile.isEmpty();
    }

    public int size() {
        return this.pile.size();
    }

    public void clear() {
        this.pile.clear();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < this.pile.size(); i++) {
            result.append(this.pile.get(i));
            if (i < this.pile.size() - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
