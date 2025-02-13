package org.listinterface;

import java.util.Scanner;
import java.util.LinkedList;

public class FindElementFromLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // object of Scanner class
        // taking input for number of elements in the list
        System.out.println("How many numbers you wish to add in your list ?");
        int n = scanner.nextInt();

        LinkedList<Integer>list = new LinkedList<>(); // to store the elements

        System.out.println("Enter elements of LinkedList : ");
        for(int i=0; i<n; i++){ // taking input and inserting to linked list
            list.add(scanner.nextInt());
        }

        // kth element that we need to find
        System.out.println("Enter which number you want from last");
        int k = scanner.nextInt();

        System.out.println(kthElementFromLast(list, k));
    }

    // created a method to find the kth Element From Last
    static int kthElementFromLast(LinkedList<Integer>list, int k){
        int ans = -1;
        // removing the elements from the list until we get the desired element
        while(k>0){
            ans = list.removeLast();
            k--;
        }
        return ans;
    }

}
