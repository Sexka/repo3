package org.hasakyi;

public class Lambda {
    public static void main(String[] args) {
        new Thread(new RunnableImpl(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了" );
            }
        }).start();

        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"新的线程创建了" );
        }).start();
    }
}
