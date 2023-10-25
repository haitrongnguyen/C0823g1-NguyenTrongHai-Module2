package ss11_Java_Collection_Framework.bai_tap.product_manager.model;

public class Product implements Comparable<Product> {
    private int id;
    private String productName;
    private int price;

    public Product() {
    }

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ", Name: " + productName +
                ", price: " + price;
    }

    @Override
    public int compareTo(Product products) {
        return Integer.compare(this.getPrice(),products.getPrice());
    }
    public int compare(Product products){
        return Integer.compare(products.getPrice(),this.getPrice());
    }
}
