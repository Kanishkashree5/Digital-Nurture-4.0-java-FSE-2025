public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product("P001", "Mouse", 50, 299.99));
        manager.addProduct(new Product("P002", "Keyboard", 30, 699.99));
        manager.addProduct(new Product("P003", "Monitor", 20, 8499.50));

        // Display all
        manager.displayInventory();

        // Update product
        manager.updateProduct("P002", "Mechanical Keyboard", 25, 999.99);

        // Delete a product
        manager.deleteProduct("P003");

        // Final display
        manager.displayInventory();
    }
}
