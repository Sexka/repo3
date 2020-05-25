package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl0 implements Runnable {
    private static int ticket = 100;
    Object obj = new Object();
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            //synchronized (obj) {//第一种方法synchronized
            try {
                Thread.sleep(10);
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
                /*if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }*/
            //}
        }
    }

    /*public static synchronized void method() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }*/
}
