package com;

public class Students {
    private String name;
    private int score;
//空参构造
    public Students() {
        super();
    }
//有参构造方法
    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }
//提供Geter和Setter方法
    public String getName() {
        return name;
    }

    public Students setName(String name) {
        this.name = name;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Students setScore(int score) {
        if (score<0){
            throw new NoScoreException("分数不能为负数"+score);
        }
        //给成员Score赋值
        this.score = score;
        return this;
    }

}
