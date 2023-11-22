import java.util.*;
import java.util.regex.Pattern;
//    public static void main(String args[]){
////        String s = "abcd";
////        System.out.println(s.length());
//        int[]a = {1,2,3,4,5,6,6};
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < a.length; i++) {
//            set.add(a[i]);
//        }
//        TreeSet<Integer> treeSet = new TreeSet<>(set);
//        for (Integer i: treeSet){
//            System.out.print(i+" ");
//        }
//
//    }
//    private static String inputEmail() {
//        System.out.println("nhập email");
//        Scanner scanner = new Scanner(System.in);
//        boolean checkEmail;
//        String email;
//        String[]lengthName;
//        do {
//            email = scanner.nextLine();
//            checkEmail = Pattern.matches("^[a-zA-Z][\\w-]*@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$", email);
//            if (!checkEmail) {
//                System.out.println("Email không đúng");
//            }else {
//                lengthName = email.split("@");
//                if (lengthName[0].isEmpty() || lengthName[0].length()>50){
//                    checkEmail = false;
//                }
//            }
//        } while (!checkEmail);
//        return email;
class OverloadingCalculation2{
    byte sum(byte a,byte b){
        System.out.println("phuong thuc long arg duoc trieu hoi");
        return 0;}
    int sum(int c,int b){
        System.out.println("phuong thuc int arg duoc trieu hoi");
    return 0;
    }


    public static void main(String args[]){
        OverloadingCalculation2 obj=new OverloadingCalculation2();
        obj.sum(20,20); //Bay gio phuong thuc int arg sum() duoc trieu hoi
    }
}