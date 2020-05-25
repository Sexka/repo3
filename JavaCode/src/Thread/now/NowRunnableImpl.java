package Thread.now;

public class NowRunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
