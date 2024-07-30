import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(productName);
            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
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


        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        Product result = binarySearch(products, "Watch");
        System.out.println(result != null ? "Product Found: " + result : "Product Not Found");
    }
}
