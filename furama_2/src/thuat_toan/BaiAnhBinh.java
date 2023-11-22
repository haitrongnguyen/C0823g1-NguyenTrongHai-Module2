package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class BaiAnhBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ mảng a");
        int length = Integer.parseInt(scanner.nextLine());
        int[]a = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] b = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum+=a[i];
            b[i] = sum;
        }
        System.out.println(Arrays.toString(b));
    }
}
