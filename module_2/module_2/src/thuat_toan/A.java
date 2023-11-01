package thuat_toan;

public class A {
    public static int ucnn(int a, int b){
        while (a!=b){
            if (a>b){
                a =a-b;
            }else {
                b = b-a;
            }
        }
        return a;
    }
    public static int bcnn(int a,int b){
        return a*b/ucnn(a,b);
    }

    public static void main(String[] args) {
        System.out.println(ucnn(287,91));
    }
}
