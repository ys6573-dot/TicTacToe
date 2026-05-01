import java.util.Scanner;
import java.util.Random;

public class TicTacToeUC8 {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    // Print board (UC1)
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Convert slot (UC4)
    public static int[] convertToIndex(int slot) {
        return new int[]{(slot - 1) / 3, (slot - 1) % 3};
    }

    // Validate (UC5)
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    // Place move (UC6)
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Player move (UC3 + UC5 + UC6)
    public static void playerMove(char[][] board, char symbol) {
        while (true) {
            System.out.print("Enter slot (1-9): ");
            int slot = sc.nextInt();

            int[] pos = convertToIndex(slot);

            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], symbol);
                break;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Computer move (UC7)
    public static void computerMove(char[][] board, char symbol) {
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = convertToIndex(slot);

            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], symbol);
                System.out.println("Computer chose: " + slot);
                break;
            }
        }
    }

    // Check draw
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '-') return false;
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        char playerSymbol = 'X';
        char computerSymbol = 'O';

        boolean playerTurn = true;

        // 🔁 GAME LOOP
        while (true) {

            printBoard(board);

            if (playerTurn) {
                System.out.println("Player Turn");
                playerMove(board, playerSymbol);
            } else {
                System.out.println("Computer Turn");
                computerMove(board, computerSymbol);
            }

            // 👉 (Win check will come in next UC)
            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("Game Draw!");
                break;
            }

            // 🔁 Switch turn
            playerTurn = !playerTurn;
        }
    }
}