package org.exception;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in); // Scanner object
            // taking input for dividend and divisor
            System.out.println("Enter The Dividend: ");
            int dividend = sc.nextInt();
            System.out.println("Enter The Divisor: ");
            int divisor = sc.nextInt();

            // performing division
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            System.out.println("Quotient: " + quotient + "\n" + "Remainder: " + remainder);
        }
        // handling potential exception
        catch (ArithmeticException a) {
            System.out.println("Arithmetic Exception Occurred. This Division Cannot Be Completed.");
        }
        // finally block
        finally { // it will always execute
            System.out.println("Operation completed");
        }
    }
}