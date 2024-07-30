public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("01", "Apple", 10, 999.99);
        Product product2 = new Product("02", "Samsung", 20, 499.99);
        Product product3 = new Product("03", "Realme", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.displayProducts();

        product2.setQuantity(6);
        inventory.updateProduct(product2);

        inventory.deleteProduct("01");

        inventory.displayProducts();
    }
}
