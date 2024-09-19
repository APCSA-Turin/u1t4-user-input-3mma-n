import java.util.*;

public class Blackjack {
    static int drawCard() {
        Random tempRand = new Random();
        int card = tempRand.nextInt(12) + 1;
        if (card > 9) {
            card = 10;
        }
        return card;
      }

      static void printCards(List<Integer> cardList) {
        boolean hasAce;
        System.out.print("Current cards: ");
        if (cardList.get(0) == 1) {
            System.out.print(cardList.get(0) + " (11) < [hidden]");
            hasAce = true;
        }
        else {
            System.out.print(cardList.get(0) + " < [hidden]");
            hasAce = false;
        }
        int total = cardList.get(0);
        for (int i = 1; i < (cardList.size()); i++) {
            total += cardList.get(i);
            if (cardList.get(i) == 1) {
                hasAce = true;
                System.out.print(", " + cardList.get(i));
            }
            else {
                System.out.print(", " + cardList.get(i));
            }
        }
        System.out.println(" < [visible]");
        if (hasAce) {
            System.out.println("Total Value: " + total + " (" + (total + 10) + ")");
        }
        else {
            System.out.println("Total Value: " + total);
        }
      }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Blackjack!");
        System.out.print("How many chips will players begin with? ");

        int startingChips = scan.nextInt();
        int centerChips = 0;
        int playerCount = 4;
        int minAddition = 1;
        List<Integer> playerCards = new ArrayList<Integer>();
        List<Integer> chipCounts = new ArrayList<Integer>();
        for (int i = 0; i < playerCount; i++) {
            chipCounts.add(startingChips);
        }

        System.out.println("The Game Begins!");
        System.out.println("------------------------------------");
        // while (playerChips > 0) {
            playerCards.add(1);
            playerCards.add(drawCard());
            playerCards.add(drawCard());
            playerCards.add(drawCard());
            
            System.out.println("You drew a " + playerCards.get(0) + " and a " + playerCards.get(1) + ".");
            printCards(playerCards);

            System.out.println("All players add " + minAddition + " chip.");
            centerChips += minAddition * playerCount;
            for (int i = 0; i < playerCount; i++) {
                chipCounts.set(i, chipCounts.get(i) - minAddition);
            }

            System.out.println("The current pot contains " + centerChips + " chips.");
            System.out.println("You have " + chipCounts.get(0) + " chips remaining.");

        // }

        scan.close();
    }
}