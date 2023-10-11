package ss03_Array.bai_tap;

import java.util.Scanner;

public class SumInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row (row = column)");
        int m = Integer.parseInt(scanner.nextLine());
        int n = m;
        int[][] array2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter number in row " + (i + 1) + " column " + (j + 1));
                array2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Square matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(array2D[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    sum += array2D[i][j];
                }
            }
        }
        System.out.println("Sum of the numbers on the main diagonal: " + sum);
    }
}
