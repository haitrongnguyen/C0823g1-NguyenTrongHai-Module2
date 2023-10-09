package ss02_LoopInJava.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of month");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter annual interest rate in percentage");
        double interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i=0;i<month;i++){
            totalInterest += money*(interestRate/100)/12*month;
        }
        System.out.println("Total of interest: "+totalInterest);

    }
}
