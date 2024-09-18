import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    static int drawCard() {
        Random tempRand = new Random();
        int card = tempRand.nextInt(12) + 1;
        if (card > 9) {
            card = 10;
        }
        return card;
      }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Blackjack!");
        System.out.print("How many chips will players begin with? ");
        int startingChips = scan.nextInt();

        int playerChips = startingChips;
        int cpuOneChips = startingChips;
        int cpuTwoChips = startingChips;
        int cpuThreeChips = startingChips;

        int playerCardOne;
        int playerCardTwo;

        System.out.println("The Game Begins!");
        System.out.println("------------------------------------");
        // while (playerChips > 0) {
            System.out.println("All players add one chip.");
            playerCardOne = drawCard();
            playerCardTwo = drawCard();
            System.out.println("You drew a " + playerCardOne + " and a " + playerCardTwo + ".")
            System.out.print("Current cards: ");
            System.out.print(playerCardOne + " (hidden)");
            System.out.print(", " + playerCardTwo);
            System.out.println("(visible)");

        // }

        scan.close();
    }
}