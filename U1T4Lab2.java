import java.util.Scanner;

public class U1T4Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Emma's really cool compatibility detector!");
        System.out.println("This is a foolproof test that can be applied to friendship or love.");

        //Allows user to input their name and the name of someone else, alongside both people's birthdays
        System.out.print("\nEnter your name: ");
        String nameOne = scan.nextLine();
        System.out.print("Enter your birthday month (1-12): ");
        int monthOne = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the day of your birthday (1-31): ");
        int dayOne = scan.nextInt();
        scan.nextLine();

        System.out.print("\nEnter someone else's name: ");
        String nameTwo = scan.nextLine();
        System.out.print("Enter their birthday month (1-12): ");
        int monthTwo = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the day of their birthday (1-31): ");
        int dayTwo = scan.nextInt();
        scan.nextLine();

        // Confirms entered data
        System.out.println("\nSo the two being checked are: ");
        System.out.println(nameOne + ", with the birthday " + monthOne + "/" + dayOne);
        System.out.println(nameTwo + ", with the birthday " + monthTwo + "/" + dayTwo);
        System.out.println("\nCalculating Foolproof Results...");

        // lots of calculations to produce pseudo random results while letting them remain the same with the same inputs
        dayOne %= 15;
        dayTwo %= 10;
        monthOne--;
        monthTwo++;
        double indexOne = monthOne * 30 + dayOne;
        double indexTwo = monthTwo * 30 + dayTwo;
        indexOne *= dayTwo % 3.14;
        indexTwo /= (dayOne % 3.14) + 1;
        indexTwo += monthOne * 3;
        indexOne -= monthTwo * 3;
        if (indexOne < 0 || indexTwo < 0) {
            indexOne += 150;
            indexTwo += 150;
        }

        // divides one index by the other to see how similar they are by percentage
        // the "1 -" and "/ 2" serve to make all percentages closer to 100 to make people feel better
        double finalPercent;
        if (indexOne > indexTwo) {
            finalPercent = Math.round((1 - (1 - (indexTwo / indexOne)) / 2) * 1000) / 10; 
        }
        else {
            finalPercent = Math.round((1 - (1 - (indexOne / indexTwo)) / 2) * 1000) / 10;
        }

        System.out.println("Your (" + nameOne + ") compatibility with " + nameTwo + " is " + finalPercent + "%!");
        scan.close();
    }
}
