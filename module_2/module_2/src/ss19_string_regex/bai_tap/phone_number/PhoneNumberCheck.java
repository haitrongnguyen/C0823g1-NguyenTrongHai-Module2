package ss19_string_regex.bai_tap.phone_number;

import java.util.regex.Pattern;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        String[] phoneNumber = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        checkPhoneNumber(phoneNumber);
    }

    private static void checkPhoneNumber(String[] arr) {
        boolean checkPhoneNumber;
        for (String string : arr) {
            checkPhoneNumber = Pattern.matches("^\\(\\d{2}\\)-\\(0\\d{9}\\)$", string);
            System.out.println("Phone number " + string + " is valid: " + checkPhoneNumber);
        }
    }
}
