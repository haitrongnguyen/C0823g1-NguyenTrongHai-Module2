package ss04_Class_Obj.bai_tap;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.MEDIUM);
        System.out.println(fan1 + "\n" + fan2);
    }
}
