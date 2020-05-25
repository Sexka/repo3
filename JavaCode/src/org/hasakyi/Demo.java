package org.hasakyi;

public class Demo {
    public static void main(String[] args) {
    invokeCook(() -> System.out.println("吃饭了"));}
    public static void invokeCook(Cook cook){
cook.makeFood();
    }
}
