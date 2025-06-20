import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update Product
    public void updateProduct(String productId, String name, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product updated: " + p);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(String productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display All Products
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}