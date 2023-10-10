package ss03_Array.bai_tap;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        int index;
        System.out.println("\nEnter element");
        int element = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("Index of element");
            index = Integer.parseInt(scanner.nextLine());
            if (index <= -1 || index > array.length) {
                System.out.println("Can not insert element");
            }
        } while (index <= -1 || index > array.length);
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        for (int j : array) {
            System.out.printf(j + "\t");
        }

    }
}
