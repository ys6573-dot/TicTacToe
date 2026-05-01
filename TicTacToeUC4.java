import java.util.Scanner;

public class TicTacToeUC4 {

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) break;
            else System.out.println("Invalid input!");
        }

        return slot;
    }

    public static int[] convertToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = getUserInput();

        int[] pos = convertToIndex(slot);

        System.out.println("Row: " + pos[0]);
        System.out.println("Column: " + pos[1]);
    }
}