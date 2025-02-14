package org.exception.custom;

import java.util.Scanner;

public class Main {
    // created static method validateAge to validate the age
    static boolean validateAge(int age) throws Exception {
        Exception InvalidAgeException = new InvalidAgeException(); // InvalidAgeException object
        if (age<18) throw InvalidAgeException; // throw InvalidAgeException
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object
        // taking input for age
        System.out.println("Enter Age:");
        int age = sc.nextInt();

        try {
            if (validateAge(age)) { // validating age
                System.out.println("Access Granted!");
            } else  {
                System.out.println("Access Denied");
            }
        }
        // handling exception
        catch (Exception i) {
            System.out.println(i.getMessage());
        }
    }
}
