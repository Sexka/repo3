package Thread.now;

public class Theads extends Thread {
    @Override
    public void run() {
        /*for (int i = 1; i <=100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
                System.out.println("__________________________________");
            }}*/
        System.out.println("线程名字"+Thread.currentThread().getName());
        }
    }
