import java.util.*;

public class Product {
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"a"));
        products.add(new Product(2,"b"));
        products.add(new Product(3,"c"));
        products.add(new Product(4,"d"));
        System.out.println(products.size());
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId()<o2.getId()?1:-1;
            }
        });
        for(Product p: products){
            System.out.println(p);
        }

    }
}
