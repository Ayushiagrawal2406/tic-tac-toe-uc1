import java.util.Random;

public class UC2_Toss {

    public static void main(String[] args) {

        Random random = new Random();

        int tossResult = random.nextInt(2);

        String currentPlayer;
        char playerSymbol;
        char computerSymbol;
      
        if (tossResult == 0) {
            currentPlayer = "Player";
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            playerSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println("First Player: " + currentPlayer);
        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
