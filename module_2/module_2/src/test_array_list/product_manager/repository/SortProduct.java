package ss11_Java_Collection_Framework.bai_tap.product_manager.repository;

import ss11_Java_Collection_Framework.bai_tap.product_manager.model.Product;

import java.util.Comparator;

public class SortProduct implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }

    }
}
