package ss03_Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray2D {
    public static void main(String[] args) {
//        int[][]array = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row in the matrix");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter column in the matrix");
        int n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element in row " + (i + 1) + " column " + (j + 1));
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Your array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
//        System.out.println("Array: "+Arrays.deepToString(array));
        int max = array[0][0];
        int row = 0;
        int cols = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    cols = j;
                }
            }
        }
        System.out.println("The largest element in the array is " + max + " in row " + (row + 1) + " column " + (cols + 1));
    }
}
