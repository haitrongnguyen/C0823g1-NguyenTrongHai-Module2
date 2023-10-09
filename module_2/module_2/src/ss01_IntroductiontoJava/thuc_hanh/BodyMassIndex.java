package ss01_IntroductiontoJava.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng(kilogram)");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào chiều cao(met)");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight / (Math.pow(height, 2));
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "UnderWeight");
        } else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
