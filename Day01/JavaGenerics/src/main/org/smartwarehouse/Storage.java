package org.smartwarehouse;
import java.util.ArrayList;
import java.util.List;

// definition of generic class - Storage
public class Storage <T extends WarehouseItem> {
    private List <T> items; // list of items

    // non parameterized constructor to initialize the list
    public Storage() {
        items = new ArrayList<>();
    }

    // method to add items in the list
    public void addItem(T obj) {
        items.add(obj);
    }

    // method to get list of items
    public List<T> getItems() {
        return items;
    }
}
