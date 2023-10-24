package ss11_Java_Collection_Framework.bai_tap.product;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice = 0;
        do {
            productManager.displayMenu();
        }while (choice !=4);
    }
}
