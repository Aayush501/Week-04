package org.dynamiconlinemarketplace.test;

import org.dynamiconlinemarketplace.BookCategory;
import org.dynamiconlinemarketplace.ClothingCategory;
import org.dynamiconlinemarketplace.GadgetCategory;
import org.dynamiconlinemarketplace.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    // created a method to test the solution of mealPlanGenerator code
    @Test
    public void testing() {
        // Create instances of different product categories
        BookCategory bookCategory = new BookCategory("Thriller");
        ClothingCategory clothingCategory = new ClothingCategory("Blazer");
        GadgetCategory gadgetCategory = new GadgetCategory("Power Bank");

        // Create instances of products
        Product<BookCategory> book = new Product<>("The Way Of Kings", 150.0, bookCategory);
        Product<ClothingCategory> blazer = new Product<>("Formal Blazer", 290.99, clothingCategory);
        Product<GadgetCategory> powerBank = new Product<>("NVIDIA", 999.99, gadgetCategory);

        // Apply discounts to products
        Product.applyDiscount(book, 10); // 10% discount
        Product.applyDiscount(blazer, 20); // 20% discount
        Product.applyDiscount(powerBank, 5); // 5% discount

        assertEquals(135.0, book.getPrice());
        assertEquals(232.792, blazer.getPrice());
        assertEquals(949.9905, powerBank.getPrice());
    }
}
