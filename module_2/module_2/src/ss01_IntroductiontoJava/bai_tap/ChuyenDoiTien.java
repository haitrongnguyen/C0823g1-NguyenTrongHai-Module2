package ss01_IntroductiontoJava.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usd;
        int vnd;
        System.out.println("Nhập số USD muốn chuyển");
        usd = Integer.parseInt(scanner.nextLine());
        vnd = usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VNĐ");
    }
}
