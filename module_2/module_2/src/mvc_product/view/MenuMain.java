package mvc_product.view;

import mvc_product.controllers.ProductController;
import mvc_product.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---------Menu--------\n" +
                    "1. Quản lý sản phẩm\n" +
                    "2. Quản lý khách hàng\n" +
                    "3. Quản lý Nhân viên\n" +
                    "0. Thoát");
            System.out.print("Nhập chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuProduct();
                    break;
            }
        } while (true);
    }

    private static void menuProduct() {
        int choice;
        Integer id;
        Product product;
        do {
            System.out.println("-------- Menu sản phẩm -------\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Cập nhật sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Danh sách sắp xếp theo giá\n" +
                    "0. Trở lại");
            System.out.println("Chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Product> products = productController.getAll();
                    if (products.isEmpty()) {
                        System.out.println("Không có sản phẩm nào!");
                    } else {
                        System.out.println("Danh sách sản phẩm");
                        for (Product productTemp : products) {
                            System.out.println(productTemp);
                        }
                    }
                    break;
                case 2:
                    do {
                        id = inputId();
                        if (!productController.checkId(id)) {
                            product = inputInformation();
                            product.setId(id);
                            productController.addProduct(product);
                            System.out.println("Thêm thành công");
                        } else {
                            System.out.println("Id đã tồn tại");
                        }
                    } while (productController.checkId(id));

                    break;
                case 3:
                    id = inputId();
                    Boolean isSuccess = productController.removeProduct(id);
                    if (isSuccess) {
                        System.out.println("Xác nhận xóa nhập yes, hủy nhập no");
                        String yesNo = scanner.nextLine();
                        if (yesNo.equals("yes")) {
                            System.out.println("Xóa thành công");
                        }
                    } else {
                        System.out.println("Id không tồn tại");
                    }
                    break;
                case 4:
                    id = inputId();
                    if (productController.checkId(id)) {
                        product = inputInformation();
                        Boolean isUpdate = productController.editProduct(id, product.getName(), product.getPrice());
                        System.out.println("Cập nhật thành công");
                    } else {
                        System.out.println("Cập nhật không thành công, Id không tồn tại");
                    }
                    break;
                case 5:
                    String name = inputName();
                    List<Product> productList = productController.searchByName(name);
                    if (productList.isEmpty()) {
                        System.out.println("Không tìm thấy sản phẩm tương tự");
                    } else {
                        for (Product product1 : productList) {
                            System.out.println(product1);
                        }
                    }
                    break;
                case 6:
                    System.out.println("-----Sắp xếp theo thứ tự----\n" +
                            "1. Tăng dần\n" +
                            "2. Giảm dần");
                    System.out.print("Chọn chức năng: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            List<Product> productList1 = productController.sortUpProduct();
                            System.out.println("---Giá tăng dần----");
                            for (Product product1 : productList1) {
                                System.out.println(product1);
                            }
                            break;
                        case 2:
                            List<Product> productList2 = productController.sortDownProduct();
                            System.out.println("---Giá giảm dần----");
                            for (Product product1 : productList2) {
                                System.out.println(product1);
                            }
                            break;
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Không có chức năng tương ứng");

            }
        } while (true);
    }

    private static String inputName() {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        return scanner.nextLine();
    }


    private static Product inputInformation() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Long price = Long.parseLong(scanner.nextLine());
        return new Product(name, price);
    }

    private static Integer inputId() {
        Integer id;
        System.out.println("Nhập id sản phẩm");
        id = Integer.parseInt(scanner.nextLine());
        return id;
    }
}
