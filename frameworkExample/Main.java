
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Thêm sản phẩm
        manager.addProduct(new Product(1, "Laptop", 1200.0));
        manager.addProduct(new Product(2, "Smartphone", 800.0));
        manager.addProduct(new Product(3, "Tablet", 500.0));

        System.out.println("Danh sách sản phẩm:");
        manager.displayProducts();

        manager.updateProduct(2, "Smartphone Pro", 950.0);
        System.out.println("\nDanh sách sản phẩm sau khi cập nhật:");
        manager.displayProducts();

        
        manager.deleteProduct(3);
        System.out.println("\nDanh sách sản phẩm sau khi xóa:");
        manager.displayProducts();

        System.out.println("\nTìm kiếm sản phẩm theo tên 'Laptop':");
        List<Product> foundProducts = manager.searchProductByName("Laptop");
        for (Product product : foundProducts) {
            System.out.println(product);
        }

        manager.sortProductsByPrice(true);
        System.out.println("\nDanh sách sản phẩm sắp xếp tăng dần theo giá:");
        manager.displayProducts();

        manager.sortProductsByPrice(false);
        System.out.println("\nDanh sách sản phẩm sắp xếp giảm dần theo giá:");
        manager.displayProducts();
    }
}

