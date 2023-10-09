package ss01_IntroductiontoJava.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Phương trình bậc nhất có dạng ax + b = c.");
        double a;
        double b;
        double c;
        double x;
        System.out.println("Nhập a = ");
        Scanner scanner = new Scanner(System.in);
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b = ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c = ");
        c = Double.parseDouble(scanner.nextLine());
        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x = (c - b) / a;
            System.out.printf("Nghiệm của Phương trình là x = %f", x);
        }
    }
}
