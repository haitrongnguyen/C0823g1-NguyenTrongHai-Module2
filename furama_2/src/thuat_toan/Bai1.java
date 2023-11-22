package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int countEvenNumber = 0;
        int countOddNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa tạo");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                countEvenNumber++;
            }else {
                countOddNumber++;
            }
        }
        if (countEvenNumber==countOddNumber){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }
    }
}
