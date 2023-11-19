public class MainStructures {

    public static void main(String[] args) {
        initPile();
        initLinkedList();
    }

    public static void initPile() {
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

    public static void initLinkedList() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0, 0);
        System.out.println(list);
        list.add(4, 4);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.set(0, 10);
        System.out.println(list);
        list.set(2, 30);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
