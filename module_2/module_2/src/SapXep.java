public class SapXep {
    int[] solution(int[] a) {
        int min;
        int temp;
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            if (a[i] == -1){
                continue;
            }
            for (int j = i; j < a.length-i; j++) {
                if (a[j]<min){
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }
        return a;
    }


}
