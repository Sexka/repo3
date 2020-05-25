package file.path.demo;

import java.io.File;

public class Sexka1 {
    public static void main(String[] args) {
    getAllFile(new File("G:\\视频\\"));
    }
    public static void  getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
        if (file.isDirectory()){
            getAllFile(file);
        }else {
            /*String name = file.toString();
            boolean b = name.endsWith(".flv");
            if (b==true){
                System.out.println(name);

            }*/
            //System.out.println(file);
            if (file.toString().toLowerCase().endsWith(".flv")){
                System.out.println(file);
            }
        }
        }
    }
}
