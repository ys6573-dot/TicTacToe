import java.util.Random;

public class TicTacToeUC7 {

    // UC4: Convert slot → index
    public static int[] convertToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    // UC6: Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC1: Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC7: Computer move
    public static void computerMove(char[][] board, char symbol) {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1; // 1–9
            int[] pos = convertToIndex(slot);

            int row = pos[0];
            int col = pos[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        computerMove(board, 'O');

        printBoard(board);
    }
}