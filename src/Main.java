import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String productFilePath = "ProductFile.txt";
        String supplierFilePath = "SupplierFile.txt";
        String outputPath = "output.txt";

        FileHandler productReader = new InputFileReader();
        FileHandler supplierReader = new InputFileReader();
        FileHandler writer = new OutputFileWriter();

        try {
            List<Product> products = productReader.readData(productFilePath);
            List<Product> suppliers = supplierReader.readData(supplierFilePath);

            products.addAll(suppliers); // Combine product and supplier data
            ProductSorter.sortProducts(products);

            writer.writeData(outputPath, products);
            System.out.println("Data successfully sorted and written to " + outputPath);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Data error: " + e.getMessage());
        }
    }
}
