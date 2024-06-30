import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    private static final String FILENAME = "products.dat";
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        saveProductsToFile();
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm hiện đang trống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public Product findProductByCode(String productCode) {
        for (Product product : products) {
            if (product.getProductCode().equalsIgnoreCase(productCode)) {
                return product;
            }
        }
        return null;
    }

    private void saveProductsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        while (true) {
            System.out.println("\n----- Quản lý sản phẩm -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo mã");
            System.out.println("0. Thoát");

            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String code = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả sản phẩm: ");
                    String description = scanner.nextLine();

                    Product newProduct = new Product(code, name, price, manufacturer, description);
                    manager.addProduct(newProduct);
                    System.out.println("Đã thêm sản phẩm thành công.");
                    break;
                case 2:
                    manager.displayProducts();
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
                    String searchCode = scanner.nextLine();
                    Product foundProduct = manager.findProductByCode(searchCode);
                    if (foundProduct != null) {
                        System.out.println("Thông tin sản phẩm:");
                        System.out.println(foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã " + searchCode);
                    }
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }
}
