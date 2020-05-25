package com;

public class Demo01 {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true){
                synchronized (obj) {
                    System.out.println("告诉老板的包子种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已经做好了开吃");
                    System.out.println("_________________________");
                }}
            }
        }.start();
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