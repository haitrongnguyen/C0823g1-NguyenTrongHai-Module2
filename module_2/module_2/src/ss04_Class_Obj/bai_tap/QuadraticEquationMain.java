package ss04_Class_Obj.bai_tap;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The quadratic equation has the form: ax^2+bx+c");
        System.out.print("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            double x = quadraticEquation.getRoot1();
            System.out.println("Quadratic equations have double solutions x = " + x);
        } else {
            double x1 = quadraticEquation.getRoot1();
            double x2 = quadraticEquation.getRoot2();
            System.out.println("Quadratic equations have 2 roots: \n" + "x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
