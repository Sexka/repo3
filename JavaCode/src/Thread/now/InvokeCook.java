package Thread.now;

public class InvokeCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("做面包！");
            }
        });
        invokeCook(()->{
            System.out.println("做面包！");
        });
        invokeCook(()->System.out.println("Rika"));


    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
