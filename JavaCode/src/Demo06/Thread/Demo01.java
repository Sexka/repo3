package Demo06.Thread;

import org.jetbrains.annotations.NotNull;

public class Demo01 extends Thread{
    public Demo01() {
    }

    public Demo01(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = getName();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            System.out.println(name);
        }
    }
}
