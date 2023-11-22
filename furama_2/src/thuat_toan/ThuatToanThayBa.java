package thuat_toan;

import java.util.Scanner;

public class ThuatToanThayBa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số bút mua");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Số bút km");
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println("Số bút mang về");
        int mv = Integer.parseInt(scanner.nextLine());
        int mua;
//        if (m+km==mv){
//            System.out.println(m);
//        }
        int count = (mv / (m + km));
        mua = mv - count*(m+km);
        if (mua == 0){
            System.out.println(m*count);
        }else {
            System.out.println(mv-count*km);
        }
    }
}

