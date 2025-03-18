import java.io.*;
import java.util.*;



abstract class FileHandler {
    public abstract List<Product> readData(String filePath) throws IOException;
    public abstract void writeData(String filePath, List<Product> products) throws IOException;
}
