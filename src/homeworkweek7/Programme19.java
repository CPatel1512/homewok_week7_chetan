package homeworkweek7;

import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements
 */
public class Programme19 {
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

        // Calculate the sum of the array elements
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        // Calculate the average
        double average = sum / (double) numElements;

        // Print the average
        System.out.println("The average value of the array elements is: " + average);

        // Close the scanner
        scanner.close();
    }

}
