package ss17_io_binary_file_serialization.bai_tap.services.impl;

import ss17_io_binary_file_serialization.bai_tap.models.Product;
import ss17_io_binary_file_serialization.bai_tap.repositories.IProductRepository;
import ss17_io_binary_file_serialization.bai_tap.repositories.impl.ProductRepository;
import ss17_io_binary_file_serialization.bai_tap.services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        productRepository.saveProduct(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepository.searchProduct(name);
    }

    @Override
    public boolean checkCode(int code) {
        return productRepository.checkCode(code);
    }
}
