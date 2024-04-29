package homeworkweek7;

import java.util.Scanner;

public class Programme5 {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF P
     * rint in following format _______________________________ |
     * Salary Slip | |______________________________|
     * | Employee Id : 2564 |
     * | Employee Name : Chetan |
     * |______________________________|
     * | Basic Salary : 25000.0 |
     * | HRA 10% : 2500.0 |
     * | TA 8% : 2250.0 |
     * | DA 9% : 2000.0 |
     * | PF - 20& : 5000.0 |
     * |______________________________|
     * | Gross Salary : 26750.0 |
     * |===========================|
     */


        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            // Calculate HRA, TA, DA, and PF based on the basic salary
            double hra = basicSalary * 0.10;  // 10% of basic salary
            double ta = basicSalary * 0.09;  // 9% of basic salary
            double da = basicSalary * 0.08;  // 8% of basic salary
            double pf = basicSalary * 0.20;  // 20% of basic salary

            // Calculate the gross salary
            double grossSalary = basicSalary + hra + ta + da - pf;

            // Print the salary slip in the specified format
            System.out.println(" _______________________________ ");
            System.out.println("|       Salary Slip             |");
            System.out.println("|_______________________________|");
            System.out.printf("| Employee Id    : %-10d |\n", employeeId);
            System.out.printf("| Employee Name  : %-10s |\n", employeeName);
            System.out.println("|_______________________________|");
            System.out.printf("| Basic Salary   : %-10.2f |\n", basicSalary);
            System.out.printf("| HRA 10%%        : %-10.2f |\n", hra);
            System.out.printf("| TA 9%%          : %-10.2f |\n", ta);
            System.out.printf("| DA 8%%          : %-10.2f |\n", da);
            System.out.printf("| PF - 20%%       : %-10.2f |\n", pf);
            System.out.println("|_______________________________|");
            System.out.printf("| Gross Salary   : %-10.2f |\n", grossSalary);
            System.out.println("|===============================|");

            // Close the scanner
            scanner.close();
        }
}
