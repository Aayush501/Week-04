package org.smartwarehouse;
import java.util.List;

// definition of WarehouseItem class which is abstract
abstract public class WarehouseItem {
    // declaring the attributes of this class
    String type, name;
    double price;
    int quantity;

    // definition of abstract method to set the attributes of the object
    abstract protected void setAttributes(String name, double price, int quantity);

    // static method to display all items in the storage
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) { // iteration through the list of items
            // printing the details
            System.out.println("Product type: " + item.type);
            System.out.println("Name: " + item.name + "\nPrice: " + item.price + "\nQuantity: " + item.quantity + "\n");
        }
    }
}
