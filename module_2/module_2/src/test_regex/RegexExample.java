package test_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    private static final String REGEX_SDT = "^[0-9]{10}";
    private static final String REGEX_DATE = "((0\\d|\\d|[12]\\d|3[01])/(\\d|0\\d|1[0-2])/[12]\\d{3})";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String phone = scanner.nextLine();
        Pattern pattern = Pattern.compile(REGEX_DATE);
        Matcher matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
}
