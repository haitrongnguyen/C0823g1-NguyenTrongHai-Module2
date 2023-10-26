package mvc_product.services;

import mvc_product.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void creatProduct(Product product);

    Boolean removeProduct(Integer id);

    Boolean editProduct(Integer id, String name, Long price);

    List<Product> searchByName(String name);

    List<Product> sortProduct();

    List<Product> sortDownProduct();

    boolean checkId(Integer id);
}
