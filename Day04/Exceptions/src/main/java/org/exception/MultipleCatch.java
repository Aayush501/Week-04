package org.exception;

import java.util.Random;
import java.util.Scanner;

public class MultipleCatch {
    static int [] generateRandomArray (int n) {
        if(n==0) return null;

        int [] arr = new int[n];
        Random random = new Random(); // initializing the random number generator

        // adding random integers in the array
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(11);
        }

        return arr; // returning the random array
    }

    public static void main(String[] args) {
        // taking inputs from user to generate an integer array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want to add in the random array");
        int number = sc.nextInt();

        int [] arr = generateRandomArray(number); // generating array with random numbers

        System.out.println("Enter index of which you want to access the element: ");
        int index = sc.nextInt();

        try {
            // printing the output
            System.out.println("Value at index " + index + " : " + arr[index]);
        }
        // handling the exceptions with multiple catch blocks
        catch (NullPointerException n) {
            System.out.println("Array is not initialized!");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Invalid index!");
        }
    }
}
