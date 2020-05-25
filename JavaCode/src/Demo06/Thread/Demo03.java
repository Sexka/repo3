package Demo06.Thread;

import static java.lang.Thread.sleep;

public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
        Thread.sleep(1000);
        }
    }
}
