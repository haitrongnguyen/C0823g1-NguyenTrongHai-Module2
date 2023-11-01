package ss19_string_regex.bai_tap.phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    private final Pattern pattern;

    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean checkPhoneNumber(String string) {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
