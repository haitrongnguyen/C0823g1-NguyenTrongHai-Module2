package ss17_io_binary_file_serialization.bai_tap.models;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private int price;
    private String manufacturer;
    private String productDescription;

    public Product() {
    }

    public Product(String name, int price, String manufacturer, String productDescription) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Product(int code, String name, int price, String manufacturer, String productDescription) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.productDescription = productDescription;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
