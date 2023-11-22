package student.utils.exception;

import java.util.Scanner;

public class NumberFormat {
    public static int checkNumber(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean checkNumber = true;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Vui lòng nhập số");
                checkNumber = false;
            }
        }while (!checkNumber);
        return choice;
    }
}
