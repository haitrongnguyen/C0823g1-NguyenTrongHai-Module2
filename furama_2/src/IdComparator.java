import java.util.Comparator;

public class IdComparator {
    Comparator<Product> comparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() == o2.getId()) {
                return 0;
            }
            return -1;

        }
    };
}
