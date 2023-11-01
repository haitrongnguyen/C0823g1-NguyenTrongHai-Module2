package ss19_string_regex.bai_tap.class_name;

import ss19_string_regex.bai_tap.class_name.ClassName;

public class ClassNameTest {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        String[] strings = {"C0223G", "A0323K", "M0318G", "P0323A"};
        boolean checkName;
        for (String s : strings) {
            checkName = className.checkName(s);
            System.out.println("Class name " + s + " is valid: " + checkName);
        }

    }
}