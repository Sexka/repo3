package Thread.now;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {
    public static void main(String[] args) {
        NowRunnableImpl n = new NowRunnableImpl();
        new Thread(n).start();
        System.out.println("______________________________________________");
        Runnable ra = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(n).start();
        System.out.println("______________________________________________");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
