package ss19_string_regex.bai_tap.phone_number;

import ss19_string_regex.bai_tap.phone_number.PhoneNumber;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String[] strings = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        boolean checkPhoneNumber;
        for (String s : strings) {
            checkPhoneNumber = phoneNumber.checkPhoneNumber(s);
            System.out.println("Số điện thoại: " + s + " hợp lệ: " + checkPhoneNumber);
        }
    }
}
