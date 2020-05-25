package Thread.now;

public class Demo01MainThread {
    public static void main(String[] args) {
       /* invokeCalc(3,4,()->{
        });*/
        invokeCalc(3, 4, new Calculator() {
            @Override
            public int Calc(int a, int b) {
                return a+b;
            }
        });
        invokeCalc(30,40   ,(int a,int b)-> a + b
        );
    }
    public static void invokeCalc(int a,int b,Calculator c){
    int sum = c.Calc(a,b);
        System.out.println(sum);
    }
}
