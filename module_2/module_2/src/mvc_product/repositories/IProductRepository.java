package mvc_product.repositories;

import mvc_product.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void saveProduct(Product product);

    Product findById(Integer id);

    void deleteById(Integer id);

    void editProduct(Integer id, String name, Long price);

    List<Product> searchByName(String name);

    List<Product> sortUpProduct();

    List<Product> sortDownProduct();

    boolean checkId(Integer id);
}
