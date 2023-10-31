package ss17_io_binary_file_serialization.bai_tap.repositories;

import ss17_io_binary_file_serialization.bai_tap.models.Product;

import java.util.List;

public interface IProductRepository {
    void saveProduct(Product product);

    List<Product> getAll();

    List<Product> searchProduct(String name);

    boolean checkCode(int code);
}
