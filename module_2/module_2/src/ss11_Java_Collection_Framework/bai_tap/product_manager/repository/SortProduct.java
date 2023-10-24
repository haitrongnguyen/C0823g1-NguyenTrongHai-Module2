package ss11_Java_Collection_Framework.bai_tap.product_manager.repository;

import ss11_Java_Collection_Framework.bai_tap.product_manager.model.Products;

import java.util.Comparator;

public class SortProduct implements Comparator<Products> {

    @Override
    public int compare(Products o1, Products o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }

    }
}
