package ss04_Class_Obj.bai_tap;

public class StopWatchMain {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
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
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + " ms");
    }
}
