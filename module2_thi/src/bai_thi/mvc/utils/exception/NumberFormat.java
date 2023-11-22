package bai_thi.mvc.utils.exception;

import java.util.Scanner;

public class NumberFormat {
    public static int checkNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean checkNumber = true;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Bạn phải nhập số");
                checkNumber = false;
            }
        }while (!checkNumber);
        return number;
    }
}
