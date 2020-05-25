package Thread.now;

public class TheadWord01Impl implements Runnable {
    @Override
    /*
     *重写Run方法，完成该线程的执行逻辑
     * */
    public void run() {
        /*for (int i = 1; i <=100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
            }*/
        System.out.println("线程名字" + Thread.currentThread().getName());
    }
}
