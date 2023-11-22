import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[]a = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập số nguyên n");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i == j){
                    continue;
                }
                else if (a[i] == a[j]){
                    continue;
                }else {
                    if (a[i]+a[j]==n){
                        System.out.println("hai số nằm ở vị trí thứ "+i +" và thứ "+j);
                    }
                }
            }
        }
    }
}
