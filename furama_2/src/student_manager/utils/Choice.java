package student_manager.utils;

import java.util.Scanner;

public class Choice {
    public static Integer checkChoice(){
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        boolean checkChoice = true;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập sai định dạng");
                checkChoice = false;
            }
        }while (!checkChoice);
        return choice;
    }
}
