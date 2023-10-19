package test_interface_classabstract;

public class Test {
    public long speak(int a){
       return a;
    }
    public long speak(long a){
        return a;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.speak(1));
        System.out.println(test.speak(1));
    }
}
