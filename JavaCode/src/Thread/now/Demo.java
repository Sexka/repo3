package Thread.now;

public class Demo {
    public static void main(String[] args) {
        TheadWord01Impl th = new TheadWord01Impl();
        Theads t = new Theads();
        new Thread(th).start();
        t.start();
        /*for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }*/
        System.out.println("主线程名字" + Thread.currentThread().getName());
    }
}
