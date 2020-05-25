package org.hasakyi;

public class Runnable {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了" );
            }
        };
        new Thread(r).start();
        new Thread(new RunnableImpl(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了" );
            }
        }).start();
    }
}
