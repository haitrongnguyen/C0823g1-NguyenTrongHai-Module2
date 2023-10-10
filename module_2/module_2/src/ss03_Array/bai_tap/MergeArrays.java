package ss03_Array.bai_tap;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter length of array 1: ");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Enter element in the position " + (i + 1));
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array 1: ");
        for (int j : array1) {
            System.out.printf(j + "\t");
        }
        System.out.println("\nEnter length of array 2: ");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] array2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.println("Enter element in the position " + (i + 1));
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Array 2: ");
        for (int j : array2) {
            System.out.printf(j + "\t");
        }
        int length3 = length1 + length2;
        int[] array3 = new int[length3];
        System.out.println("\nNew array = arr1 + arr2:");
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.printf(array3[i] + "\t");
        }

    }
}
