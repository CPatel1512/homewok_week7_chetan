package homeworkweek7;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Programme20 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        // Create an array to hold the elements
        int[] array = new int[numElements];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt the user to enter the value to search for
        System.out.print("Enter the value to search for: ");
        int valueToSearch = scanner.nextInt();

        // Check if the array contains the specified value
        boolean containsValue = contains(array, valueToSearch);

        // Print the result
        if (containsValue) {
            System.out.println("The array contains the value " + valueToSearch + ".");
        } else {
            System.out.println("The array does not contain the value " + valueToSearch + ".");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * Function to check if an array contains a specific value.
     * @param array The array to search
     * @param value The value to search for
     * @return True if the array contains the value, False otherwise
     */
    public static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}
