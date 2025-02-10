package org.smartwarehouse;
import java.util.Scanner;

// definition of SmartWarehouseManagement class
public class SmartWarehouseManagement {
    // main method
    public static void main(String[] args) {
        Storage<WarehouseItem> storage = new Storage<>(); // object of storage class
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for number of items from user
        System.out.println("Enter Number of items: ");
        int numberOfItems = sc.nextInt();

        // taking inputs for items from user
        System.out.println("Enter Items: ");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Select Type: \n1) For Electronics\n2) For Groceries\n3) For Furniture");
            int type = sc.nextInt();

            // creating object of class as per selection of the user
            WarehouseItem obj = (type == 1)? new Electronics() :(type == 2)? new Groceries() :(type == 3)? new Furniture() : null;

            // if user enters wrong value for selection of type
            if (obj == null) {
                System.out.println("Please Select A Valid Type.");
                i--; // so that user can enter as many elements as he wants
                continue;
            }

            // taking inputs for the attributes
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Price: ");
            double price = sc.nextDouble();
            System.out.println("Enter Quantity: ");
            int quantity = sc.nextInt();

            obj.setAttributes(name, price, quantity); // setting attributes
            storage.addItem(obj); // adding item to storage

            System.out.println();
        }

        // displaying details of all items
        System.out.println("Displaying All Items:");
        WarehouseItem.displayItems(storage.getItems());
    }
}