public class MainStructures {

    public static void main(String[] args) {
        MaPile pile = new Pile(10);
        pile.push(1);
        pile.push(2);
        pile.push(3);
        System.out.println(pile);
        System.out.println(pile.pop());
        System.out.println(pile);
        System.out.println(pile.peek());
        System.out.println(pile);
        System.out.println(pile.isEmpty());
        System.out.println(pile.size());
        pile.clear();
        System.out.println(pile);
        System.out.println(pile.isEmpty());
        System.out.println(pile.size());
    }
}
