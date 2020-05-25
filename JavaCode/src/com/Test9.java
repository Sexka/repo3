package com;

public class Test9 {
    public static void main(String[] args) {
        Students s = new Students();
        s.setName("XYQ");
        //s.setScore(-99);
        //System.out.println("她叫"+s.getName()+"考了"+s.getScore()+"分数");
        Students s1 = new Students("迪丽热巴",-10);
        System.out.println(s1);
    }
}
