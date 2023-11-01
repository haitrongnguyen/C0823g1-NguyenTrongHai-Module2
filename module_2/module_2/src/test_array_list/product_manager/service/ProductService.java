package test_array_list.product_manager.service;


import test_array_list.product_manager.repository.ProductRepository;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void showProduct() {
        productRepository.showProduct();
    }

    @Override
    public void addProduct() {
        productRepository.addProduct();
    }

    @Override
    public void editProduct() {
        productRepository.editProduct();
    }

    @Override
    public void deleteProduct() {
        productRepository.deleteProduct();
    }

    @Override
    public void sortUpProduct() {
        productRepository.sortUpProduct();
    }

    @Override
    public void sortDownProduct() {
        productRepository.sortDownProduct();
    }

    public void searchProduct() {
        productRepository.searchProduct();
    }
}
