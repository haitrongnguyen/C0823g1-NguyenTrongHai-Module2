import java.util.*;

public class RutGonXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu: ");
        String s = scanner.next();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)!=s.charAt(i+1)){
                strings.add(String.valueOf(s.charAt(i)));
            }
        }
        strings.add(String.valueOf(s.charAt(s.length()-1)));
        for (String string : strings) {
            System.out.println(string);
        }

    }
}