package ss17_io_binary_file_serialization.bai_tap.controller;

import ss17_io_binary_file_serialization.bai_tap.models.Product;
import ss17_io_binary_file_serialization.bai_tap.services.IProductService;
import ss17_io_binary_file_serialization.bai_tap.services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public List<Product> getAll() {
        return productService.getAll();
    }

    public List<Product> searchProduct(String name) {
        return productService.searchProduct(name);
    }


    public boolean checkCode(int code) {
        return productService.checkCode(code);
    }
}
