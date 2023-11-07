public class Morpion {

    Board board;
    Player player1;
    Player player2;

    public Morpion() {
        this.board = new Board();
        this.player1 = new Player('X');
        this.player2 = new Player('O');
    }

    public boolean gameFinished(Player player) {
        if (this.board.isWinner(player.getSymbol())) {
            System.out.println("Player " + player.getSymbol() + " won!");
            return true;
        } else if (this.board.isFull()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }

    public void play() {
        this.board.display();
        while (!this.gameFinished(player1) && !this.gameFinished(player2)) {
            this.player1.play(this.board);
            this.board.display();

            if (this.gameFinished(player1)) {
                break;
            }

            this.player2.play(this.board);
            this.board.display();

            if (this.gameFinished(player2)) {
                break;
            }
        }
    }
}
