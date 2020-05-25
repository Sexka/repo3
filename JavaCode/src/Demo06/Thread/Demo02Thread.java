package Demo06.Thread;

public class Demo02Thread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
