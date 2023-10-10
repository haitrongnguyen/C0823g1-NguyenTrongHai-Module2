package ss03_Array.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the element to delete");
        int element = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int k : array) {
            if (k == element) {
                check = true;
                System.out.println("Found " + element);
            }
        }
        if (check) {
            System.out.println("New Array: \n");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    array[array.length - 1] = 0;
                }
                System.out.printf(array[i] + "\t");
            }
        } else {
            System.out.println("Not found");
        }

    }
}
