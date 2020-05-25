package file.path.demo;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(    sum(3));
    }

    private static int sum(int n) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
