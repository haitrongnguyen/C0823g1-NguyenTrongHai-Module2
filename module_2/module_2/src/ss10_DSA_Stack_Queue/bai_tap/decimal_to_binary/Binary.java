package ss10_DSA_Stack_Queue.bai_tap.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Integer> binary = new Stack<>();
        while (number != 0) {
            binary.push(number % 2);
            number /= 2;
        }
        System.out.print("Chuyển số thành mã nhị phân: ");
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
