public class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (orders[j].getTotalPrice() > orders[j+1].getTotalPrice()) {
                    // Swap orders[j+1] and orders[i]
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order("1", "Alice", 250.50),
                new Order("2", "Bob", 150.75),
                new Order("3", "Charlie", 350.00)
        };

        bubbleSort(orders);

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
