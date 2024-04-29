package homeworkweek7;

public class Programme11 {
/**
 *
 *Write a java program to print the numbers
 * between 1 and 100 which can
 * be divided by 3 and 5 separately.
 */
public static void main(String[] args) {
    // Iterate through numbers from 1 to 100
    for (int i = 1; i <= 100; i++) {
        // Check if the number is divisible by 3 and not divisible by 5
        if (i % 3 == 0 && i % 5 != 0) {
            System.out.println(i + " is divisible by 3 but not by 5");
        }

        // Check if the number is divisible by 5 and not divisible by 3
        if (i % 5 == 0 && i % 3 != 0) {
            System.out.println(i + " is divisible by 5 but not by 3");
        }
    }
}

}
