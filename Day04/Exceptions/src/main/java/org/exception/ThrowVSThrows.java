package org.exception;

import java.util.Scanner;

public class ExceptionPropagation {

    // created a method to calculate the interest
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException { // by throws, exception propagates to the caller
         if (amount<0 || rate<0 || years<0) {
            throw new IllegalArgumentException(); // throwing IllegalArgumentException
        }
        return (amount * rate * years) / 100; // returning the interest
    }

    public static void main(String[] args) {
        // taking inputs for amount, rate, and years
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter Rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter Years:");
        int years = sc.nextInt();

        try {
            // displaying the output
            System.out.println("Simple Interest For " + amount + " Rs, for " + years + " years at " + rate + "% interest: " + calculateInterest(amount, rate, years));
        }
        // handling the exception
        catch (IllegalArgumentException i) {
            System.out.println("Invalid input: Amount, rate, and years must be positive");
        }
    }
}
