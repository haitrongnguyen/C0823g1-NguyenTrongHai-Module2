package ss17_io_binary_file_serialization.bai_tap.views;

import ss17_io_binary_file_serialization.bai_tap.controller.ProductController;
import ss17_io_binary_file_serialization.bai_tap.models.Product;
import ss17_io_binary_file_serialization.bai_tap.utils.validate.CheckInput;

import java.util.List;
import java.util.Scanner;

public class ProductViews {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("--Quản lí sản phẩm--\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị danh sách\n" +
                    "3. Tìm kiếm thông tin\n" +
                    "4. Thoát");
            System.out.print("Nhâp chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showListProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.exit(0);
            }


        } while (true);
    }

    private static void searchProduct() {
        String name;
        System.out.println("Nhập tên sản phẩm");
        name = scanner.nextLine();
        List<Product> products = productController.searchProduct(name);
        if (products == null) {
            System.out.println("Không có sản phẩm tương ứng");
        } else {
            System.out.println("Sản phẩm tương tự: ");
            for (Product product1 : products) {
                System.out.println(product1);
            }
        }
    }

    private static void showListProduct() {
        List<Product> productList = productController.getAll();
        for (Product product1 : productList) {
            System.out.println(product1);
        }
    }

    private static void addProduct() {
        int code;
        boolean checkCode;
        Product product;
        do {
            code = inputCode();
            checkCode = productController.checkCode(code);
            if (checkCode) {
                System.out.println("Id đã tồn tại. Nhập lại");
            }
        } while (checkCode);
        product = inputInfoProduct();
        product.setCode(code);
        productController.addProduct(product);
        System.out.println("Thêm thành công");
    }

    private static Product inputInfoProduct() {
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập mô tả");
        String productDescription = scanner.nextLine();
        return new Product(name, price, manufacturer, productDescription);
    }

    private static int inputCode() {
        int code = 0;
        boolean checkCode;
        do {
            checkCode = true;
            try {
                System.out.println("Nhập code: ");
                code = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                checkCode = false;
                System.err.println("Code phải là số");
            }
        }while (!checkCode);
        return code;
    }
}
