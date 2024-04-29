package homeworkweek7;
/**
 /*
 /*
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even using if-else condition
        if (number % 2 == 0) {
            // If the remainder of division by 2 is 0, the number is even
            System.out.println("The number " + number + " is even.");
        } else {
            // If the remainder of division by 2 is not 0, the number is odd
            System.out.println("The number " + number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
