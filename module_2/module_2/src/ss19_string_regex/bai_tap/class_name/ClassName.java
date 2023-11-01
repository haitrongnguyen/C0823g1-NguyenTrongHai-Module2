package ss19_string_regex.bai_tap.class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public boolean checkName(String str) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
