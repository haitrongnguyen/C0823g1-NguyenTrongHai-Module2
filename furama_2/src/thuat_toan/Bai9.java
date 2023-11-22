package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[]arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập giá trị phần tử thứ "+(i+1)+": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int average = sum/length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==average){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("Số lần xuẩt hiện của "+average+" là "+count);
    }
}
