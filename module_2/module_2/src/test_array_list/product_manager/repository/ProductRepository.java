package ss11_Java_Collection_Framework.bai_tap.product_manager.repository;

import ss11_Java_Collection_Framework.bai_tap.product_manager.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        productsList.add(new Product(1, "a", 100));
        productsList.add(new Product(2, "b", 200));
        productsList.add(new Product(3, "c", 300));
        productsList.add(new Product(4, "d", 400));
        productsList.add(new Product(5, "e", 500));
    }

    @Override
    public void showProduct() {
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i));
        }
    }

    @Override
    public void addProduct() {
        int id;
        int inputId;
        do {
            System.out.println("Nhập id: ");
            inputId = Integer.parseInt(scanner.nextLine());
            if (checkId(inputId)) {
                System.out.println("Nhập lại id");
            } else {
                id = inputId;
                break;
            }
        } while (true);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int prince = Integer.parseInt(scanner.nextLine());
        if (!name.equals(" ") && prince != 0) {
            Product products = new Product(id, name, prince);
            productsList.add(products);
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm không thành công");
        }
    }

    @Override
    public void editProduct() {
        int id;
        int inputId;
        do {
            System.out.println("Nhập id của sản phẩm muốn sửa");
            inputId = Integer.parseInt(scanner.nextLine());
            if (checkId(inputId)) {
                for (Product p : productsList) {
                    if (inputId == p.getId()) {
                        System.out.println("Nhập id mới");
                        p.setId(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Nhập tên mới");
                        p.setProductName(scanner.nextLine());
                        System.out.println("Nhập giá");
                        p.setPrice(Integer.parseInt(scanner.nextLine()));
                    }
                }
                break;
            } else {
                System.out.println("Id không tồn tại");
            }
        } while (true);


    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập id của sản phẩm cần xóa");
        int inputId = Integer.parseInt(scanner.nextLine());
        if (checkId(inputId)) {
            for (int i = 0; i < productsList.size(); i++) {
                Product products = productsList.get(i);
                if (inputId == products.getId()) {
                    productsList.remove(products);
                    System.out.println("Xóa thành công");
                }
            }
        } else {
            System.out.println("Id không tồn tại");
        }

    }

    @Override
    public void sortUpProduct() {
        Collections.sort(productsList, new SortProduct());
    }

    @Override
    public void sortDownProduct() {
        productsList.sort(Product::compareTo);
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        String inputName = scanner.nextLine();
        boolean checkName = false;
        Product products = null;
        for (int i = 0; i < productsList.size(); i++) {
            if (inputName.equals(productsList.get(i).getProductName())) {
                checkName = true;
                products = productsList.get(i);
            }
        }
        if (checkName) {
            System.out.println("Sản phẩm: " + products);
        } else {
            System.out.println("Không tìm thấy");
        }
    }


    public boolean checkId(int id) {
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                return true;
            }
        }
        return false;
    }


}
