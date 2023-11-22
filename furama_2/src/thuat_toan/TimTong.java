package thuat_toan;

import java.util.Scanner;

public class TimTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[]arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Tổng các số lớn nhất "+(sum-min));
        System.out.println("Tổng các số lớn nhất "+(sum-max));

    }
}
