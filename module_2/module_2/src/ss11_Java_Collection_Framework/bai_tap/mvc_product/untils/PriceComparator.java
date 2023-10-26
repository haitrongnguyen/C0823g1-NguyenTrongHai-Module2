package mvc_product.untils;

import mvc_product.models.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    private boolean sort;

    public PriceComparator(boolean sort) {
        this.sort = sort;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (sort) {
            return (int) (o1.getPrice() - o2.getPrice());
        } else {
            return (int) (o2.getPrice() - o1.getPrice());
        }
//        if (o1.getPrice()>o2.getPrice()){
//            return 1;
//        }else if (o1.getPrice().equals(o2.getPrice())){
//            return 0;
//        }
//        return -1;
    }
}
