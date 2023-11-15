package furama_resort.utils.exception;

import java.util.Scanner;

public class NumberFormat extends Exception{
    private static Scanner scanner = new Scanner(System.in);
    public static int checkChoice(int choice){
        boolean checkChoice;
        do {
            checkChoice = true;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Lựa chọn không hợp lệ");
                checkChoice = false;
            }
        }while (!checkChoice);
        return choice;
    }
}
