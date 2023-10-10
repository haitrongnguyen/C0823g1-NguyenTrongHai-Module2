package ss02_LoopInJava.bai_tap;

import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to display");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int divisor = 0;
        if (number<=0) {
            System.out.println("The number is invalid");
        }else {
            for (int i = 2; true; i++) {
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
                if (count == number) {
                    break;
                }
            }
        }
    }
}
