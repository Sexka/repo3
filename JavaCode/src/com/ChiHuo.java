package com;

public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
       while (true){
           synchronized (bz){
               if (bz.flag==false){
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子");
               bz.flag=false;

           bz.notify();
           System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子吃完了开始生产包子啦");
           System.out.println("_________________________________________");
       }}
    }
}
