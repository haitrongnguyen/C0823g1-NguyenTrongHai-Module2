package mvc_product.repositories.impl;

import mvc_product.models.Product;
import mvc_product.repositories.IProductRepository;
import mvc_product.untils.PriceComparator;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "A", 16000L));
        products.add(new Product(2, "B", 15000L));
        products.add(new Product(3, "C", 17000L));
        products.add(new Product(4, "D", 16000L));

    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void saveProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(Integer id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
                break;
            }
        }
    }

    @Override
    public void editProduct(Integer id, String name, Long price) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> returnProduct = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name) || product.getName().contains(name.toUpperCase())) {
                returnProduct.add(product);
            }
        }
        return returnProduct;
    }

    @Override
    public List<Product> sortUpProduct() {
        PriceComparator priceComparator = new PriceComparator(true);
        Collections.sort(products, priceComparator);
        return products;
    }

    @Override
    public List<Product> sortDownProduct() {
        PriceComparator priceComparator = new PriceComparator(false);
        Collections.sort(products, priceComparator);
        return products;
    }

    @Override
    public boolean checkId(Integer id) {
        for (Product product: products){
            if (product.getId().equals(id)){
                return true;
            }
        }
        return false;
    }


}
