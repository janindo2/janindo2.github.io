import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "Alex";
        int age = 18;
        char theCharacter = 'A';
        double interestRate = 3.75;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Character: " + theCharacter);
        System.out.println("Interest Rate: " + interestRate);

        System.out.print("Enter any word: ");
        String userInput = scanner.nextLine();

        String theName;
        System.out.print("Enter your name: ");
        theName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int theAge = scanner.nextInt();

        int blinks = 200;
        int minutes = 7;
        double blinksPerMinute = (double) blinks / minutes;

        System.out.println("Blinks per minute: " + blinksPerMinute);

        System.out.print("Enter your account balance: ");
        double accountBalance = scanner.nextDouble();

        System.out.printf("Account Balance: %.2f\n", accountBalance);

        scanner.close();
    }
}
