package ss03_Array.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int[] array = new int[length];
        while (i < length) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse Array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
        }
    }
}
