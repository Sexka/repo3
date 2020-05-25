package Thread.now;

public class LambdaImpl {
    public static void main(String[] args) {
        //使用匿名实现类的方法实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        //使用Lambda表达式实现多线程
        new Thread(()->
            System.out.println(Thread.currentThread().getName())).start();
    }
}
