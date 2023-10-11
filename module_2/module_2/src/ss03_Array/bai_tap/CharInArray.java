package ss03_Array.bai_tap;

import java.util.Scanner;

public class CharInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.nextLine();
        char[] charStr = str.toCharArray();
        System.out.println("Enter the char");
        char inputChar = scanner.nextLine().charAt(0);
        int count = 0;
        boolean check = false;
        for (char c : charStr) {
            if (inputChar == c) {
                count++;
                check = true;
            }
        }
        if (check) {
            System.out.println("The number of occurrences of the character " + inputChar + " is " + count);
        } else {
            System.out.println("Not found character " + inputChar);
        }

    }
}
