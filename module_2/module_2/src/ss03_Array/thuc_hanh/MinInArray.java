package ss03_Array.thuc_hanh;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }
        System.out.println("\nThe smallest element in array is " + min + " in the position " + index);
    }
}
