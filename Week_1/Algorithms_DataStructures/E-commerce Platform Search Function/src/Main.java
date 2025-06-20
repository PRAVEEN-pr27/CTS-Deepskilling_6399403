import java.util.Arrays;

public class Main {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int low = 0, high = sortedProducts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedProducts[mid].productId == targetId) {
                return sortedProducts[mid];
            } else if (sortedProducts[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(105, "Mouse", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(102, "T-Shirt", "Fashion"),
                new Product(104, "Charger", "Electronics")
        };

        int searchId = 103;

        System.out.println("🔍 Linear Search Result:");
        Product foundLinear = linearSearch(products, searchId);
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        Arrays.sort(products); // Required for binary search

        System.out.println("\n🔍 Binary Search Result:");
        Product foundBinary = binarySearch(products, searchId);
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}
