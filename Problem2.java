import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1, Enter your name: ");
        String playerOne = scan.nextLine();
        System.out.print(playerOne + ", Select your number: ");
        double numOne = scan.nextDouble();
        scan.nextLine();

        System.out.print("Player 2, Enter your name: ");
        String playerTwo = scan.nextLine();
        System.out.print(playerTwo + ", Select your number: ");
        double numTwo = scan.nextDouble();
        scan.nextLine();

        if (numOne > numTwo) {
            System.out.println(playerOne + "'s number is larger!");
        }
        else if (numTwo > numOne) {
            System.out.println(playerTwo + "'s number is larger!");
        }
        else {
            System.out.println("The two numbers are equal.");
        }

        scan.close();

    }
}
