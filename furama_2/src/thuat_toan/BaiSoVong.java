package thuat_toan;

import java.util.Scanner;

public class BaiSoVong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int i1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai");
        int i2 = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = i1; i <= i2 ; i++) {
            if (i<10){
                count+=1;
            }else {
                String s = Integer.toString(i);
                String[] strings = s.split("");
                if (strings[0].equals(strings[strings.length-1])){
                    count+=1;
                }
            }
        }
        System.out.println("Số lần: "+count);

    }
}
