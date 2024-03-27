import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String args[]) {

        // String to be scanned to find the pattern.
        String liimport java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private static final int MAX_ITEMS = 10;
    private Product[] cartItems;
    private int itemCount;

    public ShoppingCart() {
        cartItems = new Product[MAX_ITEMS];
        itemCount = 0;
    }

    public void addProduct(Product product) {
        if (itemCount < MAX_ITEMS) {
            cartItems[itemCount++] = product;
            System.out.println(product.getName() + " added to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            Product product = cartItems[i];
            System.out.println(product.getName() + " - $" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class Inventory {
    private static final int MAX_PRODUCTS = 10;
    private Product[] products;
    private int productCount;

    public Inventory() {
        products = new Product[MAX_PRODUCTS];
        productCount = 0;

        // Initialize some products
        addProduct(new Product("Product1", 25.99));
        addProduct(new Product("Product2", 19.99));
        addProduct(new Product("Product3", 29.99));
    }

    public void addProduct(Product product) {
        if (productCount < MAX_PRODUCTS) {
            products[productCount++] = product;
        } else {
            System.out.println("The inventory is full. Cannot add more products.");
        }
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public Product getProductByName(String productName) {
        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
}

class User {
    private String username;
    private ShoppingCart cart;

    public User(String username, ShoppingCart cart) {
        this.username = username;
        this.cart = cart;
    }

    public String getUsername() {
        return username;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize products and inventory
        Inventory inventory = new Inventory();

        // Initialize a user with an empty shopping cart
        User user = new User("username", new ShoppingCart());

        // Display available products to the user
        inventory.displayProducts();

        // Allow the user to add products to the cart
        String userInput;
        do {
            System.out.print("Enter the product name to add to the cart (or 'exit' to finish): ");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("exit")) {
                Product selectedProduct = inventory.getProductByName(userInput);
                if (selectedProduct != null) {
                    user.getCart().addProduct(selectedProduct);
                } else {
                    System.out.println("Product not found. Please try again.");
                }
            }

        } while (!userInput.equalsIgnoreCase("exit"));

        // Display the final order summary
        user.getCart().displayCart();

        scanner.close();
    }
}ne = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
    }
}