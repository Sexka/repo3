package com;

public class Clock {
    public static void main(String[] args) {
        for (int i = 0; i < 999999; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
