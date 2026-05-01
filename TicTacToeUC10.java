public class TicTacToeUC10 {

    // Check draw condition
    public static boolean isDraw(char[][] board) {

        // Check for any empty cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // still moves left
                }
            }
        }

        return true; // no empty cells → draw (if no winner)
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };

        if (isDraw(board)) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Game is not over yet.");
        }
    }
}