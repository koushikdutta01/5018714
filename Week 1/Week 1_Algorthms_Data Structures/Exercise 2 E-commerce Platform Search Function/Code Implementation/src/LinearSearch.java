public class LinearSearch {
    public static Product linearSearch(Product[] products, String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Shirt", "Apparel"),
                new Product("3", "Watch", "Accessories")
        };

        Product result = linearSearch(products, "Watch");
        System.out.println(result != null ? "Product Found: " + result : "Product Not Found");
    }
}
