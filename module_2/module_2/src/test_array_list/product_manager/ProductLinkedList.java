package test_array_list.product_manager;

import ss11_Java_Collection_Framework.bai_tap.product_manager.model.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductLinkedList {
    private static List<Product> productsList = new LinkedList<>();

    static {
        Product product1 = new Product(1, "a", 100);
        Product product2 = new Product(2, "b", 200);
        Product product3 = new Product(3, "c", 300);
        Product product4 = new Product(4, "d", 400);
        Product product5 = new Product(5, "e", 500);
        productsList.add(product1);
        productsList.add(product5);
        productsList.add(product3);
    }

    Scanner scanner = new Scanner(System.in);

    public void displayList() {
        for (Product products : productsList) {
            System.out.println(products);
        }
    }

    public void addProduct() {
        int id;
        String name;
        int price;
        boolean checkId = false;
        do {
            System.out.println("Nhập id");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < productsList.size(); i++) {
                Product products = productsList.get(i);
                if (id == products.getId()) {
                    checkId = true;
                    System.out.println("Id trùng. Nhập lại");
                    System.out.println("Nhập id");
                    id = Integer.parseInt(scanner.nextLine());
                }
            }
            if (checkId) {
                System.out.println("Nhập tên");
                name = scanner.nextLine();
                System.out.println("Nhập giá");
                price = Integer.parseInt(scanner.nextLine());
                if (id > 0 && !name.equals(" ") && price > 0) {
                    System.out.println("Thêm thành công");
                    productsList.add(new Product(id, name, price));
                } else {
                    System.out.println("Thất bại, các trường k được để trống");
                }
            }
            break;
        } while (true);

    }

    public void editProduct() {
        int id;
        String name;
        int price;
        Product product = null;
        boolean checkId = false;
        do {
            System.out.println("Nhập id của sản phẩm muốn chỉnh sửa");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < productsList.size(); i++) {
                Product products = productsList.get(i);
                if (id == products.getId()) {
                    checkId = true;
                    System.out.println("Nhập id mới");
                    products.setId(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập tên mới");
                    products.setProductName(scanner.nextLine());
                    System.out.println("Nhập giá mới");
                    products.setPrice(Integer.parseInt(scanner.nextLine()));
                }
            }
            if (!checkId) {
                System.out.println("ID không tồn tại");
            }
            break;
        } while (true);
    }

    public void searchProduct() {
        String inputName;
        boolean checkName = false;
        System.out.println("Nhập tên cần tìm kiếm");
        inputName = scanner.nextLine();
        for (int i = 0; i < productsList.size(); i++) {
            Product products = productsList.get(i);
            if (products.getProductName().equals(inputName)) {
                checkName = true;
                System.out.println("Tìm thấy: " + products);
                break;
            }
        }
        if (!checkName) {
            System.out.println("Không tìm thấy sản phẩm " + inputName);
        }

    }

    public void sortUpProduct() {
        productsList.sort(Product::compareTo);
    }

    public void sortDownProduct() {
        productsList.sort(Product::compare);
    }

    public void deleteProduct() {
        int id;
        boolean yesNo;
        String choice;
        System.out.println("Nhập id sản phẩm muốn xóa");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            Product products = productsList.get(i);
            if (products.getId() == id) {
                System.out.println("Xác nhận xóa " + products + " ấn yes, no để hủy");
                choice = scanner.nextLine();
                if (choice.equals("yes")) {
                    productsList.remove(products);
                } else {
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ProductLinkedList productLinkedList = new ProductLinkedList();
        int choice;
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1.Hiển thị danh sách sản phẩm \n" +
                    "2.Thêm sản phẩm \n" +
                    "3.Xóa sản phẩm \n" +
                    "4.Sửa sản phẩm \n" +
                    "5.Tìm kiếm sản phẩm \n" +
                    "6.Sắp xếp tăng dần \n" +
                    "7.Sắp xếp giảm dần \n" +
                    "8.Thoát");
            System.out.println("Chọn chức năng");
            choice = Integer.parseInt(scanner1.nextLine());
            switch (choice) {
                case 1:
                    productLinkedList.displayList();
                    break;
                case 2:
                    productLinkedList.addProduct();
                    break;
                case 3:
                    productLinkedList.deleteProduct();
                    break;
                case 4:
                    productLinkedList.editProduct();
                    break;
                case 5:
                    productLinkedList.searchProduct();
                    break;
                case 6:
                    productLinkedList.sortUpProduct();
                    break;
                case 7:
                    productLinkedList.sortDownProduct();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        } while (true);
    }

}
