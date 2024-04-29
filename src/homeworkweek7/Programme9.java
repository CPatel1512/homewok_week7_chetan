package homeworkweek7;

import java.util.Scanner;

public class Programme9
/**
 *
 *Input any alphabet from “A" to “F” and print their city name accordingly
 * (use switch statement) if any other alphabet should be invalid entry
 */
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an alphabet from 'A' to 'F'
        System.out.print("Enter an alphabet from 'A' to 'F': ");
        String input = scanner.nextLine().toUpperCase();

        // Check if the input is a single character
        if (input.length() != 1) {
            System.out.println("Invalid entry. Please enter a single alphabet from 'A' to 'F'.");
        } else {
            // Get the character from the input
            char ch = input.charAt(0);

            // Use a switch statement to print the city name based on the character
            switch (ch) {
                case 'A':
                    System.out.println("City: Anand");
                    break;
                case 'B':
                    System.out.println("City: Baroda");
                    break;
                case 'C':
                    System.out.println("City: Chennai");
                    break;
                case 'D':
                    System.out.println("City: Delhi");
                    break;
                case 'E':
                    System.out.println("City: East Sikkim");
                    break;
                case 'F':
                    System.out.println("City: Faridabad");
                    break;
                default:
                    // If the input is not in the range 'A' to 'F', print an invalid entry message
                    System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
                    break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
