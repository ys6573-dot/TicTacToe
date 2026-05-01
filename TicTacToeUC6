public class TicTacToeUC6 {

    // Validate move (from UC5)
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }

    // Place move (UC6)
    public static boolean placeMove(char[][] board, int row, int col, char symbol) {

        if (isValidMove(board, row, col)) {
            board[row][col] = symbol;
            return true;
        } else {
            return false;
        }
    }

    // Print board (from UC1)
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Initialize board
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        boolean success = placeMove(board, row, col, symbol);

        if (success) {
            System.out.println("Move placed successfully!");
        } else {
            System.out.println("Invalid move!");
        }

        printBoard(board);
    }
}