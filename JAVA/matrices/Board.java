public class Board {

    // Size of the board (3x3)
    private final int SIZE = 3;

    // Creation of the matrix representing the board
    private final char[][] board = new char[SIZE][SIZE];

    // Init of the board with empty cells
    public Board() {
        for (int i = 0; i < SIZE; i++) {
            this.board[i] = new char[SIZE];
            for (int j = 0; j < SIZE; j++) {
                this.board[i][j] = ' ';
            }
        }
    }

    /**
     * Set the cell at the given coordinates with the given symbol
     * @param x (column)
     * @param y (line)
     * @param symbol (the symbol to put in the cell)
     * @return true if the cell was empty and the symbol was put in it, false otherwise
     */
    public boolean setCell(int x, int y, char symbol) {
        if (this.board[y][x] == ' ') {
            this.board[y][x] = symbol;
            return true;
        }

        System.out.println("This cell is not empty!");
        return false;
    }

    /**
     * Check if the board is full
     * @return true if the board is full, false otherwise
     */
    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (this.board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Check if the given symbol has won
     * @param symbol (the symbol to check)
     * @return true if the symbol has won, false otherwise
     */
    public boolean isWinner(char symbol) {
        // We check for each line and column if the player has won
        for (int i = 0; i < SIZE; i++) {
            // Check for the line
            if (this.board[i][0] == symbol && this.board[i][1] == symbol && this.board[i][2] == symbol) {
                return true;
            }

            // Check for the column
            if (this.board[0][i] == symbol && this.board[1][i] == symbol && this.board[2][i] == symbol) {
                return true;
            }
        }

        // Check for the diagonals (top left to bottom right)
        if (this.board[0][0] == symbol && this.board[1][1] == symbol && this.board[2][2] == symbol) {
            return true;
        }

        // Check for the diagonals (top right to bottom left)
        if (this.board[0][2] == symbol && this.board[1][1] == symbol && this.board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    /**
     * Display the board in the console
     */
    public void display() {
        System.out.println("    0   1   2");
        System.out.println("  -------------"); // Top line
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " | "); // left border line
            for (int j = 0; j < SIZE; j++) {
                System.out.print(this.board[i][j] + " | "); // right border line + cell
            }
            System.out.println();
            System.out.println("  -------------");
        }
    }
}
