import java.io.*;
import java.util.*;

 public Supplier(int supplierID, String name, String address, String phone, String email) {
        this.supplierID = supplierID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
abstract class FileHandler {
    public abstract List<Product> readData(String filePath) throws IOException;
    public abstract void writeData(String filePath, List<Product> products) throws IOException;
}
