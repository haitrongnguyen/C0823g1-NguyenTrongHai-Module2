package mvc_product.controllers;

import mvc_product.models.Product;
import mvc_product.services.IProductService;
import mvc_product.services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public List<Product> getAll() {
        return productService.getAll();
    }

    public void addProduct(Product product) {
        productService.creatProduct(product);
    }

    public Boolean removeProduct(int id) {
        return productService.removeProduct(id);
    }

    public Boolean editProduct(Integer id, String name, Long price) {
        return productService.editProduct(id, name, price);
    }

    public List<Product> searchByName(String name) {
        return productService.searchByName(name);
    }

    public List<Product> sortUpProduct() {
        return productService.sortProduct();
    }

    public List<Product> sortDownProduct() {
        return productService.sortDownProduct();
    }

    public boolean checkId(Integer id) {
       return productService.checkId(id);
    }
}
