package ss14_Exception_Debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x,int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng x+y = "+a);
            System.out.println("Hiệu x-y = "+b);
            System.out.println("Tích x*y = "+c);
            System.out.println("Thương x/y = "+d);

        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập b: ");
        int b = Integer.parseInt(scanner.nextLine());
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(a,b);

    }
    
}
