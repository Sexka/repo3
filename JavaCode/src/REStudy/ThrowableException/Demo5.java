package REStudy.ThrowableException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        readFile("C:\\a.exe");
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("C:\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是C:\\a.txt");
        }
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件路劲不对");
        }
        System.out.println("没有问题读取文件");
    }
}
