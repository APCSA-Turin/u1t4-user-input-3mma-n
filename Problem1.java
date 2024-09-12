import java.util.Scanner;  // must import this class b/c it isn't "built in" like String and System

public class Problem1
{
    public static void main(String[] args)
    {       
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"

        System.out.print("Please enter your name: ");
        String name = scan.nextLine(); // call nextLine() method on scanner object to get text
        System.out.println("Welcome " + name + "!");

        System.out.print("Please Enter First Integer: ");
        int firstInt = scan.nextInt(); // call nextInt() method on scanner object to get integer
        scan.nextLine();   // clear input buffer after using nextInt

        System.out.print("Please Enter Second Integer: ");
        int secondInt = scan.nextInt(); // call nextInt() method on scanner object to get integer
        scan.nextLine();   // clear input buffer after using nextInt

        System.out.print("Please Enter Third Integer: ");
        int thirdInt = scan.nextInt(); // call nextInt() method on scanner object to get integer
        scan.nextLine();   // clear input buffer after using nextInt

        double average = (firstInt + secondInt + thirdInt) / 3.0;
        System.out.println("The average of " + firstInt + ", " + secondInt + ", " + thirdInt + " is " + average);


        scan.close();  // do this when you are done with the scanner
    }
}
