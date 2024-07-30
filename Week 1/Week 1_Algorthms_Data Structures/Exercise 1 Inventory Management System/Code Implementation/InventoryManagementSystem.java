package com.inventory.main;

import com.inventory.model.Product;
import com.inventory.service.Inventory;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        Product p1 = new Product(1, "Product A", 100, 10.0);
        Product p2 = new Product(2, "Product B", 150, 15.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        // Update product
        inventory.updateProduct(1, 120, null);

        // Delete product
        inventory.deleteProduct(2);

        // Get product
        System.out.println(inventory.getProduct(1));
        System.out.println(inventory.getProduct(2));
    }
}
