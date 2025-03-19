import java.io.*;
import java.util.*;
import com.inventory.*;

class InputFileReader extends FileHandler {

    @Override
    public List<Product> readData(String filePath) throws IOException {
        List<Product> products = new ArrayList<>();
        Map<Integer, Supplier> supplierMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Reading product file
            if (filePath.contains("ProductFile")) {
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 7) {
                        int productID = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        String description = parts[2].trim();
                        double price = Double.parseDouble(parts[3].trim().replace("$", "").trim());
                        int quantity = Integer.parseInt(parts[4].trim());
                        String status = parts[5].trim();
                        int supplierID = Integer.parseInt(parts[6].trim());

                        Supplier supplier = supplierMap.getOrDefault(supplierID, new Supplier(supplierID, "Unknown", "N/A", "N/A", "N/A"));

                        products.add(new Product(productID, name, description, price, quantity, status, supplier));
                    }
                }
            }

            // Reading supplier file
            else if (filePath.contains("SupplierFile")) {
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 5) {
                        int supplierID = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        String address = parts[2].trim();
                        String phone = parts[3].trim();
                        String email = parts[4].trim();

                        supplierMap.put(supplierID, new Supplier(supplierID, name, address, phone, email));
                    }
                }
            }
        }
        return products;
    }

    @Override
    public void writeData(String filePath, List<Product> products) {
        throw new UnsupportedOperationException("InputFileReader cannot write data.");
    }
}
