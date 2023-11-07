public class Player {

    private final char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void play(Board board) {
        System.out.println("Player " + this.symbol + " turn:");
        int x, y;
        do {
            x = Input.readInt("Enter x coordinate: "); // reading the x coordinate
            y = Input.readInt("Enter y coordinate: "); // reading the y coordinate
        } while (!board.setCell(x, y, this.symbol)); // while the cell is not empty, we ask for new coordinates
    }
}
