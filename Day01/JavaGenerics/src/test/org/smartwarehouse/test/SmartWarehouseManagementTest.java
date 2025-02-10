package org.smartwarehouse.test;

import org.junit.jupiter.api.Test;
import org.smartwarehouse.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartWarehouseManagementTest {
    // created a method to test the solution of SmartWarehouseManagement code
    @Test
    public void testing() {
        // declaring the objects of various items classes
        Electronics test1 = new Electronics();
        Groceries test2 = new Groceries();
        Furniture test3 = new Furniture();

        // object of Storage class
        Storage<WarehouseItem> storage = new Storage<>();

        // adding attributes to the objects and adding them to the storage
        test1.setAttributes("Fan", 1200, 2);
        storage.addItem(test1);
        test2.setAttributes("Tomato", 120, 5);
        storage.addItem(test2);
        test3.setAttributes("Table", 12000, 1);
        storage.addItem(test3);

        // getting the list of items from storage
        List<WarehouseItem> expectedResult = storage.getItems();

        // performing tests
        assertEquals(test1, expectedResult.getFirst());
        assertEquals(test2, expectedResult.get(1));
        assertEquals(test3, expectedResult.get(2));
    }
}
