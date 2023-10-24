package ss11_Java_Collection_Framework.bai_tap.product_manager.view;

import ss11_Java_Collection_Framework.bai_tap.product_manager.controller.ProductController;

import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1. Xem danh sách sản phẩm. \n" +
                    "2. Thêm sản phẩm \n" +
                    "3. Sửa sản phẩm(theo Id) \n" +
                    "4. Xóa sản phẩm(theo Id)\n" +
                    "5. Sắp xếp giảm dần\n" +
                    "6. Sắp xếp tăng dần\n" +
                    "8. Thoát");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productController.showProduct();
                    break;
                case 2:
                    productController.addProduct();
                    break;
                case 3:
                    productController.editProduct();
                    break;
                case 4:
                    productController.deleteProduct();
                    break;
                case 5:
                    productController.sortDownProduct();
                    break;
                case 6:
                    productController.sortUpProduct();
                    break;
                case 7:
                    productController.searchProduct();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }
}
