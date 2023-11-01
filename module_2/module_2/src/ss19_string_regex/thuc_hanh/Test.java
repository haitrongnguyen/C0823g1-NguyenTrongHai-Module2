package ss19_string_regex.thuc_hanh;

public class Test {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com.vn", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    //    public static void main(String[] args) {
//        emailExample = new EmailExample();
//        boolean isValid;
//        for (String email : validEmail) {
//            isValid = emailExample.emailExample(email);
//            System.out.println("Email: " + email + " is valid: " + isValid);
//        }
//        for (String email : invalidEmail) {
//            isValid = emailExample.emailExample(email);
//            System.out.println("Email: " + email + " is valid: " + isValid);
//        }
//    }
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        boolean isValidAccount;
        for (String s : validAccount) {
            isValidAccount = emailExample.emailExample(s);
            System.out.println("Account " + s + " is valid account: " + isValidAccount);
        }
        for (String s : invalidAccount) {
            isValidAccount = emailExample.emailExample(s);
            System.out.println("Account " + s + " is valid account: " + isValidAccount);
        }
    }
}
