import java.io.*;
import java.util.*;
import com.inventory.*;

class OutputFileWriter extends FileHandler {

    @Override
    public void writeData(String filePath, List<Product> products) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Product product : products) {
                bw.write(product.getProductID() + ", " +
                         product.getProductName() + ", " +
                         product.getQuantity() + ", " +
                         product.getPrice() + ", " +
                         product.getStatus() + ", " +
                         product.getSupplier().getName());
                bw.newLine();
            }
        }
    }

    @Override
    public List<Product> readData(String filePath) {
        throw new UnsupportedOperationException("OutputFileWriter cannot read data.");
    }
}
