import java.util.*;

class ProductSorter {
    public static void sortProducts(List<Product> products) {
        products.sort(Comparator.comparing(Product::getProductId));
    }
}
