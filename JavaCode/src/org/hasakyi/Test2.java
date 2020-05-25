package org.hasakyi;

public class Test2 {
    public static void main(String[] args) {
        invokCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        invokCalc(120,40, (int a,int b)->{
            return a+b;
        });
    }
    public static void invokCalc(int a,int b,Calculator c){
    int sum =c.calc(a,b);
        System.out.println(sum);
    }
}
