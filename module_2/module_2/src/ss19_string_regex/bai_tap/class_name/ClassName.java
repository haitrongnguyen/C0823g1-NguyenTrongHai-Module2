package ss19_string_regex.bai_tap.class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {

    private final Pattern pattern;

    public boolean checkName(String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public ClassName() {
        String CLASS_NAME = "^[CAP]\\d{4}[GHIK]$";
        pattern = Pattern.compile(CLASS_NAME);
    }
}
