package thuat_toan;

public class Bai2 {
    public static boolean checkArray(int[]array){
        int length = array.length;
        boolean check = true;
        for (int i = 0; i < length/2; i++) {
            if (array[i]*array[i]!=array[length/2+i]){
                check =  false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,1,9,16};
        System.out.println(checkArray(arr));
    }
}
