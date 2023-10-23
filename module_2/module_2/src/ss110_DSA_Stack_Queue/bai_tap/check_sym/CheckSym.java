package ss110_DSA_Stack_Queue.bai_tap.check_sym;

import java.util.Stack;

public class CheckSym {
    public static void main(String[] args) {
        String string = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String[] arr = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arr[i] = String.valueOf(string.charAt(i));
        }
        Stack<String> bStack = new Stack<>();
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                bStack.push(arr[i]);
            }
            if (arr[i].equals(")")) {
                left++;
            }
        }
        if (bStack.size() == left) {
            System.out.println("Well");
        } else {
            System.out.println("Not well");
        }

    }
}
