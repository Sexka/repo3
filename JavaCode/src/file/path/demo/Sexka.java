package file.path.demo;

import java.io.File;

public class Sexka {
    public static void main(String[] args) {
    getAllFile(new File("G:\\视频\\"));
    }
    public static void  getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
        if (file.isDirectory()){
            getAllFile(file);
        }else {
            System.out.println(file);
        }
        }
    }
}
