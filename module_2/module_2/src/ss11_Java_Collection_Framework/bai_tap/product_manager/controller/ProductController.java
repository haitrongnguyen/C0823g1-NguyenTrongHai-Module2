package ss11_Java_Collection_Framework.bai_tap.product_manager.controller;

import ss11_Java_Collection_Framework.bai_tap.product_manager.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public void showProduct() {
        productService.showProduct();
    }

    public void addProduct() {
        productService.addProduct();
    }

    public void editProduct() {
        productService.editProduct();
    }

    public void deleteProduct() {
        productService.deleteProduct();
    }

    public void sortUpProduct() {
        productService.sortUpProduct();
    }

    public void sortDownProduct() {
        productService.sortDownProduct();
    }

    public void searchProduct() {
        productService.searchProduct();
    }
}
