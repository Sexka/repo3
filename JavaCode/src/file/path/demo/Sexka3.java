package file.path.demo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Sexka3 {
    public static void main(String[] args) {

        getAllFile(new File("G:\\视频\\"));
    }

    public static void getAllFile(File dir) {
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().endsWith(".flv");
            }
        });*/
        File[] files = dir.listFiles(pathname -> {
                    if (pathname.isDirectory()) {
                        return true;
                    }
                    return pathname.getName().endsWith(".flv");
                }
        );
        /*File[] files = dir.listFiles((d,name)->new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".flv") );*/
        /*File[] files = dir.listFiles((d,name)->{
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".flv");
        });*/
        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".flv");
            }
        });*/
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
