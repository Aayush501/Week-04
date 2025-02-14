package org.exception;

public class ExceptionPropagationInMethods {
    // created method1 that throws ArithmeticException
    public static void method1() throws ArithmeticException {
        System.out.println("Called Method-1");
        // taking dividend and divisor
        int dividend = 10;
        int divisor = 0;

        // performing division
        int quotient = dividend / divisor;
        System.out.println("Quotient: " + quotient);
    }

    // created method2 that calls method1
    public static void method2() {
        System.out.println("Called Method-2");
        method1();
    }

    // main method
    public static void main(String[] args) {
        try {
            method2();
        }
        // handling the exception
        catch (ArithmeticException a) {
            System.out.println("Handled exception in main");
        }
    }
}
