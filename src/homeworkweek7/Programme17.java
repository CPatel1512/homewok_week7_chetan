package homeworkweek7;

import java.util.Arrays;
/**
 * Write a Java program to sort a numeric array and a string array
 */

public class Programme17 {

    public static void main(String[] args) {
        // Create a numeric array
        int[] numericArray = {5, 3, 8, 1, 2, 7};
        // Create a string array
        String[] stringArray = {"banana", "apple", "orange", "grape", "cherry"};

        // Sort the numeric array
        Arrays.sort(numericArray);
        // Sort the string array
        Arrays.sort(stringArray);

        // Print the sorted numeric array
        System.out.println("Sorted numeric array:");
        for (int number : numericArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Print the sorted string array
        System.out.println("Sorted string array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
