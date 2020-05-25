package file.path.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        demo7();

    }

    private static void demo7() {
        File f = new File("D:\\HelloWorld\\app\\src\\main\\res");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void demo6() {
        File f = new File("G:\\WpSystem");
        boolean delete = f.delete();
        System.out.println(delete);
    }


    private static void demo5() throws IOException {
        File f = new File("G:\\Game\\我的世界光影\\新建文件夹");
        boolean newFile = f.createNewFile();
        System.out.println(newFile);

    }

    private static void demo4() {
        File f = new File("G:\\Game\\我的世界光影");
        boolean file = f.isFile();
        boolean directory = f.isDirectory();
        System.out.println(directory);
        boolean exists = f.exists();
        System.out.println(exists);
        System.out.println(file);
    }

    private static void demo3() {
        File file = new File("G:\\Game\\我的世界光影\\Play Game.exe");
        File file1 = new File("G:\\Game\\我的世界光影\\Play Game.ex");
        long length = file.length();
        long length1 = file1.length();
        System.out.println(length);
        System.out.println(length1);
    }

    private static void demo2() {
        File file = new File("G:\\视频\\阶段01.javase基础+高级\\09.网络编程\\03.综合案例_文件上传");
        String path = file.getPath();
        System.out.println(path);
        File file1 = new File("licenses.txt");
        String path1 = file1.getPath();
        System.out.println(path1);
        //System.out.println(file);
        System.out.println(file.toString());
        long length = file.length();
        System.out.println(length);
    }


    private static void demo() {
        File file = new File("G:\\视频\\阶段01.javase基础+高级\\09.网络编程\\03.综合案例_文件上传");
        String name = file.getName();
        System.out.println(file.getAbsoluteFile());
        System.out.println(name);
        File file1 = new File("licenses.txt");
        System.out.println(file1.getAbsoluteFile());
    }
}
