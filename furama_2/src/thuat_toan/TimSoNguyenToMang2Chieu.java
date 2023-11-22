package thuat_toan;

import java.util.*;

public class TimSoNguyenToMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập độ dài cột");
        int n = Integer.parseInt(scanner.nextLine());
        int[][]arr = new int[m][n];
        Set<Integer> integers = new TreeSet<>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử thứ" +i+" cột "+j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                for (int k = 1; k <= arr[i][j]; k++) {
                    if (arr[i][j]%k==0){
                        count++;
                    }
                }
                if (count==2){
                    integers.add(arr[i][j]);
                }
                count=0;
            }
        }
        for (Integer i : integers){
            System.out.print(i+" ");
        }


    }
}
