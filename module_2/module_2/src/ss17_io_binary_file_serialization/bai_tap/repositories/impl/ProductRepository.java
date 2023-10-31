package ss17_io_binary_file_serialization.bai_tap.repositories.impl;


import ss17_io_binary_file_serialization.bai_tap.models.Product;
import ss17_io_binary_file_serialization.bai_tap.repositories.IProductRepository;
import ss17_io_binary_file_serialization.bai_tap.utils.readAndWrite.ReadProduct;
import ss17_io_binary_file_serialization.bai_tap.utils.readAndWrite.WriteProductsToFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    private static final String PATH = "src/ss17_io_binary_file_serialization/bai_tap/data/student.txt";

    @Override
    public void saveProduct(Product product) {
        productList = ReadProduct.readProducts(PATH);
        productList.add(product);
        WriteProductsToFile.writeProduct(PATH, productList);
    }

    @Override
    public List<Product> getAll() {
        return ReadProduct.readProducts(PATH);
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products = ReadProduct.readProducts(PATH);
        List<Product> products1 = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                products1.add(product);
            }
        }
        return products1;
    }

    @Override
    public boolean checkCode(int code) {
        List<Product> products = ReadProduct.readProducts(PATH);
        for (Product product : products) {
            if (product.getCode() == code) {
                return true;
            }
        }
        return false;
    }
}
