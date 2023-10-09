package ss01_IntroductiontoJava.bai_tap;

import java.util.Scanner;

public class HienThiTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter the name: ");
        name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
