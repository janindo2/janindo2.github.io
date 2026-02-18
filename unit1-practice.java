import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare and assign variables
        String name = "Alex";
        int age = 18;
        char theCharacter = 'A';
        double interestRate = 3.75;

        // Display the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Character: " + theCharacter);
        System.out.println("Interest Rate: " + interestRate);

        // Retrieve a value from the user
        System.out.print("Enter any word: ");
        String userInput = scanner.nextLine();

        // Declare theName and get user input
        String theName;
        System.out.print("Enter your name: ");
        theName = scanner.nextLine();

        // Declare theAge and get user input
        System.out.print("Enter your age: ");
        int theAge = scanner.nextInt();

        // Blinks per minute calculation
        int blinks = 200;
        int minutes = 7;
        double blinksPerMinute = (double) blinks / minutes;

        System.out.println("Blinks per minute: " + blinksPerMinute);

        // Account balance with 2 decimal places
        System.out.print("Enter your account balance: ");
        double accountBalance = scanner.nextDouble();

        System.out.printf("Account Balance: %.2f\n", accountBalance);

        scanner.close();
    }
}
