package homeworkweek7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO” 17.
 */

import java.util.Scanner;

public class Programme16 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the entered number is positive, negative, or zero
        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }

        // Close the scanner
        scanner.close();
    }
}
