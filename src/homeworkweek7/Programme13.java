package homeworkweek7;

import java.util.Scanner;

public class Programme13 {
    /**
     *Write a Java program which input any number between 1 to 7
     * and it prints The Days name MONDAY,
     * TUESDAY…..SUNDAY of the week accordingly by using switch.
     * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Use a switch statement to determine the day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                // If the input number is not between 1 and 7, print a message
                System.out.println("Week contains 1 to 7 days.");
        }

        // Close the scanner
        scanner.close();
    }
}
