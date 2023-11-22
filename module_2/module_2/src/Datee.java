import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Datee {
    public static void main(String[] args) {
        LocalDate localTime = LocalDate.now();
        int year = localTime.getYear();
        System.out.println(year);
        String s = "12/12/1997";
        String s1 = s.substring(6);
        System.out.println(s1);
    }
}
