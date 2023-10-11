package ss02_LoopInJava.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Sắp xếp giảm dần
        /*int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }*/
//        Sắp xếp giảm dần
//        int[] a = {1,9,3,2};
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] > a[j]){
//                    int x = a[i];
//                    a[i] = a[j];
//                    a[j] = x;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]+"");
//        }
        // Hiển thị số nguyên tố
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to display");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int divisor = 0;
        if (number<=0) {
            System.out.println("The number is invalid");
        }else {
//            for (int i = 2; true; i++) {
//                for (int j = 2; j <= Math.sqrt(i); j++) {
//                    if (i % j == 0) {
//                        divisor += 1;
//                    }
//                }
//                if (divisor == 0) {
//                    System.out.println(i);
//                    count += 1;
//                }
//                divisor = 0;
//                if (count == number) {
//                    break;
//                }
//            }
            int i = 2;
            while (count<number) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        divisor += 1;
                    }
                }
                if (divisor == 0) {
                    System.out.println(i);
                    count += 1;
                }
                divisor = 0;
                i++;
            }
        }
    }
}
