package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NowDemo {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new RunnableImpl());
    es.shutdown();
    }
}
