import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int quantity;

    // Default constructor
    Product() {
    }

    // Parameterized constructor
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString()
    @Override
    public String toString() {
        double total = price * quantity;

        if (total == (long) total) {
            return productName + " x" + quantity + " = " + (long) total;
        }

        return productName + " x" + quantity + " = " + total;
    }
}


class Order {
    private String orderId;
    private List<Product> products;

    // Default constructor
    Order() {
        products = new ArrayList<>();
    }

    // Parameterized constructor
    Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate total
    public double calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }

        return total;
    }

    // toString()
    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\n";
        result += "Products:\n";

        for (Product p : products) {
            result += p + "\n";
        }

        double total = calculateTotal();

        if (total == (long) total) {
            result += "Total: " + (long) total;
        } else {
            result += "Total: " + total;
        }

        return result;
    }
}


public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Order ID
        String orderId = sc.nextLine();

        // Create Order
        Order order = new Order(orderId);

        // Number of products
        int n = Integer.parseInt(sc.nextLine());

        // Read products
        for (int i = 0; i < n; i++) {

            String[] data = sc.nextLine().split(",");

            String productName = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            Product product =
                    new Product(productName, price, quantity);

            order.addProduct(product);
        }

        // Display order
        System.out.println(order);

        sc.close();
    }
}