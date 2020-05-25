package Demo06.Thread;

public class Demo01Thread {
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        d.setName("Rika");
        d.start();
        new Thread(new RunnableImpl()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
