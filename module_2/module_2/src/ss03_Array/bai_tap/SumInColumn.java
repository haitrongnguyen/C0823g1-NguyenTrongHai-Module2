package ss03_Array.bai_tap;

import java.util.Scanner;

public class SumInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row in matrix");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the column in matrix");
        int n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element in row " + (i + 1) + " column " + (j + 1));
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Your array 2D: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int column;
        do {
            System.out.println("Column you want to sum");
            column = Integer.parseInt(scanner.nextLine());
            if (column > n) {
                System.out.println("Invalid number,Column < " + n);
            }
        } while (column > n);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += array[i][column];
        }
        System.out.println("Sum = " + sum);
    }
}