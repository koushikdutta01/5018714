import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }


    public void updateProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(),   product);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        if (productMap.containsKey(productId))    {
            productMap.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayProducts() {
        for (Product product : productMap.values()) {
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getProductName() +
                    ", Quantity: " + product.getQuantity() + ", Price: " + product.getPrice());
        }
    }
}
