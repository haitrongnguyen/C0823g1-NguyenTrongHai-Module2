package ss19_string_regex.bai_tap.test;

import java.util.regex.Pattern;

public class ClassNameCheck {
    public static void main(String[] args) {
        String[] strings = {"C0223G", "A0323K", "M0318G", "P0323A"};
        checkClassName(strings);
    }

    private static void checkClassName(String[] arr) {
        boolean checkClassName;
        for (String string : arr) {
            checkClassName = Pattern.matches("^[CAP]\\d{4}[GHIK]$", string);
            System.out.println("Class name " + string + " is valid: " + checkClassName);
        }
    }
}
