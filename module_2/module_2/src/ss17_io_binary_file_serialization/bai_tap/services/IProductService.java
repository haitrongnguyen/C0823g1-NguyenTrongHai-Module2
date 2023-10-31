package ss17_io_binary_file_serialization.bai_tap.services;

import ss17_io_binary_file_serialization.bai_tap.models.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> getAll();


    List<Product> searchProduct(String name);

    boolean checkCode(int code);
}
