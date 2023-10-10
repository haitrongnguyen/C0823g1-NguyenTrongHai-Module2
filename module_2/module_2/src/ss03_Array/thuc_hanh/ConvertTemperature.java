package ss03_Array.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double fahrenheit;
        double celsius;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter the choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println(fahrenheit + " F = " + fahrenheitToCelsius(fahrenheit) + " C");
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    celsius = Double.parseDouble(scanner.nextLine());
                    System.out.println(celsius + " C = " + fahrenheitToCelsius(celsius) + " F");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
