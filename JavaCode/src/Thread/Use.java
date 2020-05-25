package Thread;

public class Use {
    public static void main(String[] args) {
        RunnableImpl0 run = new RunnableImpl0();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
