import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Misson {
    private int deadLine;
    private int time;

    public Misson(int deadLine, int time) {
        this.deadLine = deadLine;
        this.time = time;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static void main(String[] args) {
        List<Misson> missons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhiệm vụ");
        int misson = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < misson; i++) {
            System.out.println("Nhiệm vụ " + (i + 1));
            System.out.println("Nhập thời gian để hoàn thành: ");
            int deadLine = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập thời gian thực tế: ");
            int time = Integer.parseInt(scanner.nextLine());
            missons.add(new Misson(deadLine, time));
        }
        int deadLine = 0;
        int time = 0;
        int min = 0;
        String outMaxMisson = null;
        for (Misson misson1 : missons) {
            deadLine += misson1.getDeadLine();
            time += misson1.getTime();
            if ((misson1.getDeadLine() - misson1.getTime()) >= min) {
                min = misson1.getDeadLine() - misson1.getTime();
                outMaxMisson = misson1.getDeadLine() + "-" + misson1.getTime();
            }
        }
        System.out.println("Phần thưởng là " + (deadLine - time));
        System.out.println("Cặp nhiệm vụ có nhiều điểm nhất là " + outMaxMisson);
    }
}
