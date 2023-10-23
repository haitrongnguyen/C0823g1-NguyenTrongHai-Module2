package ss11_Java_Collection_Framework.bai_tap.product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    List<Product> productsList = new ArrayList<>();

    public void displayList() {
        for (int i = 0; i < productsList.size(); i++) {
            Product product = productsList.get(i);
            System.out.println(product.toString());
        }

    }
}
