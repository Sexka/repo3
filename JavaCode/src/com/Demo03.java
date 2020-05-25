package com;

public class Demo03 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){

                        System.out.println("五秒之后做好包子，告知顾客吃包子");
                        obj.notify();
                    }
                }}
        }.start();
    }
}
