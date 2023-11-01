package thuat_toan;

public class T3 {
    public static int vv(int a,int b,int c){
        int i =0;

        while (a*i + b * i <= c){
            i++;
        }
        return (i+1)*a;
    }

    public static void main(String[] args) {
        System.out.println(vv(3,2,11));
    }
}
