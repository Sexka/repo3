package Demo06.Thread;

public class Demo07 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }).start();
    }
}
