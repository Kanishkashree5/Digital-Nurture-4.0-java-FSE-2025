import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Shoes", "Fashion"),
                new Product("P003", "Mobile", "Electronics"),
                new Product("P004", "Watch", "Accessories"),
                new Product("P005", "T-shirt", "Fashion")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = SearchEngine.linearSearch(products, "Watch");
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");

        // Sort array by productName for binary search
        Arrays.sort(products);

        System.out.println("\n=== Binary Search ===");
        Product result2 = SearchEngine.binarySearch(products, "Watch");
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
    }
}