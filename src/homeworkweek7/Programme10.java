package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */


public class Programme10 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter a mathematical operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Initialize a variable to store the result
        double result;

        // Use an if-else statement to perform the corresponding operation based on the operator
        if (operator == '+') {
            // Addition
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            // Subtraction
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            // Multiplication

            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            // Division
            // Check if the divisor is zero to avoid division by zero error
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            }
        } else {
            // Invalid operator
            System.out.println("Invalid operator. Please enter one of the following: +, -, *, /.");
        }

        // Close the scanner
        scanner.close();
    }
}
