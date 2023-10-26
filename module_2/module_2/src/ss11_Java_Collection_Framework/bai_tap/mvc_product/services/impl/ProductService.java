package mvc_product.services.impl;

import mvc_product.models.Product;
import mvc_product.repositories.IProductRepository;
import mvc_product.repositories.impl.ProductRepository;
import mvc_product.services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void creatProduct(Product product) {
        productRepository.saveProduct(product);
    }

    @Override
    public Boolean removeProduct(Integer id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            return false;
        } else {
            productRepository.deleteById(id);
            return true;
        }

    }

    @Override
    public Boolean editProduct(Integer id, String name, Long price) {
        Product product = productRepository.findById(id);
        if (product == null) {
            return false;
        } else {
            productRepository.editProduct(id, name, price);
            return true;
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    @Override
    public List<Product> sortProduct() {
        return productRepository.sortUpProduct();
    }

    @Override
    public List<Product> sortDownProduct() {
        return productRepository.sortDownProduct();
    }

    @Override
    public boolean checkId(Integer id) {
        return productRepository.checkId(id);
    }


}
