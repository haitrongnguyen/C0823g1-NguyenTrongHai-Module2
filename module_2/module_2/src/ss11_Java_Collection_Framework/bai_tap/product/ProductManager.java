package ss11_Java_Collection_Framework.bai_tap.product;

import java.util.*;

public class ProductManager {
    static List<Product> productsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addProduct() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String productName = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,productName,price);
        productsList.add(product);
    }
    public void displayProduct(){
        for (Product p: productsList){
            System.out.println(p.toString());
        }
    }
    public void deleteProduct(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            Product product = productsList.get(i);
            if (id == product.getId()){
                System.out.println("Muốn xóa "+product+" nhập y, hủy nhập n");
                String yesNo = scanner.nextLine();
                if (Objects.equals(yesNo, "y")){
                    productsList.remove(product);
                }

            }
        }
    }
    public void editProduct(){
        System.out.println("Nhập id mặt hàng");
        int editId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            int idProduct = productsList.get(i).getId();
            if (idProduct == editId){
                System.out.println("Nhập id mới");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhâpj tên mới");
                String newName = scanner.nextLine();
                System.out.println("Nhập giá mới");
                int newPrince = Integer.parseInt(scanner.nextLine());
                Product product = new Product(newId,newName,newPrince);
                productsList.add(product);
            }
        }
        displayProduct();
    }
    public void displayMenu(){
        System.out.println("List");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mặt hàng");
        System.out.println("3. Xóa mặt hàng");
        System.out.println("4. Sửa mặt hàng theo Id");
        System.out.println("5. Thoát");
        int choice;
        System.out.println("Nhập lựa chọn");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1: displayProduct();break;
            case 2: addProduct();break;
            case 3: deleteProduct();break;
            case 4: editProduct();
            case 5: System.exit(0);
        }
    }
}
