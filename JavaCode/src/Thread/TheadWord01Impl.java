package Thread;

public class TheadWord01Impl implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
