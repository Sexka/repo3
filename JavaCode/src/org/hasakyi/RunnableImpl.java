package org.hasakyi;

public class RunnableImpl implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新的线程创建了" );
    }
}
