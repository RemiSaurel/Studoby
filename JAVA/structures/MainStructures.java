public class MainStructures {

    public static void main(String[] args) {
        Pile pile = new Pile(5);
        pile.push(1);
        pile.push(2);
        pile.push(3);
        pile.push(4);
        pile.push(5);
        System.out.println(pile);
        System.out.println(pile.pop());
        System.out.println(pile.pop());
        System.out.println(pile.pop());
        System.out.println(pile);
    }
}
