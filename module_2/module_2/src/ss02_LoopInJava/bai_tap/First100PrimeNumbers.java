package ss02_LoopInJava.bai_tap;

public class First100PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
