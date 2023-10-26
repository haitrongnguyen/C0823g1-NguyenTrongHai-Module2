package test_array_list;

import mvc_product.models.Product;

import java.util.*;

public class TestArrayList implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o2.getPrice()>o1.getPrice()){
            return 1;
        }else if (Objects.equals(o2.getPrice(), o1.getPrice())){
            return 0;
        }
        return -1;
    }

}
