package homeworkweek7;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {
    // Method to calculate the sum of an array
    public static int sumArray(int[] array) {
        int sum = 0; // Initialize sum to 0

        // Loop through the array and add each element to the sum
        for (int num : array) {
            sum += num;
        }

        // Return the total sum
        return sum;
    }

    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum of the array using the sumArray method
        int sum = sumArray(numbers);

        // Print the sum
        System.out.println("The sum of the array is: " + sum);
    }
}
