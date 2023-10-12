package ss04_Class_Obj.bai_tap;

public class Test1 {
    public static void main(String[] args) {
        Test test = new Test();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        System.out.println(test.start());
        System.out.println(test.getStartTime());
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(test.stop());
        System.out.println(test.getEndTime());
        System.out.println(test.getElapsedTime());
    }
}
