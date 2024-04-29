package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 */

public class Programme8 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an alphabet
        System.out.print("Enter an alphabet from 'A' to 'F': ");
        String input = scanner.nextLine().toUpperCase();

        // Check if the input is a single character
        if (input.length() != 1) {
            System.out.println("Invalid entry. Please enter a single alphabet from 'A' to 'F'.");
        } else {
            // Get the character from the input
            char ch = input.charAt(0);

            // Use an if-else statement to print the city name based on the character
            if (ch == 'A') {
                System.out.println("City: Ahmedabad");
            } else if (ch == 'B') {
                System.out.println("City: Bombay");
            } else if (ch == 'C') {
                System.out.println("City: Chennai");
            } else if (ch == 'D') {
                System.out.println("City: Delhi");
            } else if (ch == 'E') {
                System.out.println("City: East Sikkim");
            } else if (ch == 'F') {
                System.out.println("City: Faridabad");
            } else {
                System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
