package ss10_DSA_Stack_Queue.bai_tap.reverse;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println("Chuỗi nhập vào: " + str);
//        Stack<String> stack1 = new Stack<>();
//        for (int j = 0; j < str.length(); j++) {
//            stack1.push(String.valueOf(str.charAt(j)));
//        }
//        while (!stack1.isEmpty()){
//            System.out.print(stack1.peek()+" ");
//            stack1.pop();
//        }
        Stack<String> mWord = new Stack<>();
        for (int j = 0; j < str.length(); j++) {
            mWord.push(String.valueOf(str.charAt(j)));
        }
        Stack<String> wStack = new Stack<>();
        System.out.print("Chuỗi đảo ngược: ");
        while (!mWord.isEmpty()) {
            wStack.push(mWord.pop());
            System.out.print(wStack.peek());
        }
    }
}