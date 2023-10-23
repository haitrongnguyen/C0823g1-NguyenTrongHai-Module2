package ss110_DSA_Stack_Queue.bai_tap.dao_nguoc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Array {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < arrayList.size(); i++) {
//            stack.push(arrayList.remove(i));
//            i--;
//        }
//        for (int i = 0; i < stack.size(); i++) {
//            arrayList.add(stack.pop());
//            i--;
//        }
//        System.out.println(arrayList);
//        System.out.println(stack);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        Integer length = Integer.parseInt(scanner.nextLine());
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int number = Integer.parseInt(scanner.nextLine());
            array[i] = number;
        }
        System.out.println("Mảng nhập vào:  " + Arrays.deepToString(array));
        Stack<Integer> stack = new Stack<>();
        for (Integer num : array) {
            stack.push(num);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            array[i] = (Integer) stack.pop();
            i++;
        }
        System.out.println("Mảng đảo ngược: " + Arrays.deepToString(array));
    }
}
