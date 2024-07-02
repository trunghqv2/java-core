
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "banh ngot", 5, "hanhhung", "ngon"));
        products.add(new Product("2", "banh bao", 2, "hanhhung", "ngon"));
        products.add(new Product("3", "banh sukem", 3, "hanhhung", "ngon"));
        writeDataToFile("Product.txt", products);
        List<Product> ProductDataFromFile = readDataFromFile("Product.txt");
        for (Product Product : ProductDataFromFile) {
            System.out.println(Product);
        }
    }

    public static void writeDataToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

}
