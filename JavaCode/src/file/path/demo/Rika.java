package file.path.demo;

public class Rika {
    public static void main(String[] args) {
        System.out.println(demo1(4));
    }

    public static int demo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * demo1(n - 1);
    }
}
