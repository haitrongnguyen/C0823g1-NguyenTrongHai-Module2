package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[]a = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (j*j == a[i]){
                    System.out.println("Số chính phương"+a[i]+" ");
                }
            }
        }

    }
}
