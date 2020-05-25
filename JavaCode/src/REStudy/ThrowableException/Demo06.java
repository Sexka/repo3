package REStudy.ThrowableException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) {
        try {
            readFile("C:\\a.tt");
        } catch (IOException e
        ) {
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
        e.printStackTrace();
        }
    }

    public static void readFile(String fileName) throws IOException {

        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件路劲不对");

        }
        System.out.println("没有问题读取文件");
    }
}
