class Product {
    static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;
    final int productID;

    // Constructor
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: " + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 101, 75000.0, 2);
        Product prod2 = new Product("Smartphone", 102, 30000.0, 1);

        prod1.displayProductDetails();
        prod2.displayProductDetails();

        // Updating discount
        Product.updateDiscount(15.0);

        System.out.println("After updating discount:");
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
