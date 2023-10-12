package ss05_AccessModifier_Static.thuc_hanh;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    Student(int r,String n){
        this.rollNo = r;
        this.name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }
}
