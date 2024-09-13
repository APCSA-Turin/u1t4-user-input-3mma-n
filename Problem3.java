import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = scan.nextInt();
        scan.nextLine();
        int firstChar = num % 10;
        int secondChar = (num % 100) / 10;
        int thirdChar = num / 100;
        System.out.println("The reverse of " + num + " is " + firstChar + secondChar + thirdChar);
        
        scan.close();
    }
}
