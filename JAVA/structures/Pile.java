import java.util.ArrayList;
import java.util.List;

public class Pile {

    private List<Integer> pile;

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
