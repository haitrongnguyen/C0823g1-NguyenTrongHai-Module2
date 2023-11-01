package thuat_toan;

public class C {
    public static boolean snt(int a){
        if (a<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(snt(101));
    }
}
