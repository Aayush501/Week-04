package org.smartwarehouse;

// definition of Electronics class which extends WarehouseItem class
public class Electronics extends WarehouseItem {
    // overriding the setAttributes method of WarehouseItem class
    @Override
    public void setAttributes(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = "Electronics";
    }
}
