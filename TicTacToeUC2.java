import java.util.Random;

public class TicTacToeUC2 {
    public static void main(String[] args) {

        // Step 1: Create Random object
        Random rand = new Random();

        // Step 2: Toss (0 or 1)
        int toss = rand.nextInt(2);

        // Step 3: Declare variables
        char player1Symbol;
        char player2Symbol;
        int currentPlayer;

        // Step 4: Decide using condition
        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Step 5: Display result
        System.out.println("Toss Result: " + toss);
        System.out.println("Player " + currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}