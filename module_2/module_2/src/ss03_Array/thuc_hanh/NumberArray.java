package ss03_Array.thuc_hanh;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Nhập độ dài mảng: ");
            length = Integer.parseInt(scanner.nextLine());
            if (length > 20) {
                System.out.println("Độ dài mảng nhỏ hơn 20");
            }
        } while (length > 20);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        int max = array[0];
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.print("\nMax: " + max);

    }
}
