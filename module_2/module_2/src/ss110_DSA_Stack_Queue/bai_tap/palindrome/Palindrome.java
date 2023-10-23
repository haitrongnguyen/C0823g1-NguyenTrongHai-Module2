package ss110_DSA_Stack_Queue.bai_tap.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] arrChar = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrChar[i] = String.valueOf(str.charAt(i));
        }
        for (String character : arrChar) {
            stack.push(character);
        }
        for (String character : arrChar) {
            queue.add(character);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean checkPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                checkPalindrome = false;
                break;
            }
        }
        if (checkPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
