package ss12_thuat_toan_tim_kiem.bai_tap.max_character;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UpString {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 chuỗi");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LinkedList<Character> chars = new LinkedList<>();
        chars.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > chars.getLast()) {
                chars.add(str.charAt(i));
            }
        }
        for (Character ch : chars) {
            System.out.print(ch);
        }
    }
}
/*
 * Độ phức tạp của bài toán
 * 5*O(1)
 * O(n)
 * C1
 * O(m)
 * */
