package homeworkweek7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Check if the input character is a digit (number) or alphabet (letter)
        if (Character.isDigit(inputChar)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(inputChar)) {
            System.out.println("The input is an alphabet.");
        } else {
            // If the input character is neither a digit nor a letter, it is considered a symbol
            System.out.println("The input is a symbol.");
        }

        scanner.close();
    }
}
