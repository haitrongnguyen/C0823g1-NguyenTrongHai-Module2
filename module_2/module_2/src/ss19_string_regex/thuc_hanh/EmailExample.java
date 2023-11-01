package ss19_string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String REGEX_EMAIL = "^\\w+@\\w+\\.(\\w+|\\w+\\.\\w+)$";
    private static final String REGEX_ACCOUNT = "^[\\d[a-z]_]{6,}$";

    public EmailExample() {
        //pattern = Pattern.compile(REGEX_EMAIL);
        pattern = Pattern.compile(REGEX_ACCOUNT);
    }

    public boolean emailExample(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
