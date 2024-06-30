import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Product with id " + id + " not found.");
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public List<Product> searchProductByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public void sortProductsByPrice(boolean ascending) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (ascending) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                } else {
                    return Double.compare(p2.getPrice(), p1.getPrice());
                }
            }
        });
    }
}

