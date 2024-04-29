package homeworkweek7;

import java.util.Scanner;

public class Programme2 {
    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
     */
    public static void main(String[] args) {
        // Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the year");
        int year = scanner.nextInt();
        scanner.close();

        boolean a = (year % 4) == 0;//'==' verify if both operands are equal.
        boolean b = (year % 100) != 0;// '!=' verify if both operands are not equal.
        boolean c = ((year % 100 == 0) && (year % 400 == 0));//'&&' named logical: Logical and returns true if both operands are true
        //returns false if one or both operands are false.
        // if statement
        if (a && (b || c)) {
            System.out.println(year + "  is a leap year");

        } else {
            System.out.println(year + "  is not a leap year");

        }
    }


}


