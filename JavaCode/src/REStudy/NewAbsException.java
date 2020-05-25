package REStudy;

import REStudy.ThrowableException.AbsEXception;

import java.util.Scanner;

public class NewAbsException {
    static String[] username = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String username = sc.next();
        checkUserName(username);
    }

    public static void checkUserName(String usernames){
        for (String name : username) {
             if (name.equals(usernames)){
                 try {
                     throw new AbsEXception("用户名已经被注册啦！");
                 } catch (AbsEXception absEXception) {
                     absEXception.printStackTrace();
                     return;
                 }
             }
        }
        System.out.println("注册成功");

    }
}
